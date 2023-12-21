package org.telegram.messenger.time;

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
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.R;
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
        void setCalendar(FastDateParser fastDateParser, Calendar calendar, String str) {
            int parseInt = Integer.parseInt(str);
            if (parseInt < 100) {
                parseInt = fastDateParser.adjustYear(parseInt);
            }
            calendar.set(1, parseInt);
        }
    };
    private static final Strategy NUMBER_MONTH_STRATEGY = new NumberStrategy(2) {
        @Override
        int modify(int i) {
            return i - 1;
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
        int modify(int i) {
            return i % 24;
        }
    };
    private static final Strategy MODULO_HOUR_STRATEGY = new NumberStrategy(10) {
        @Override
        int modify(int i) {
            return i % 12;
        }
    };
    private static final Strategy HOUR_STRATEGY = new NumberStrategy(10);
    private static final Strategy MINUTE_STRATEGY = new NumberStrategy(12);
    private static final Strategy SECOND_STRATEGY = new NumberStrategy(13);
    private static final Strategy MILLISECOND_STRATEGY = new NumberStrategy(14);

    protected FastDateParser(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, null);
    }

    public FastDateParser(String str, TimeZone timeZone, Locale locale, Date date) {
        int i;
        this.pattern = str;
        this.timeZone = timeZone;
        this.locale = locale;
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        if (date != null) {
            calendar.setTime(date);
            i = calendar.get(1);
        } else if (locale.equals(JAPANESE_IMPERIAL)) {
            i = 0;
        } else {
            calendar.setTime(new Date());
            i = calendar.get(1) - 80;
        }
        int i2 = (i / 100) * 100;
        this.century = i2;
        this.startYear = i - i2;
        init(calendar);
    }

    private void init(Calendar calendar) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        Matcher matcher = formatPattern.matcher(this.pattern);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException("Illegal pattern character '" + this.pattern.charAt(matcher.regionStart()) + "'");
        }
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
            if (strategy.addRegex(this, sb)) {
                arrayList.add(strategy);
            }
            this.currentFormatField = group2;
            strategy = this.nextStrategy;
        }
        this.nextStrategy = null;
        if (matcher.regionStart() != matcher.regionEnd()) {
            throw new IllegalArgumentException("Failed to parse \"" + this.pattern + "\" ; gave up at index " + matcher.regionStart());
        }
        if (strategy.addRegex(this, sb)) {
            arrayList.add(strategy);
        }
        this.currentFormatField = null;
        this.strategies = (Strategy[]) arrayList.toArray(new Strategy[arrayList.size()]);
        this.parsePattern = Pattern.compile(sb.toString());
    }

    @Override
    public String getPattern() {
        return this.pattern;
    }

    @Override
    public TimeZone getTimeZone() {
        return this.timeZone;
    }

    @Override
    public Locale getLocale() {
        return this.locale;
    }

    Pattern getParsePattern() {
        return this.parsePattern;
    }

    public boolean equals(Object obj) {
        if (obj instanceof FastDateParser) {
            FastDateParser fastDateParser = (FastDateParser) obj;
            return this.pattern.equals(fastDateParser.pattern) && this.timeZone.equals(fastDateParser.timeZone) && this.locale.equals(fastDateParser.locale);
        }
        return false;
    }

    public int hashCode() {
        return this.pattern.hashCode() + ((this.timeZone.hashCode() + (this.locale.hashCode() * 13)) * 13);
    }

    public String toString() {
        return "FastDateParser[" + this.pattern + "," + this.locale + "," + this.timeZone.getID() + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        init(Calendar.getInstance(this.timeZone, this.locale));
    }

    @Override
    public Object parseObject(String str) throws ParseException {
        return parse(str);
    }

    @Override
    public Date parse(String str) throws ParseException {
        Date parse = parse(str, new ParsePosition(0));
        if (parse == null) {
            if (this.locale.equals(JAPANESE_IMPERIAL)) {
                throw new ParseException("(The " + this.locale + " locale does not support dates before 1868 AD)\nUnparseable date: \"" + str + "\" does not match " + this.parsePattern.pattern(), 0);
            }
            throw new ParseException("Unparseable date: \"" + str + "\" does not match " + this.parsePattern.pattern(), 0);
        }
        return parse;
    }

    @Override
    public Object parseObject(String str, ParsePosition parsePosition) {
        return parse(str, parsePosition);
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
        int i = 0;
        while (true) {
            Strategy[] strategyArr = this.strategies;
            if (i < strategyArr.length) {
                int i2 = i + 1;
                strategyArr[i].setCalendar(this, calendar, matcher.group(i2));
                i = i2;
            } else {
                parsePosition.setIndex(index + matcher.end());
                return calendar.getTime();
            }
        }
    }

    public static StringBuilder escapeRegex(StringBuilder sb, String str, boolean z) {
        sb.append("\\Q");
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != '\'') {
                if (charAt == '\\' && (i = i + 1) != str.length()) {
                    sb.append(charAt);
                    charAt = str.charAt(i);
                    if (charAt == 'E') {
                        sb.append("E\\\\E\\");
                        charAt = 'Q';
                    }
                }
            } else if (z) {
                i++;
                if (i == str.length()) {
                    return sb;
                }
                charAt = str.charAt(i);
            } else {
                continue;
            }
            sb.append(charAt);
            i++;
        }
        sb.append("\\E");
        return sb;
    }

    private static String[] getDisplayNameArray(int i, boolean z, Locale locale) {
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(locale);
        if (i != 0) {
            if (i == 2) {
                return z ? dateFormatSymbols.getMonths() : dateFormatSymbols.getShortMonths();
            } else if (i == 7) {
                return z ? dateFormatSymbols.getWeekdays() : dateFormatSymbols.getShortWeekdays();
            } else if (i != 9) {
                return null;
            } else {
                return dateFormatSymbols.getAmPmStrings();
            }
        }
        return dateFormatSymbols.getEras();
    }

    private static void insertValuesInMap(Map<String, Integer> map, String[] strArr) {
        if (strArr == null) {
            return;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null && strArr[i].length() > 0) {
                map.put(strArr[i], Integer.valueOf(i));
            }
        }
    }

    private static Map<String, Integer> getDisplayNames(int i, Locale locale) {
        HashMap hashMap = new HashMap();
        insertValuesInMap(hashMap, getDisplayNameArray(i, false, locale));
        insertValuesInMap(hashMap, getDisplayNameArray(i, true, locale));
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    public static Map<String, Integer> getDisplayNames(int i, Calendar calendar, Locale locale) {
        return getDisplayNames(i, locale);
    }

    public int adjustYear(int i) {
        int i2 = this.century + i;
        return i >= this.startYear ? i2 : i2 + 100;
    }

    boolean isNextNumber() {
        Strategy strategy = this.nextStrategy;
        return strategy != null && strategy.isNumber();
    }

    int getFieldWidth() {
        return this.currentFormatField.length();
    }

    public static abstract class Strategy {
        abstract boolean addRegex(FastDateParser fastDateParser, StringBuilder sb);

        boolean isNumber() {
            return false;
        }

        void setCalendar(FastDateParser fastDateParser, Calendar calendar, String str) {
        }

        private Strategy() {
        }
    }

    private Strategy getStrategy(String str, Calendar calendar) {
        char charAt = str.charAt(0);
        if (charAt == 'y') {
            return str.length() > 2 ? LITERAL_YEAR_STRATEGY : ABBREVIATED_YEAR_STRATEGY;
        }
        if (charAt != 'z') {
            switch (charAt) {
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle:
                    if (str.length() > 2) {
                        return new CopyQuotedStrategy(str.substring(1, str.length() - 1));
                    }
                    return new CopyQuotedStrategy(str);
                case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft:
                    return MILLISECOND_STRATEGY;
                case R.styleable.AppCompatTheme_panelMenuListTheme:
                    return WEEK_OF_MONTH_STRATEGY;
                case R.styleable.AppCompatTheme_popupWindowStyle:
                    break;
                case R.styleable.AppCompatTheme_selectableItemBackground:
                    return getLocaleSpecificStrategy(9, calendar);
                case 'd':
                    return DAY_OF_MONTH_STRATEGY;
                case R.styleable.AppCompatTheme_textAppearanceListItemSecondary:
                    return MODULO_HOUR_STRATEGY;
                case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle:
                    return HOUR_OF_DAY_STRATEGY;
                case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu:
                    return MINUTE_STRATEGY;
                case R.styleable.AppCompatTheme_tooltipFrameBackground:
                    return SECOND_STRATEGY;
                case 'w':
                    return WEEK_OF_YEAR_STRATEGY;
                default:
                    switch (charAt) {
                        case R.styleable.AppCompatTheme_editTextBackground:
                            return DAY_OF_YEAR_STRATEGY;
                        case R.styleable.AppCompatTheme_editTextColor:
                            return getLocaleSpecificStrategy(7, calendar);
                        case R.styleable.AppCompatTheme_editTextStyle:
                            return DAY_OF_WEEK_IN_MONTH_STRATEGY;
                        case R.styleable.AppCompatTheme_homeAsUpIndicator:
                            return getLocaleSpecificStrategy(0, calendar);
                        case R.styleable.AppCompatTheme_imageButtonStyle:
                            return MODULO_HOUR_OF_DAY_STRATEGY;
                        default:
                            switch (charAt) {
                                case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated:
                                    return HOUR_STRATEGY;
                                case R.styleable.AppCompatTheme_listDividerAlertDialog:
                                case R.styleable.AppCompatTheme_listMenuViewStyle:
                                    return str.length() >= 3 ? getLocaleSpecificStrategy(2, calendar) : NUMBER_MONTH_STRATEGY;
                            }
                            return new CopyQuotedStrategy(str);
                    }
            }
        }
        return getLocaleSpecificStrategy(15, calendar);
    }

    private static ConcurrentMap<Locale, Strategy> getCache(int i) {
        ConcurrentMap<Locale, Strategy> concurrentMap;
        ConcurrentMap<Locale, Strategy>[] concurrentMapArr = caches;
        synchronized (concurrentMapArr) {
            if (concurrentMapArr[i] == null) {
                concurrentMapArr[i] = new ConcurrentHashMap(3);
            }
            concurrentMap = concurrentMapArr[i];
        }
        return concurrentMap;
    }

    private Strategy getLocaleSpecificStrategy(int i, Calendar calendar) {
        ConcurrentMap<Locale, Strategy> cache = getCache(i);
        Strategy strategy = cache.get(this.locale);
        if (strategy == null) {
            if (i == 15) {
                strategy = new TimeZoneStrategy(this.locale);
            } else {
                strategy = new TextStrategy(i, calendar, this.locale);
            }
            Strategy putIfAbsent = cache.putIfAbsent(this.locale, strategy);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
        }
        return strategy;
    }

    public static class CopyQuotedStrategy extends Strategy {
        private final String formatField;

        CopyQuotedStrategy(String str) {
            super();
            this.formatField = str;
        }

        @Override
        boolean isNumber() {
            char charAt = this.formatField.charAt(0);
            if (charAt == '\'') {
                charAt = this.formatField.charAt(1);
            }
            return Character.isDigit(charAt);
        }

        @Override
        boolean addRegex(FastDateParser fastDateParser, StringBuilder sb) {
            FastDateParser.escapeRegex(sb, this.formatField, true);
            return false;
        }
    }

    public static class TextStrategy extends Strategy {
        private final int field;
        private final Map<String, Integer> keyValues;

        TextStrategy(int i, Calendar calendar, Locale locale) {
            super();
            this.field = i;
            this.keyValues = FastDateParser.getDisplayNames(i, calendar, locale);
        }

        @Override
        boolean addRegex(FastDateParser fastDateParser, StringBuilder sb) {
            sb.append('(');
            for (String str : this.keyValues.keySet()) {
                FastDateParser.escapeRegex(sb, str, false).append('|');
            }
            sb.setCharAt(sb.length() - 1, ')');
            return true;
        }

        @Override
        void setCalendar(FastDateParser fastDateParser, Calendar calendar, String str) {
            Integer num = this.keyValues.get(str);
            if (num == null) {
                StringBuilder sb = new StringBuilder(str);
                sb.append(" not in (");
                for (String str2 : this.keyValues.keySet()) {
                    sb.append(str2);
                    sb.append(' ');
                }
                sb.setCharAt(sb.length() - 1, ')');
                throw new IllegalArgumentException(sb.toString());
            }
            calendar.set(this.field, num.intValue());
        }
    }

    private static class NumberStrategy extends Strategy {
        private final int field;

        @Override
        boolean isNumber() {
            return true;
        }

        int modify(int i) {
            return i;
        }

        NumberStrategy(int i) {
            super();
            this.field = i;
        }

        @Override
        boolean addRegex(FastDateParser fastDateParser, StringBuilder sb) {
            if (fastDateParser.isNextNumber()) {
                sb.append("(\\p{Nd}{");
                sb.append(fastDateParser.getFieldWidth());
                sb.append("}+)");
                return true;
            }
            sb.append("(\\p{Nd}++)");
            return true;
        }

        @Override
        void setCalendar(FastDateParser fastDateParser, Calendar calendar, String str) {
            calendar.set(this.field, modify(Integer.parseInt(str)));
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

        TimeZoneStrategy(Locale locale) {
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
            StringBuilder sb = new StringBuilder();
            sb.append("(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|");
            for (String str : this.tzNames.keySet()) {
                FastDateParser.escapeRegex(sb, str, false).append('|');
            }
            sb.setCharAt(sb.length() - 1, ')');
            this.validTimeZoneChars = sb.toString();
        }

        @Override
        boolean addRegex(FastDateParser fastDateParser, StringBuilder sb) {
            sb.append(this.validTimeZoneChars);
            return true;
        }

        @Override
        void setCalendar(FastDateParser fastDateParser, Calendar calendar, String str) {
            TimeZone timeZone;
            if (str.charAt(0) == '+' || str.charAt(0) == '-') {
                timeZone = DesugarTimeZone.getTimeZone("GMT" + str);
            } else if (str.startsWith("GMT")) {
                timeZone = DesugarTimeZone.getTimeZone(str);
            } else {
                timeZone = this.tzNames.get(str);
                if (timeZone == null) {
                    throw new IllegalArgumentException(str + " is not a supported timezone name");
                }
            }
            calendar.setTimeZone(timeZone);
        }
    }
}
