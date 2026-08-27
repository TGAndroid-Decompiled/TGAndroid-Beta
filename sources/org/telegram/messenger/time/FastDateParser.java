package org.telegram.messenger.time;

import a9.p;
import com.google.android.recaptcha.internal.a;
import j$.util.DesugarTimeZone;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
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
            int iAdjustYear = Integer.parseInt(str);
            if (iAdjustYear < 100) {
                iAdjustYear = fastDateParser.adjustYear(iAdjustYear);
            }
            calendar.set(1, iAdjustYear);
        }
    };
    private static final Strategy NUMBER_MONTH_STRATEGY = new NumberStrategy(2) {
        @Override
        public int modify(int i10) {
            return i10 - 1;
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
        public int modify(int i10) {
            return i10 % 24;
        }
    };
    private static final Strategy MODULO_HOUR_STRATEGY = new NumberStrategy(10) {
        @Override
        public int modify(int i10) {
            return i10 % 12;
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
            char cCharAt = this.formatField.charAt(0);
            if (cCharAt == '\'') {
                cCharAt = this.formatField.charAt(1);
            }
            return Character.isDigit(cCharAt);
        }
    }

    public static class TextStrategy extends Strategy {
        private final int field;
        private final Map<String, Integer> keyValues;

        public TextStrategy(int i10, Calendar calendar, Locale locale) {
            super();
            this.field = i10;
            this.keyValues = FastDateParser.getDisplayNames(i10, calendar, locale);
        }

        @Override
        public boolean addRegex(FastDateParser fastDateParser, StringBuilder sb2) {
            sb2.append('(');
            Iterator<String> it = this.keyValues.keySet().iterator();
            while (it.hasNext()) {
                FastDateParser.escapeRegex(sb2, it.next(), false).append('|');
            }
            sb2.setCharAt(sb2.length() - 1, ')');
            return true;
        }

        @Override
        public void setCalendar(FastDateParser fastDateParser, Calendar calendar, String str) {
            Integer num = this.keyValues.get(str);
            if (num != null) {
                calendar.set(this.field, num.intValue());
                return;
            }
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append(" not in (");
            Iterator<String> it = this.keyValues.keySet().iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append(' ');
            }
            sb2.setCharAt(sb2.length() - 1, ')');
            throw new IllegalArgumentException(sb2.toString());
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
            StringBuilder sbO = a.o("(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|");
            Iterator<String> it = this.tzNames.keySet().iterator();
            while (it.hasNext()) {
                FastDateParser.escapeRegex(sbO, it.next(), false).append('|');
            }
            sbO.setCharAt(sbO.length() - 1, ')');
            this.validTimeZoneChars = sbO.toString();
        }

        @Override
        public boolean addRegex(FastDateParser fastDateParser, StringBuilder sb2) {
            sb2.append(this.validTimeZoneChars);
            return true;
        }

        @Override
        public void setCalendar(FastDateParser fastDateParser, Calendar calendar, String str) {
            TimeZone timeZone;
            if (str.charAt(0) == '+' || str.charAt(0) == '-') {
                timeZone = DesugarTimeZone.getTimeZone("GMT".concat(str));
            } else if (str.startsWith("GMT")) {
                timeZone = DesugarTimeZone.getTimeZone(str);
            } else {
                timeZone = this.tzNames.get(str);
                if (timeZone == null) {
                    throw new IllegalArgumentException(str.concat(" is not a supported timezone name"));
                }
            }
            calendar.setTimeZone(timeZone);
        }
    }

    public FastDateParser(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, null);
    }

    public int adjustYear(int i10) {
        int i11 = this.century + i10;
        return i10 >= this.startYear ? i11 : i11 + 100;
    }

    public static StringBuilder escapeRegex(StringBuilder sb2, String str, boolean z10) {
        sb2.append("\\Q");
        int i10 = 0;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\'') {
                if (cCharAt == '\\' && (i10 = i10 + 1) != str.length()) {
                    sb2.append(cCharAt);
                    cCharAt = str.charAt(i10);
                    if (cCharAt == 'E') {
                        sb2.append("E\\\\E\\");
                        cCharAt = 'Q';
                    }
                }
            } else if (z10) {
                i10++;
                if (i10 == str.length()) {
                    return sb2;
                }
                cCharAt = str.charAt(i10);
            } else {
                continue;
            }
            sb2.append(cCharAt);
            i10++;
        }
        sb2.append("\\E");
        return sb2;
    }

    private static ConcurrentMap<Locale, Strategy> getCache(int i10) {
        ConcurrentMap<Locale, Strategy> concurrentMap;
        ConcurrentMap<Locale, Strategy>[] concurrentMapArr = caches;
        synchronized (concurrentMapArr) {
            try {
                if (concurrentMapArr[i10] == null) {
                    concurrentMapArr[i10] = new ConcurrentHashMap(3);
                }
                concurrentMap = concurrentMapArr[i10];
            } catch (Throwable th) {
                throw th;
            }
        }
        return concurrentMap;
    }

    private static String[] getDisplayNameArray(int i10, boolean z10, Locale locale) {
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(locale);
        if (i10 == 0) {
            return dateFormatSymbols.getEras();
        }
        if (i10 == 2) {
            return z10 ? dateFormatSymbols.getMonths() : dateFormatSymbols.getShortMonths();
        }
        if (i10 == 7) {
            return z10 ? dateFormatSymbols.getWeekdays() : dateFormatSymbols.getShortWeekdays();
        }
        if (i10 != 9) {
            return null;
        }
        return dateFormatSymbols.getAmPmStrings();
    }

    private static Map<String, Integer> getDisplayNames(int i10, Locale locale) {
        HashMap map = new HashMap();
        insertValuesInMap(map, getDisplayNameArray(i10, false, locale));
        insertValuesInMap(map, getDisplayNameArray(i10, true, locale));
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    private Strategy getLocaleSpecificStrategy(int i10, Calendar calendar) {
        ConcurrentMap<Locale, Strategy> cache = getCache(i10);
        Strategy strategy = cache.get(this.locale);
        if (strategy != null) {
            return strategy;
        }
        Strategy timeZoneStrategy = i10 == 15 ? new TimeZoneStrategy(this.locale) : new TextStrategy(i10, calendar, this.locale);
        Strategy strategyPutIfAbsent = cache.putIfAbsent(this.locale, timeZoneStrategy);
        return strategyPutIfAbsent != null ? strategyPutIfAbsent : timeZoneStrategy;
    }

    private Strategy getStrategy(String str, Calendar calendar) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 'y') {
            return str.length() > 2 ? LITERAL_YEAR_STRATEGY : ABBREVIATED_YEAR_STRATEGY;
        }
        if (cCharAt != 'z') {
            switch (cCharAt) {
                case '\'':
                    if (str.length() > 2) {
                        return new CopyQuotedStrategy(a.n(str, 1, 1));
                    }
                    break;
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
                    switch (cCharAt) {
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
                            switch (cCharAt) {
                                case 'K':
                                    return HOUR_STRATEGY;
                                case 'L':
                                case 'M':
                                    return str.length() >= 3 ? getLocaleSpecificStrategy(2, calendar) : NUMBER_MONTH_STRATEGY;
                            }
                    }
            }
            return new CopyQuotedStrategy(str);
        }
        return getLocaleSpecificStrategy(15, calendar);
    }

    private void init(Calendar calendar) {
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        Matcher matcher = formatPattern.matcher(this.pattern);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException("Illegal pattern character '" + this.pattern.charAt(matcher.regionStart()) + "'");
        }
        String strGroup = matcher.group();
        this.currentFormatField = strGroup;
        Strategy strategy = getStrategy(strGroup, calendar);
        while (true) {
            matcher.region(matcher.end(), matcher.regionEnd());
            if (!matcher.lookingAt()) {
                break;
            }
            String strGroup2 = matcher.group();
            this.nextStrategy = getStrategy(strGroup2, calendar);
            if (strategy.addRegex(this, sb2)) {
                arrayList.add(strategy);
            }
            this.currentFormatField = strGroup2;
            strategy = this.nextStrategy;
        }
        this.nextStrategy = null;
        if (matcher.regionStart() != matcher.regionEnd()) {
            throw new IllegalArgumentException("Failed to parse \"" + this.pattern + "\" ; gave up at index " + matcher.regionStart());
        }
        if (strategy.addRegex(this, sb2)) {
            arrayList.add(strategy);
        }
        this.currentFormatField = null;
        this.strategies = (Strategy[]) arrayList.toArray(new Strategy[arrayList.size()]);
        this.parsePattern = Pattern.compile(sb2.toString());
    }

    private static void insertValuesInMap(Map<String, Integer> map, String[] strArr) {
        if (strArr == null) {
            return;
        }
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str = strArr[i10];
            if (str != null && str.length() > 0) {
                map.put(strArr[i10], Integer.valueOf(i10));
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        init(Calendar.getInstance(this.timeZone, this.locale));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FastDateParser)) {
            return false;
        }
        FastDateParser fastDateParser = (FastDateParser) obj;
        return this.pattern.equals(fastDateParser.pattern) && this.timeZone.equals(fastDateParser.timeZone) && this.locale.equals(fastDateParser.locale);
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
        return strategy != null && strategy.isNumber();
    }

    @Override
    public Date parse(String str) throws ParseException {
        Date date = parse(str, new ParsePosition(0));
        if (date != null) {
            return date;
        }
        if (!this.locale.equals(JAPANESE_IMPERIAL)) {
            StringBuilder sbR = p.r("Unparseable date: \"", str, "\" does not match ");
            sbR.append(this.parsePattern.pattern());
            throw new ParseException(sbR.toString(), 0);
        }
        throw new ParseException("(The " + this.locale + " locale does not support dates before 1868 AD)\nUnparseable date: \"" + str + "\" does not match " + this.parsePattern.pattern(), 0);
    }

    @Override
    public Object parseObject(String str) {
        return parse(str);
    }

    public String toString() {
        return "FastDateParser[" + this.pattern + "," + this.locale + "," + this.timeZone.getID() + "]";
    }

    public FastDateParser(String str, TimeZone timeZone, Locale locale, Date date) {
        int i10;
        this.pattern = str;
        this.timeZone = timeZone;
        this.locale = locale;
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        if (date != null) {
            calendar.setTime(date);
            i10 = calendar.get(1);
        } else if (locale.equals(JAPANESE_IMPERIAL)) {
            i10 = 0;
        } else {
            calendar.setTime(new Date());
            i10 = calendar.get(1) - 80;
        }
        int i11 = (i10 / 100) * 100;
        this.century = i11;
        this.startYear = i10 - i11;
        init(calendar);
    }

    @Override
    public Object parseObject(String str, ParsePosition parsePosition) {
        return parse(str, parsePosition);
    }

    public static Map<String, Integer> getDisplayNames(int i10, Calendar calendar, Locale locale) {
        return getDisplayNames(i10, locale);
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
        int i10 = 0;
        while (true) {
            Strategy[] strategyArr = this.strategies;
            if (i10 < strategyArr.length) {
                int i11 = i10 + 1;
                strategyArr[i10].setCalendar(this, calendar, matcher.group(i11));
                i10 = i11;
            } else {
                parsePosition.setIndex(matcher.end() + index);
                return calendar.getTime();
            }
        }
    }

    public static class NumberStrategy extends Strategy {
        private final int field;

        public NumberStrategy(int i10) {
            super();
            this.field = i10;
        }

        @Override
        public boolean addRegex(FastDateParser fastDateParser, StringBuilder sb2) {
            if (!fastDateParser.isNextNumber()) {
                sb2.append("(\\p{Nd}++)");
                return true;
            }
            sb2.append("(\\p{Nd}{");
            sb2.append(fastDateParser.getFieldWidth());
            sb2.append("}+)");
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

        public int modify(int i10) {
            return i10;
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
