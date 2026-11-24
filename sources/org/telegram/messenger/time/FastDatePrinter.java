package org.telegram.messenger.time;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentMap;
public class FastDatePrinter implements DatePrinter, Serializable {
    public static final int FULL = 0;
    public static final int LONG = 1;
    public static final int MEDIUM = 2;
    public static final int SHORT = 3;
    private static final ConcurrentMap<TimeZoneDisplayKey, String> cTimeZoneDisplayCache = new ConcurrentHashMap(7);
    private static final long serialVersionUID = 1;
    private final Locale mLocale;
    private transient int mMaxLengthEstimate;
    private final String mPattern;
    private transient Rule[] mRules;
    private final TimeZone mTimeZone;

    public static class CharacterLiteral implements Rule {
        private final char mValue;

        public CharacterLiteral(char c) {
            this.mValue = c;
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.mValue);
        }

        @Override
        public int estimateLength() {
            return 1;
        }
    }

    public interface NumberRule extends Rule {
        void appendTo(StringBuffer stringBuffer, int i);
    }

    public interface Rule {
        void appendTo(StringBuffer stringBuffer, Calendar calendar);

        int estimateLength();
    }

    public static class StringLiteral implements Rule {
        private final String mValue;

        public StringLiteral(String str) {
            this.mValue = str;
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.mValue);
        }

        @Override
        public int estimateLength() {
            return this.mValue.length();
        }
    }

    public static class TextField implements Rule {
        private final int mField;
        private final String[] mValues;

        public TextField(int i, String[] strArr) {
            this.mField = i;
            this.mValues = strArr;
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.mValues[calendar.get(this.mField)]);
        }

        @Override
        public int estimateLength() {
            int length = this.mValues.length;
            int i = 0;
            while (true) {
                length--;
                if (length >= 0) {
                    int length2 = this.mValues[length].length();
                    if (length2 > i) {
                        i = length2;
                    }
                } else {
                    return i;
                }
            }
        }
    }

    public static class TimeZoneDisplayKey {
        private final Locale mLocale;
        private final int mStyle;
        private final TimeZone mTimeZone;

        public TimeZoneDisplayKey(TimeZone timeZone, boolean z, int i, Locale locale) {
            this.mTimeZone = timeZone;
            if (z) {
                this.mStyle = i | Integer.MIN_VALUE;
            } else {
                this.mStyle = i;
            }
            this.mLocale = locale;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TimeZoneDisplayKey) {
                TimeZoneDisplayKey timeZoneDisplayKey = (TimeZoneDisplayKey) obj;
                if (this.mTimeZone.equals(timeZoneDisplayKey.mTimeZone) && this.mStyle == timeZoneDisplayKey.mStyle && this.mLocale.equals(timeZoneDisplayKey.mLocale)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.mLocale.hashCode();
            return this.mTimeZone.hashCode() + ((hashCode + (this.mStyle * 31)) * 31);
        }
    }

    public static class TimeZoneNameRule implements Rule {
        private final String mDaylight;
        private final Locale mLocale;
        private final String mStandard;
        private final int mStyle;

        public TimeZoneNameRule(TimeZone timeZone, Locale locale, int i) {
            this.mLocale = locale;
            this.mStyle = i;
            this.mStandard = FastDatePrinter.getTimeZoneDisplay(timeZone, false, i, locale);
            this.mDaylight = FastDatePrinter.getTimeZoneDisplay(timeZone, true, i, locale);
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            TimeZone timeZone = calendar.getTimeZone();
            if (timeZone.useDaylightTime() && calendar.get(16) != 0) {
                stringBuffer.append(FastDatePrinter.getTimeZoneDisplay(timeZone, true, this.mStyle, this.mLocale));
            } else {
                stringBuffer.append(FastDatePrinter.getTimeZoneDisplay(timeZone, false, this.mStyle, this.mLocale));
            }
        }

        @Override
        public int estimateLength() {
            return Math.max(this.mStandard.length(), this.mDaylight.length());
        }
    }

    public static class TimeZoneNumberRule implements Rule {
        static final TimeZoneNumberRule INSTANCE_COLON = new TimeZoneNumberRule(true);
        static final TimeZoneNumberRule INSTANCE_NO_COLON = new TimeZoneNumberRule(false);
        final boolean mColon;

        public TimeZoneNumberRule(boolean z) {
            this.mColon = z;
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            int i = calendar.get(16) + calendar.get(15);
            if (i < 0) {
                stringBuffer.append('-');
                i = -i;
            } else {
                stringBuffer.append('+');
            }
            int i2 = i / 3600000;
            stringBuffer.append((char) ((i2 / 10) + 48));
            stringBuffer.append((char) ((i2 % 10) + 48));
            if (this.mColon) {
                stringBuffer.append(':');
            }
            int i3 = (i / 60000) - (i2 * 60);
            stringBuffer.append((char) ((i3 / 10) + 48));
            stringBuffer.append((char) ((i3 % 10) + 48));
        }

        @Override
        public int estimateLength() {
            return 5;
        }
    }

    public FastDatePrinter(String str, TimeZone timeZone, Locale locale) {
        this.mPattern = str;
        this.mTimeZone = timeZone;
        this.mLocale = locale;
        init();
    }

    private String applyRulesToString(Calendar calendar) {
        return applyRules(calendar, new StringBuffer(this.mMaxLengthEstimate)).toString();
    }

    public static String getTimeZoneDisplay(TimeZone timeZone, boolean z, int i, Locale locale) {
        TimeZoneDisplayKey timeZoneDisplayKey = new TimeZoneDisplayKey(timeZone, z, i, locale);
        ConcurrentMap<TimeZoneDisplayKey, String> concurrentMap = cTimeZoneDisplayCache;
        String str = concurrentMap.get(timeZoneDisplayKey);
        if (str == null) {
            String displayName = timeZone.getDisplayName(z, i, locale);
            String putIfAbsent = concurrentMap.putIfAbsent(timeZoneDisplayKey, displayName);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
            return displayName;
        }
        return str;
    }

    private void init() {
        List<Rule> parsePattern = parsePattern();
        Rule[] ruleArr = (Rule[]) parsePattern.toArray(new Rule[parsePattern.size()]);
        this.mRules = ruleArr;
        int length = ruleArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length >= 0) {
                i += this.mRules[length].estimateLength();
            } else {
                this.mMaxLengthEstimate = i;
                return;
            }
        }
    }

    private GregorianCalendar newCalendar() {
        return new GregorianCalendar(this.mTimeZone, this.mLocale);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        init();
    }

    public StringBuffer applyRules(Calendar calendar, StringBuffer stringBuffer) {
        for (Rule rule : this.mRules) {
            rule.appendTo(stringBuffer, calendar);
        }
        return stringBuffer;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FastDatePrinter)) {
            return false;
        }
        FastDatePrinter fastDatePrinter = (FastDatePrinter) obj;
        if (!this.mPattern.equals(fastDatePrinter.mPattern) || !this.mTimeZone.equals(fastDatePrinter.mTimeZone) || !this.mLocale.equals(fastDatePrinter.mLocale)) {
            return false;
        }
        return true;
    }

    @Override
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        String name;
        if (obj instanceof Date) {
            return format((Date) obj, stringBuffer);
        }
        if (obj instanceof Calendar) {
            return format((Calendar) obj, stringBuffer);
        }
        if (obj instanceof Long) {
            return format(((Long) obj).longValue(), stringBuffer);
        }
        if (obj == null) {
            name = "<null>";
        } else {
            name = obj.getClass().getName();
        }
        throw new IllegalArgumentException("Unknown class: ".concat(name));
    }

    @Override
    public Locale getLocale() {
        return this.mLocale;
    }

    public int getMaxLengthEstimate() {
        return this.mMaxLengthEstimate;
    }

    @Override
    public String getPattern() {
        return this.mPattern;
    }

    @Override
    public TimeZone getTimeZone() {
        return this.mTimeZone;
    }

    public int hashCode() {
        return (((this.mLocale.hashCode() * 13) + this.mTimeZone.hashCode()) * 13) + this.mPattern.hashCode();
    }

    public List<Rule> parsePattern() {
        int i;
        int i2;
        NumberRule selectNumberRule;
        TwoDigitYearField twoDigitYearField;
        int i3;
        NumberRule numberRule;
        ?? textField;
        NumberRule numberRule2;
        String[] strArr;
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(this.mLocale);
        ArrayList arrayList = new ArrayList();
        String[] eras = dateFormatSymbols.getEras();
        String[] months = dateFormatSymbols.getMonths();
        String[] shortMonths = dateFormatSymbols.getShortMonths();
        String[] weekdays = dateFormatSymbols.getWeekdays();
        String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
        String[] amPmStrings = dateFormatSymbols.getAmPmStrings();
        int length = this.mPattern.length();
        int i4 = 0;
        int i5 = 0;
        while (i5 < length) {
            int[] iArr = {i5};
            String parseToken = parseToken(this.mPattern, iArr);
            int i6 = iArr[i4];
            int length2 = parseToken.length();
            if (length2 != 0) {
                char charAt = parseToken.charAt(i4);
                if (charAt != 'y') {
                    if (charAt != 'z') {
                        switch (charAt) {
                            case '\'':
                                String substring = parseToken.substring(1);
                                if (substring.length() == 1) {
                                    numberRule2 = new CharacterLiteral(substring.charAt(0));
                                } else {
                                    numberRule2 = new StringLiteral(substring);
                                }
                                i2 = 1;
                                selectNumberRule = numberRule2;
                                i = 0;
                                break;
                            case 'S':
                                i3 = 1;
                                numberRule = selectNumberRule(14, length2);
                                selectNumberRule = numberRule;
                                i2 = i3;
                                i = 0;
                                break;
                            case 'W':
                                i3 = 1;
                                numberRule = selectNumberRule(4, length2);
                                selectNumberRule = numberRule;
                                i2 = i3;
                                i = 0;
                                break;
                            case 'Z':
                                i3 = 1;
                                if (length2 == 1) {
                                    numberRule = TimeZoneNumberRule.INSTANCE_NO_COLON;
                                } else {
                                    numberRule = TimeZoneNumberRule.INSTANCE_COLON;
                                }
                                selectNumberRule = numberRule;
                                i2 = i3;
                                i = 0;
                                break;
                            case 'a':
                                textField = new TextField(9, amPmStrings);
                                numberRule2 = textField;
                                i2 = 1;
                                selectNumberRule = numberRule2;
                                i = 0;
                                break;
                            case 'd':
                                textField = selectNumberRule(5, length2);
                                numberRule2 = textField;
                                i2 = 1;
                                selectNumberRule = numberRule2;
                                i = 0;
                                break;
                            case 'h':
                                textField = new TwelveHourField(selectNumberRule(10, length2));
                                numberRule2 = textField;
                                i2 = 1;
                                selectNumberRule = numberRule2;
                                i = 0;
                                break;
                            case 'k':
                                textField = new TwentyFourHourField(selectNumberRule(11, length2));
                                numberRule2 = textField;
                                i2 = 1;
                                selectNumberRule = numberRule2;
                                i = 0;
                                break;
                            case 'm':
                                textField = selectNumberRule(12, length2);
                                numberRule2 = textField;
                                i2 = 1;
                                selectNumberRule = numberRule2;
                                i = 0;
                                break;
                            case 's':
                                textField = selectNumberRule(13, length2);
                                numberRule2 = textField;
                                i2 = 1;
                                selectNumberRule = numberRule2;
                                i = 0;
                                break;
                            case 'w':
                                textField = selectNumberRule(3, length2);
                                numberRule2 = textField;
                                i2 = 1;
                                selectNumberRule = numberRule2;
                                i = 0;
                                break;
                            default:
                                switch (charAt) {
                                    case 'D':
                                        textField = selectNumberRule(6, length2);
                                        numberRule2 = textField;
                                        i2 = 1;
                                        selectNumberRule = numberRule2;
                                        i = 0;
                                        break;
                                    case 'E':
                                        if (length2 < 4) {
                                            strArr = shortWeekdays;
                                        } else {
                                            strArr = weekdays;
                                        }
                                        numberRule2 = new TextField(7, strArr);
                                        i2 = 1;
                                        selectNumberRule = numberRule2;
                                        i = 0;
                                        break;
                                    case 'F':
                                        textField = selectNumberRule(8, length2);
                                        numberRule2 = textField;
                                        i2 = 1;
                                        selectNumberRule = numberRule2;
                                        i = 0;
                                        break;
                                    case 'G':
                                        i = 0;
                                        twoDigitYearField = new TextField(0, eras);
                                        break;
                                    case 'H':
                                        textField = selectNumberRule(11, length2);
                                        numberRule2 = textField;
                                        i2 = 1;
                                        selectNumberRule = numberRule2;
                                        i = 0;
                                        break;
                                    default:
                                        switch (charAt) {
                                            case 'K':
                                                textField = selectNumberRule(10, length2);
                                                break;
                                            case 'L':
                                                if (length2 >= 4) {
                                                    textField = new TextField(2, months);
                                                    break;
                                                } else if (length2 == 3) {
                                                    textField = new TextField(2, shortMonths);
                                                    break;
                                                } else if (length2 == 2) {
                                                    textField = TwoDigitMonthField.INSTANCE;
                                                    break;
                                                } else {
                                                    textField = UnpaddedMonthField.INSTANCE;
                                                    break;
                                                }
                                            case 'M':
                                                if (length2 >= 4) {
                                                    textField = new TextField(2, months);
                                                    break;
                                                } else if (length2 == 3) {
                                                    textField = new TextField(2, shortMonths);
                                                    break;
                                                } else if (length2 == 2) {
                                                    textField = TwoDigitMonthField.INSTANCE;
                                                    break;
                                                } else {
                                                    textField = UnpaddedMonthField.INSTANCE;
                                                    break;
                                                }
                                            default:
                                                u36.j("Illegal pattern component: ".concat(parseToken));
                                                return null;
                                        }
                                        numberRule2 = textField;
                                        i2 = 1;
                                        selectNumberRule = numberRule2;
                                        i = 0;
                                        break;
                                }
                                selectNumberRule = twoDigitYearField;
                                i2 = 1;
                                break;
                        }
                    } else {
                        TimeZone timeZone = this.mTimeZone;
                        if (length2 >= 4) {
                            i3 = 1;
                            numberRule = new TimeZoneNameRule(timeZone, this.mLocale, 1);
                            selectNumberRule = numberRule;
                            i2 = i3;
                            i = 0;
                        } else {
                            i = 0;
                            twoDigitYearField = new TimeZoneNameRule(timeZone, this.mLocale, 0);
                            selectNumberRule = twoDigitYearField;
                            i2 = 1;
                        }
                    }
                } else {
                    i = 0;
                    if (length2 == 2) {
                        twoDigitYearField = TwoDigitYearField.INSTANCE;
                        selectNumberRule = twoDigitYearField;
                        i2 = 1;
                    } else {
                        if (length2 < 4) {
                            length2 = 4;
                        }
                        i2 = 1;
                        selectNumberRule = selectNumberRule(1, length2);
                    }
                }
                arrayList.add(selectNumberRule);
                i5 = i6 + i2;
                i4 = i;
            } else {
                return arrayList;
            }
        }
        return arrayList;
    }

    public String parseToken(String str, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        int i = iArr[0];
        int length = str.length();
        char charAt = str.charAt(i);
        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
            sb.append(charAt);
            while (true) {
                int i2 = i + 1;
                if (i2 >= length || str.charAt(i2) != charAt) {
                    break;
                }
                sb.append(charAt);
                i = i2;
            }
        } else {
            sb.append('\'');
            boolean z = false;
            while (i < length) {
                char charAt2 = str.charAt(i);
                if (charAt2 == '\'') {
                    int i3 = i + 1;
                    if (i3 < length && str.charAt(i3) == '\'') {
                        sb.append(charAt2);
                        i = i3;
                    } else {
                        z = !z;
                    }
                } else if (!z && ((charAt2 >= 'A' && charAt2 <= 'Z') || (charAt2 >= 'a' && charAt2 <= 'z'))) {
                    i--;
                    break;
                } else {
                    sb.append(charAt2);
                }
                i++;
            }
        }
        iArr[0] = i;
        return sb.toString();
    }

    public NumberRule selectNumberRule(int i, int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                return new PaddedNumberField(i, i2);
            }
            return new TwoDigitNumberField(i);
        }
        return new UnpaddedNumberField(i);
    }

    public String toString() {
        return "FastDatePrinter[" + this.mPattern + "," + this.mLocale + "," + this.mTimeZone.getID() + "]";
    }

    public static class TwoDigitMonthField implements NumberRule {
        static final TwoDigitMonthField INSTANCE = new TwoDigitMonthField();

        @Override
        public final void appendTo(StringBuffer stringBuffer, int i) {
            stringBuffer.append((char) ((i / 10) + 48));
            stringBuffer.append((char) ((i % 10) + 48));
        }

        @Override
        public int estimateLength() {
            return 2;
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(2) + 1);
        }
    }

    public static class TwoDigitYearField implements NumberRule {
        static final TwoDigitYearField INSTANCE = new TwoDigitYearField();

        @Override
        public final void appendTo(StringBuffer stringBuffer, int i) {
            stringBuffer.append((char) ((i / 10) + 48));
            stringBuffer.append((char) ((i % 10) + 48));
        }

        @Override
        public int estimateLength() {
            return 2;
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(1) % 100);
        }
    }

    public static class TwelveHourField implements NumberRule {
        private final NumberRule mRule;

        public TwelveHourField(NumberRule numberRule) {
            this.mRule = numberRule;
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            int i = calendar.get(10);
            if (i == 0) {
                i = calendar.getLeastMaximum(10) + 1;
            }
            this.mRule.appendTo(stringBuffer, i);
        }

        @Override
        public int estimateLength() {
            return this.mRule.estimateLength();
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, int i) {
            this.mRule.appendTo(stringBuffer, i);
        }
    }

    public static class TwentyFourHourField implements NumberRule {
        private final NumberRule mRule;

        public TwentyFourHourField(NumberRule numberRule) {
            this.mRule = numberRule;
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            int i = calendar.get(11);
            if (i == 0) {
                i = calendar.getMaximum(11) + 1;
            }
            this.mRule.appendTo(stringBuffer, i);
        }

        @Override
        public int estimateLength() {
            return this.mRule.estimateLength();
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, int i) {
            this.mRule.appendTo(stringBuffer, i);
        }
    }

    public static class UnpaddedMonthField implements NumberRule {
        static final UnpaddedMonthField INSTANCE = new UnpaddedMonthField();

        @Override
        public final void appendTo(StringBuffer stringBuffer, int i) {
            if (i < 10) {
                stringBuffer.append((char) (i + 48));
                return;
            }
            stringBuffer.append((char) ((i / 10) + 48));
            stringBuffer.append((char) ((i % 10) + 48));
        }

        @Override
        public int estimateLength() {
            return 2;
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(2) + 1);
        }
    }

    public static class TwoDigitNumberField implements NumberRule {
        private final int mField;

        public TwoDigitNumberField(int i) {
            this.mField = i;
        }

        @Override
        public final void appendTo(StringBuffer stringBuffer, int i) {
            if (i < 100) {
                stringBuffer.append((char) ((i / 10) + 48));
                stringBuffer.append((char) ((i % 10) + 48));
                return;
            }
            stringBuffer.append(Integer.toString(i));
        }

        @Override
        public int estimateLength() {
            return 2;
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(this.mField));
        }
    }

    public static class UnpaddedNumberField implements NumberRule {
        private final int mField;

        public UnpaddedNumberField(int i) {
            this.mField = i;
        }

        @Override
        public final void appendTo(StringBuffer stringBuffer, int i) {
            if (i < 10) {
                stringBuffer.append((char) (i + 48));
            } else if (i < 100) {
                stringBuffer.append((char) ((i / 10) + 48));
                stringBuffer.append((char) ((i % 10) + 48));
            } else {
                stringBuffer.append(Integer.toString(i));
            }
        }

        @Override
        public int estimateLength() {
            return 4;
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(this.mField));
        }
    }

    @Override
    public String format(long j) {
        GregorianCalendar newCalendar = newCalendar();
        newCalendar.setTimeInMillis(j);
        return applyRulesToString(newCalendar);
    }

    public static class PaddedNumberField implements NumberRule {
        private final int mField;
        private final int mSize;

        public PaddedNumberField(int i, int i2) {
            if (i2 >= 3) {
                this.mField = i;
                this.mSize = i2;
                return;
            }
            i98.g();
            throw null;
        }

        @Override
        public final void appendTo(StringBuffer stringBuffer, int i) {
            int length;
            if (i < 100) {
                int i2 = this.mSize;
                while (true) {
                    i2--;
                    if (i2 >= 2) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append((char) ((i / 10) + 48));
                        stringBuffer.append((char) ((i % 10) + 48));
                        return;
                    }
                }
            } else {
                if (i < 1000) {
                    length = 3;
                } else {
                    length = Integer.toString(i).length();
                }
                int i3 = this.mSize;
                while (true) {
                    i3--;
                    if (i3 >= length) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append(Integer.toString(i));
                        return;
                    }
                }
            }
        }

        @Override
        public int estimateLength() {
            return 4;
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(this.mField));
        }
    }

    @Override
    public String format(Date date) {
        GregorianCalendar newCalendar = newCalendar();
        newCalendar.setTime(date);
        return applyRulesToString(newCalendar);
    }

    @Override
    public String format(Calendar calendar) {
        return format(calendar, new StringBuffer(this.mMaxLengthEstimate)).toString();
    }

    @Override
    public StringBuffer format(long j, StringBuffer stringBuffer) {
        return format(new Date(j), stringBuffer);
    }

    @Override
    public StringBuffer format(Date date, StringBuffer stringBuffer) {
        GregorianCalendar newCalendar = newCalendar();
        newCalendar.setTime(date);
        return applyRules(newCalendar, stringBuffer);
    }

    @Override
    public StringBuffer format(Calendar calendar, StringBuffer stringBuffer) {
        return applyRules(calendar, stringBuffer);
    }
}
