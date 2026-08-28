package org.telegram.messenger.time;

import aa.d;
import e2.c;
import j$.util.DesugarTimeZone;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class FastDateParser implements DateParser, Serializable {
    private static final long serialVersionUID = 2;
    private final int century;
    private transient String currentFormatField;
    private final Locale locale;
    private transient Strategy nextStrategy;
    private transient Pattern parsePattern;
    private final String pattern;
    private final int startYear;
    private transient Strategy[] strategies;
    private final TimeZone timeZone;
    static final Locale JAPANESE_IMPERIAL = new Locale("ja", "JP", "JP");
    private static final Pattern formatPattern = Pattern.compile("D+|E+|F+|G+|H+|K+|M+|L+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++");
    private static final ConcurrentMap<Locale, Strategy>[] caches = new ConcurrentMap[17];
    private static final Strategy ABBREVIATED_YEAR_STRATEGY = new NumberStrategy(1) {
        @Override
        public void setCalendar(FastDateParser fastDateParser, Calendar calendar, String str) {
            int parseInt = Integer.parseInt(str);
            if (parseInt < 100) {
                parseInt = fastDateParser.adjustYear(parseInt);
            }
            calendar.set(1, parseInt);
        }
    };
    private static final Strategy NUMBER_MONTH_STRATEGY = new NumberStrategy(2) {
        @Override
        public int modify(int i9) {
            return i9 - 1;
        }
    };
    private static final Strategy LITERAL_YEAR_STRATEGY = new NumberStrategy(1);
    private static final Strategy WEEK_OF_YEAR_STRATEGY = new NumberStrategy(3);
    private static final Strategy WEEK_OF_MONTH_STRATEGY = new NumberStrategy(4);
    private static final Strategy DAY_OF_YEAR_STRATEGY = new NumberStrategy(6);
    private static final Strategy DAY_OF_MONTH_STRATEGY = new NumberStrategy(5);
    private static final Strategy DAY_OF_WEEK_IN_MONTH_STRATEGY = new NumberStrategy(8);
    private static final Strategy HOUR_OF_DAY_STRATEGY = new NumberStrategy(11);
    private static final Strategy MODULO_HOUR_OF_DAY_STRATEGY = new NumberStrategy(11) {
        @Override
        public int modify(int i9) {
            return i9 % 24;
        }
    };
    private static final Strategy MODULO_HOUR_STRATEGY = new NumberStrategy(10) {
        @Override
        public int modify(int i9) {
            return i9 % 12;
        }
    };
    private static final Strategy HOUR_STRATEGY = new NumberStrategy(10);
    private static final Strategy MINUTE_STRATEGY = new NumberStrategy(12);
    private static final Strategy SECOND_STRATEGY = new NumberStrategy(13);
    private static final Strategy MILLISECOND_STRATEGY = new NumberStrategy(14);

    public static class CopyQuotedStrategy extends Strategy {
        private final String formatField;

        public CopyQuotedStrategy(String str) {
            super();
            this.formatField = str;
        }

        @Override
        public boolean addRegex(FastDateParser fastDateParser, StringBuilder sb2) {
            FastDateParser.escapeRegex(sb2, this.formatField, true);
            return false;
        }

        @Override
        public boolean isNumber() {
            char charAt = this.formatField.charAt(0);
            if (charAt == '\'') {
                charAt = this.formatField.charAt(1);
            }
            return Character.isDigit(charAt);
        }
    }

    public static class TextStrategy extends Strategy {
        private final int field;
        private final Map<String, Integer> keyValues;

        public TextStrategy(int i9, Calendar calendar, Locale locale) {
            super();
            this.field = i9;
            this.keyValues = FastDateParser.getDisplayNames(i9, calendar, locale);
        }

        @Override
        public boolean addRegex(FastDateParser fastDateParser, StringBuilder sb2) {
            sb2.append('(');
            for (String str : this.keyValues.keySet()) {
                FastDateParser.escapeRegex(sb2, str, false).append('|');
            }
            sb2.setCharAt(sb2.length() - 1, ')');
            return true;
        }

        @Override
        public void setCalendar(FastDateParser fastDateParser, Calendar calendar, String str) {
            Integer num = this.keyValues.get(str);
            if (num == null) {
                StringBuilder sb2 = new StringBuilder(str);
                sb2.append(" not in (");
                for (String str2 : this.keyValues.keySet()) {
                    sb2.append(str2);
                    sb2.append(' ');
                }
                sb2.setCharAt(sb2.length() - 1, ')');
                throw new IllegalArgumentException(sb2.toString());
            }
            calendar.set(this.field, num.intValue());
        }
    }

    public static class TimeZoneStrategy extends Strategy {
        private static final int ID = 0;
        private static final int LONG_DST = 3;
        private static final int LONG_STD = 1;
        private static final int SHORT_DST = 4;
        private static final int SHORT_STD = 2;
        private final SortedMap<String, TimeZone> tzNames;
        private final String validTimeZoneChars;

        public TimeZoneStrategy(Locale locale) {
            super();
            String[][] zoneStrings;
            this.tzNames = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
                if (!strArr[0].startsWith("GMT")) {
                    TimeZone timeZone = DesugarTimeZone.getTimeZone(strArr[0]);
                    if (!this.tzNames.containsKey(strArr[1])) {
                        this.tzNames.put(strArr[1], timeZone);
                    }
                    if (!this.tzNames.containsKey(strArr[2])) {
                        this.tzNames.put(strArr[2], timeZone);
                    }
                    if (timeZone.useDaylightTime()) {
                        if (!this.tzNames.containsKey(strArr[3])) {
                            this.tzNames.put(strArr[3], timeZone);
                        }
                        if (!this.tzNames.containsKey(strArr[4])) {
                            this.tzNames.put(strArr[4], timeZone);
                        }
                    }
                }
            }
            StringBuilder n10 = c.n("(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|");
            for (String str : this.tzNames.keySet()) {
                FastDateParser.escapeRegex(n10, str, false).append('|');
            }
            n10.setCharAt(n10.length() - 1, ')');
            this.validTimeZoneChars = n10.toString();
        }

        @Override
        public boolean addRegex(FastDateParser fastDateParser, StringBuilder sb2) {
            sb2.append(this.validTimeZoneChars);
            return true;
        }

        @Override
        public void setCalendar(FastDateParser fastDateParser, Calendar calendar, String str) {
            TimeZone timeZone;
            if (str.charAt(0) != '+' && str.charAt(0) != '-') {
                if (str.startsWith("GMT")) {
                    timeZone = DesugarTimeZone.getTimeZone(str);
                } else {
                    timeZone = this.tzNames.get(str);
                    if (timeZone == null) {
                        throw new IllegalArgumentException(str.concat(" is not a supported timezone name"));
                    }
                }
            } else {
                timeZone = DesugarTimeZone.getTimeZone("GMT".concat(str));
            }
            calendar.setTimeZone(timeZone);
        }
    }

    public FastDateParser(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, null);
    }

    public int adjustYear(int i9) {
        int i10 = this.century + i9;
        if (i9 >= this.startYear) {
            return i10;
        }
        return i10 + 100;
    }

    public static StringBuilder escapeRegex(StringBuilder sb2, String str, boolean z10) {
        sb2.append("\\Q");
        int i9 = 0;
        while (i9 < str.length()) {
            char charAt = str.charAt(i9);
            if (charAt != '\'') {
                if (charAt == '\\' && (i9 = i9 + 1) != str.length()) {
                    sb2.append(charAt);
                    charAt = str.charAt(i9);
                    if (charAt == 'E') {
                        sb2.append("E\\\\E\\");
                        charAt = 'Q';
                    }
                }
            } else if (z10) {
                i9++;
                if (i9 == str.length()) {
                    return sb2;
                }
                charAt = str.charAt(i9);
            } else {
                continue;
            }
            sb2.append(charAt);
            i9++;
        }
        sb2.append("\\E");
        return sb2;
    }

    private static ConcurrentMap<Locale, Strategy> getCache(int i9) {
        ConcurrentMap<Locale, Strategy> concurrentMap;
        ConcurrentMap<Locale, Strategy>[] concurrentMapArr = caches;
        synchronized (concurrentMapArr) {
            try {
                if (concurrentMapArr[i9] == null) {
                    concurrentMapArr[i9] = new ConcurrentHashMap(3);
                }
                concurrentMap = concurrentMapArr[i9];
            } catch (Throwable th) {
                throw th;
            }
        }
        return concurrentMap;
    }

    private static String[] getDisplayNameArray(int i9, boolean z10, Locale locale) {
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(locale);
        if (i9 != 0) {
            if (i9 != 2) {
                if (i9 != 7) {
                    if (i9 != 9) {
                        return null;
                    }
                    return dateFormatSymbols.getAmPmStrings();
                } else if (z10) {
                    return dateFormatSymbols.getWeekdays();
                } else {
                    return dateFormatSymbols.getShortWeekdays();
                }
            } else if (z10) {
                return dateFormatSymbols.getMonths();
            } else {
                return dateFormatSymbols.getShortMonths();
            }
        }
        return dateFormatSymbols.getEras();
    }

    private static Map<String, Integer> getDisplayNames(int i9, Locale locale) {
        HashMap hashMap = new HashMap();
        insertValuesInMap(hashMap, getDisplayNameArray(i9, false, locale));
        insertValuesInMap(hashMap, getDisplayNameArray(i9, true, locale));
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    private Strategy getLocaleSpecificStrategy(int i9, Calendar calendar) {
        Strategy textStrategy;
        ConcurrentMap<Locale, Strategy> cache = getCache(i9);
        Strategy strategy = cache.get(this.locale);
        if (strategy == null) {
            if (i9 == 15) {
                textStrategy = new TimeZoneStrategy(this.locale);
            } else {
                textStrategy = new TextStrategy(i9, calendar, this.locale);
            }
            Strategy putIfAbsent = cache.putIfAbsent(this.locale, textStrategy);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
            return textStrategy;
        }
        return strategy;
    }

    private Strategy getStrategy(String str, Calendar calendar) {
        char charAt = str.charAt(0);
        if (charAt != 'y') {
            if (charAt != 'z') {
                switch (charAt) {
                    case '\'':
                        if (str.length() > 2) {
                            return new CopyQuotedStrategy(c.m(str, 1, 1));
                        }
                        return new CopyQuotedStrategy(str);
                    case 'S':
                        return MILLISECOND_STRATEGY;
                    case 'W':
                        return WEEK_OF_MONTH_STRATEGY;
                    case 'Z':
                        break;
                    case 'a':
                        return getLocaleSpecificStrategy(9, calendar);
                    case 'd':
                        return DAY_OF_MONTH_STRATEGY;
                    case 'h':
                        return MODULO_HOUR_STRATEGY;
                    case 'k':
                        return HOUR_OF_DAY_STRATEGY;
                    case 'm':
                        return MINUTE_STRATEGY;
                    case 's':
                        return SECOND_STRATEGY;
                    case 'w':
                        return WEEK_OF_YEAR_STRATEGY;
                    default:
                        switch (charAt) {
                            case 'D':
                                return DAY_OF_YEAR_STRATEGY;
                            case 'E':
                                return getLocaleSpecificStrategy(7, calendar);
                            case 'F':
                                return DAY_OF_WEEK_IN_MONTH_STRATEGY;
                            case 'G':
                                return getLocaleSpecificStrategy(0, calendar);
                            case 'H':
                                return MODULO_HOUR_OF_DAY_STRATEGY;
                            default:
                                switch (charAt) {
                                    case 'K':
                                        return HOUR_STRATEGY;
                                    case 'L':
                                    case 'M':
                                        if (str.length() >= 3) {
                                            return getLocaleSpecificStrategy(2, calendar);
                                        }
                                        return NUMBER_MONTH_STRATEGY;
                                }
                                return new CopyQuotedStrategy(str);
                        }
                }
            }
            return getLocaleSpecificStrategy(15, calendar);
        } else if (str.length() > 2) {
            return LITERAL_YEAR_STRATEGY;
        } else {
            return ABBREVIATED_YEAR_STRATEGY;
        }
    }

    private void init(Calendar calendar) {
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        Matcher matcher = formatPattern.matcher(this.pattern);
        if (matcher.lookingAt()) {
            String group = matcher.group();
            this.currentFormatField = group;
            Strategy strategy = getStrategy(group, calendar);
            while (true) {
                matcher.region(matcher.end(), matcher.regionEnd());
                if (!matcher.lookingAt()) {
                    break;
                }
                String group2 = matcher.group();
                this.nextStrategy = getStrategy(group2, calendar);
                if (strategy.addRegex(this, sb2)) {
                    arrayList.add(strategy);
                }
                this.currentFormatField = group2;
                strategy = this.nextStrategy;
            }
            this.nextStrategy = null;
            if (matcher.regionStart() == matcher.regionEnd()) {
                if (strategy.addRegex(this, sb2)) {
                    arrayList.add(strategy);
                }
                this.currentFormatField = null;
                this.strategies = (Strategy[]) arrayList.toArray(new Strategy[arrayList.size()]);
                this.parsePattern = Pattern.compile(sb2.toString());
                return;
            }
            throw new IllegalArgumentException("Failed to parse \"" + this.pattern + "\" ; gave up at index " + matcher.regionStart());
        }
        throw new IllegalArgumentException("Illegal pattern character '" + this.pattern.charAt(matcher.regionStart()) + "'");
    }

    private static void insertValuesInMap(Map<String, Integer> map, String[] strArr) {
        if (strArr != null) {
            for (int i9 = 0; i9 < strArr.length; i9++) {
                String str = strArr[i9];
                if (str != null && str.length() > 0) {
                    map.put(strArr[i9], Integer.valueOf(i9));
                }
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        init(Calendar.getInstance(this.timeZone, this.locale));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FastDateParser)) {
            return false;
        }
        FastDateParser fastDateParser = (FastDateParser) obj;
        if (!this.pattern.equals(fastDateParser.pattern) || !this.timeZone.equals(fastDateParser.timeZone) || !this.locale.equals(fastDateParser.locale)) {
            return false;
        }
        return true;
    }

    public int getFieldWidth() {
        return this.currentFormatField.length();
    }

    @Override
    public Locale getLocale() {
        return this.locale;
    }

    public Pattern getParsePattern() {
        return this.parsePattern;
    }

    @Override
    public String getPattern() {
        return this.pattern;
    }

    @Override
    public TimeZone getTimeZone() {
        return this.timeZone;
    }

    public int hashCode() {
        return (((this.locale.hashCode() * 13) + this.timeZone.hashCode()) * 13) + this.pattern.hashCode();
    }

    public boolean isNextNumber() {
        Strategy strategy = this.nextStrategy;
        if (strategy != null && strategy.isNumber()) {
            return true;
        }
        return false;
    }

    @Override
    public Date parse(String str) {
        Date parse = parse(str, new ParsePosition(0));
        if (parse == null) {
            if (this.locale.equals(JAPANESE_IMPERIAL)) {
                throw new ParseException("(The " + this.locale + " locale does not support dates before 1868 AD)\nUnparseable date: \"" + str + "\" does not match " + this.parsePattern.pattern(), 0);
            }
            StringBuilder t10 = d.t("Unparseable date: \"", str, "\" does not match ");
            t10.append(this.parsePattern.pattern());
            throw new ParseException(t10.toString(), 0);
        }
        return parse;
    }

    @Override
    public Object parseObject(String str) {
        return parse(str);
    }

    public String toString() {
        return "FastDateParser[" + this.pattern + "," + this.locale + "," + this.timeZone.getID() + "]";
    }

    public FastDateParser(String str, TimeZone timeZone, Locale locale, Date date) {
        int i9;
        this.pattern = str;
        this.timeZone = timeZone;
        this.locale = locale;
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        if (date != null) {
            calendar.setTime(date);
            i9 = calendar.get(1);
        } else if (locale.equals(JAPANESE_IMPERIAL)) {
            i9 = 0;
        } else {
            calendar.setTime(new Date());
            i9 = calendar.get(1) - 80;
        }
        int i10 = (i9 / 100) * 100;
        this.century = i10;
        this.startYear = i9 - i10;
        init(calendar);
    }

    @Override
    public Object parseObject(String str, ParsePosition parsePosition) {
        return parse(str, parsePosition);
    }

    public static Map<String, Integer> getDisplayNames(int i9, Calendar calendar, Locale locale) {
        return getDisplayNames(i9, locale);
    }

    @Override
    public Date parse(String str, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        Matcher matcher = this.parsePattern.matcher(str.substring(index));
        if (!matcher.lookingAt()) {
            return null;
        }
        Calendar calendar = Calendar.getInstance(this.timeZone, this.locale);
        calendar.clear();
        int i9 = 0;
        while (true) {
            Strategy[] strategyArr = this.strategies;
            if (i9 < strategyArr.length) {
                int i10 = i9 + 1;
                strategyArr[i9].setCalendar(this, calendar, matcher.group(i10));
                i9 = i10;
            } else {
                parsePosition.setIndex(matcher.end() + index);
                return calendar.getTime();
            }
        }
    }

    public static class NumberStrategy extends Strategy {
        private final int field;

        public NumberStrategy(int i9) {
            super();
            this.field = i9;
        }

        @Override
        public boolean addRegex(FastDateParser fastDateParser, StringBuilder sb2) {
            if (fastDateParser.isNextNumber()) {
                sb2.append("(\\p{Nd}{");
                sb2.append(fastDateParser.getFieldWidth());
                sb2.append("}+)");
                return true;
            }
            sb2.append("(\\p{Nd}++)");
            return true;
        }

        @Override
        public boolean isNumber() {
            return true;
        }

        @Override
        public void setCalendar(FastDateParser fastDateParser, Calendar calendar, String str) {
            calendar.set(this.field, modify(Integer.parseInt(str)));
        }

        public int modify(int i9) {
            return i9;
        }
    }

    public static abstract class Strategy {
        private Strategy() {
        }

        public abstract boolean addRegex(FastDateParser fastDateParser, StringBuilder sb2);

        public boolean isNumber() {
            return false;
        }

        public void setCalendar(FastDateParser fastDateParser, Calendar calendar, String str) {
        }
    }
}
