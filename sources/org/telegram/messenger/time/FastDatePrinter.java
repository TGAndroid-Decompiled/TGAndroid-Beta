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

        public CharacterLiteral(char c10) {
            this.mValue = c10;
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
        void appendTo(StringBuffer stringBuffer, int i7);
    }

    public static class PaddedNumberField implements NumberRule {
        private final int mField;
        private final int mSize;

        public PaddedNumberField(int i7, int i10) {
            if (i10 >= 3) {
                this.mField = i7;
                this.mSize = i10;
                return;
            }
            throw new IllegalArgumentException();
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(this.mField));
        }

        @Override
        public int estimateLength() {
            return 4;
        }

        @Override
        public final void appendTo(StringBuffer stringBuffer, int i7) {
            if (i7 < 100) {
                int i10 = this.mSize;
                while (true) {
                    i10--;
                    if (i10 >= 2) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append((char) ((i7 / 10) + 48));
                        stringBuffer.append((char) ((i7 % 10) + 48));
                        return;
                    }
                }
            } else {
                int length = i7 < 1000 ? 3 : Integer.toString(i7).length();
                int i11 = this.mSize;
                while (true) {
                    i11--;
                    if (i11 >= length) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append(Integer.toString(i7));
                        return;
                    }
                }
            }
        }
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

        public TextField(int i7, String[] strArr) {
            this.mField = i7;
            this.mValues = strArr;
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.mValues[calendar.get(this.mField)]);
        }

        @Override
        public int estimateLength() {
            int length = this.mValues.length;
            int i7 = 0;
            while (true) {
                length--;
                if (length >= 0) {
                    int length2 = this.mValues[length].length();
                    if (length2 > i7) {
                        i7 = length2;
                    }
                } else {
                    return i7;
                }
            }
        }
    }

    public static class TimeZoneDisplayKey {
        private final Locale mLocale;
        private final int mStyle;
        private final TimeZone mTimeZone;

        public TimeZoneDisplayKey(TimeZone timeZone, boolean z9, int i7, Locale locale) {
            this.mTimeZone = timeZone;
            if (z9) {
                this.mStyle = Integer.MIN_VALUE | i7;
            } else {
                this.mStyle = i7;
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

        public TimeZoneNameRule(TimeZone timeZone, Locale locale, int i7) {
            this.mLocale = locale;
            this.mStyle = i7;
            this.mStandard = FastDatePrinter.getTimeZoneDisplay(timeZone, false, i7, locale);
            this.mDaylight = FastDatePrinter.getTimeZoneDisplay(timeZone, true, i7, locale);
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

        public TimeZoneNumberRule(boolean z9) {
            this.mColon = z9;
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            int i7 = calendar.get(16) + calendar.get(15);
            if (i7 < 0) {
                stringBuffer.append('-');
                i7 = -i7;
            } else {
                stringBuffer.append('+');
            }
            int i10 = i7 / 3600000;
            stringBuffer.append((char) ((i10 / 10) + 48));
            stringBuffer.append((char) ((i10 % 10) + 48));
            if (this.mColon) {
                stringBuffer.append(':');
            }
            int i11 = (i7 / 60000) - (i10 * 60);
            stringBuffer.append((char) ((i11 / 10) + 48));
            stringBuffer.append((char) ((i11 % 10) + 48));
        }

        @Override
        public int estimateLength() {
            return 5;
        }
    }

    public static class TwoDigitMonthField implements NumberRule {
        static final TwoDigitMonthField INSTANCE = new TwoDigitMonthField();

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(2) + 1);
        }

        @Override
        public int estimateLength() {
            return 2;
        }

        @Override
        public final void appendTo(StringBuffer stringBuffer, int i7) {
            stringBuffer.append((char) ((i7 / 10) + 48));
            stringBuffer.append((char) ((i7 % 10) + 48));
        }
    }

    public static class TwoDigitNumberField implements NumberRule {
        private final int mField;

        public TwoDigitNumberField(int i7) {
            this.mField = i7;
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(this.mField));
        }

        @Override
        public int estimateLength() {
            return 2;
        }

        @Override
        public final void appendTo(StringBuffer stringBuffer, int i7) {
            if (i7 < 100) {
                stringBuffer.append((char) ((i7 / 10) + 48));
                stringBuffer.append((char) ((i7 % 10) + 48));
                return;
            }
            stringBuffer.append(Integer.toString(i7));
        }
    }

    public static class TwoDigitYearField implements NumberRule {
        static final TwoDigitYearField INSTANCE = new TwoDigitYearField();

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(1) % 100);
        }

        @Override
        public int estimateLength() {
            return 2;
        }

        @Override
        public final void appendTo(StringBuffer stringBuffer, int i7) {
            stringBuffer.append((char) ((i7 / 10) + 48));
            stringBuffer.append((char) ((i7 % 10) + 48));
        }
    }

    public static class UnpaddedMonthField implements NumberRule {
        static final UnpaddedMonthField INSTANCE = new UnpaddedMonthField();

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(2) + 1);
        }

        @Override
        public int estimateLength() {
            return 2;
        }

        @Override
        public final void appendTo(StringBuffer stringBuffer, int i7) {
            if (i7 < 10) {
                stringBuffer.append((char) (i7 + 48));
                return;
            }
            stringBuffer.append((char) ((i7 / 10) + 48));
            stringBuffer.append((char) ((i7 % 10) + 48));
        }
    }

    public static class UnpaddedNumberField implements NumberRule {
        private final int mField;

        public UnpaddedNumberField(int i7) {
            this.mField = i7;
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(this.mField));
        }

        @Override
        public int estimateLength() {
            return 4;
        }

        @Override
        public final void appendTo(StringBuffer stringBuffer, int i7) {
            if (i7 < 10) {
                stringBuffer.append((char) (i7 + 48));
            } else if (i7 < 100) {
                stringBuffer.append((char) ((i7 / 10) + 48));
                stringBuffer.append((char) ((i7 % 10) + 48));
            } else {
                stringBuffer.append(Integer.toString(i7));
            }
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

    public static String getTimeZoneDisplay(TimeZone timeZone, boolean z9, int i7, Locale locale) {
        TimeZoneDisplayKey timeZoneDisplayKey = new TimeZoneDisplayKey(timeZone, z9, i7, locale);
        ConcurrentMap<TimeZoneDisplayKey, String> concurrentMap = cTimeZoneDisplayCache;
        String str = concurrentMap.get(timeZoneDisplayKey);
        if (str == null) {
            String displayName = timeZone.getDisplayName(z9, i7, locale);
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
        int i7 = 0;
        while (true) {
            length--;
            if (length >= 0) {
                i7 += this.mRules[length].estimateLength();
            } else {
                this.mMaxLengthEstimate = i7;
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
        if (obj instanceof Date) {
            return format((Date) obj, stringBuffer);
        }
        if (obj instanceof Calendar) {
            return format((Calendar) obj, stringBuffer);
        }
        if (obj instanceof Long) {
            return format(((Long) obj).longValue(), stringBuffer);
        }
        throw new IllegalArgumentException("Unknown class: ".concat(obj == null ? "<null>" : obj.getClass().getName()));
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
        int i7;
        int i10;
        NumberRule selectNumberRule;
        TwoDigitYearField twoDigitYearField;
        int i11;
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
        int i12 = 0;
        int i13 = 0;
        while (i13 < length) {
            int[] iArr = {i13};
            String parseToken = parseToken(this.mPattern, iArr);
            int i14 = iArr[i12];
            int length2 = parseToken.length();
            if (length2 != 0) {
                char charAt = parseToken.charAt(i12);
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
                                i10 = 1;
                                selectNumberRule = numberRule2;
                                i7 = 0;
                                break;
                            case 'S':
                                i11 = 1;
                                numberRule = selectNumberRule(14, length2);
                                selectNumberRule = numberRule;
                                i10 = i11;
                                i7 = 0;
                                break;
                            case 'W':
                                i11 = 1;
                                numberRule = selectNumberRule(4, length2);
                                selectNumberRule = numberRule;
                                i10 = i11;
                                i7 = 0;
                                break;
                            case 'Z':
                                i11 = 1;
                                if (length2 == 1) {
                                    numberRule = TimeZoneNumberRule.INSTANCE_NO_COLON;
                                } else {
                                    numberRule = TimeZoneNumberRule.INSTANCE_COLON;
                                }
                                selectNumberRule = numberRule;
                                i10 = i11;
                                i7 = 0;
                                break;
                            case 'a':
                                textField = new TextField(9, amPmStrings);
                                numberRule2 = textField;
                                i10 = 1;
                                selectNumberRule = numberRule2;
                                i7 = 0;
                                break;
                            case 'd':
                                textField = selectNumberRule(5, length2);
                                numberRule2 = textField;
                                i10 = 1;
                                selectNumberRule = numberRule2;
                                i7 = 0;
                                break;
                            case 'h':
                                textField = new TwelveHourField(selectNumberRule(10, length2));
                                numberRule2 = textField;
                                i10 = 1;
                                selectNumberRule = numberRule2;
                                i7 = 0;
                                break;
                            case 'k':
                                textField = new TwentyFourHourField(selectNumberRule(11, length2));
                                numberRule2 = textField;
                                i10 = 1;
                                selectNumberRule = numberRule2;
                                i7 = 0;
                                break;
                            case 'm':
                                textField = selectNumberRule(12, length2);
                                numberRule2 = textField;
                                i10 = 1;
                                selectNumberRule = numberRule2;
                                i7 = 0;
                                break;
                            case 's':
                                textField = selectNumberRule(13, length2);
                                numberRule2 = textField;
                                i10 = 1;
                                selectNumberRule = numberRule2;
                                i7 = 0;
                                break;
                            case 'w':
                                textField = selectNumberRule(3, length2);
                                numberRule2 = textField;
                                i10 = 1;
                                selectNumberRule = numberRule2;
                                i7 = 0;
                                break;
                            default:
                                switch (charAt) {
                                    case 'D':
                                        textField = selectNumberRule(6, length2);
                                        numberRule2 = textField;
                                        i10 = 1;
                                        selectNumberRule = numberRule2;
                                        i7 = 0;
                                        break;
                                    case 'E':
                                        if (length2 < 4) {
                                            strArr = shortWeekdays;
                                        } else {
                                            strArr = weekdays;
                                        }
                                        numberRule2 = new TextField(7, strArr);
                                        i10 = 1;
                                        selectNumberRule = numberRule2;
                                        i7 = 0;
                                        break;
                                    case 'F':
                                        textField = selectNumberRule(8, length2);
                                        numberRule2 = textField;
                                        i10 = 1;
                                        selectNumberRule = numberRule2;
                                        i7 = 0;
                                        break;
                                    case 'G':
                                        i7 = 0;
                                        twoDigitYearField = new TextField(0, eras);
                                        break;
                                    case 'H':
                                        textField = selectNumberRule(11, length2);
                                        numberRule2 = textField;
                                        i10 = 1;
                                        selectNumberRule = numberRule2;
                                        i7 = 0;
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
                                                throw new IllegalArgumentException("Illegal pattern component: ".concat(parseToken));
                                        }
                                        numberRule2 = textField;
                                        i10 = 1;
                                        selectNumberRule = numberRule2;
                                        i7 = 0;
                                        break;
                                }
                                selectNumberRule = twoDigitYearField;
                                i10 = 1;
                                break;
                        }
                    } else if (length2 >= 4) {
                        i11 = 1;
                        numberRule = new TimeZoneNameRule(this.mTimeZone, this.mLocale, 1);
                        selectNumberRule = numberRule;
                        i10 = i11;
                        i7 = 0;
                    } else {
                        i7 = 0;
                        twoDigitYearField = new TimeZoneNameRule(this.mTimeZone, this.mLocale, 0);
                        selectNumberRule = twoDigitYearField;
                        i10 = 1;
                    }
                } else {
                    i7 = 0;
                    if (length2 == 2) {
                        twoDigitYearField = TwoDigitYearField.INSTANCE;
                        selectNumberRule = twoDigitYearField;
                        i10 = 1;
                    } else {
                        if (length2 < 4) {
                            length2 = 4;
                        }
                        i10 = 1;
                        selectNumberRule = selectNumberRule(1, length2);
                    }
                }
                arrayList.add(selectNumberRule);
                i13 = i14 + i10;
                i12 = i7;
            } else {
                return arrayList;
            }
        }
        return arrayList;
    }

    public String parseToken(String str, int[] iArr) {
        StringBuilder sb2 = new StringBuilder();
        int i7 = iArr[0];
        int length = str.length();
        char charAt = str.charAt(i7);
        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
            sb2.append(charAt);
            while (true) {
                int i10 = i7 + 1;
                if (i10 >= length || str.charAt(i10) != charAt) {
                    break;
                }
                sb2.append(charAt);
                i7 = i10;
            }
        } else {
            sb2.append('\'');
            boolean z9 = false;
            while (i7 < length) {
                char charAt2 = str.charAt(i7);
                if (charAt2 == '\'') {
                    int i11 = i7 + 1;
                    if (i11 < length && str.charAt(i11) == '\'') {
                        sb2.append(charAt2);
                        i7 = i11;
                    } else {
                        z9 = !z9;
                    }
                } else if (!z9 && ((charAt2 >= 'A' && charAt2 <= 'Z') || (charAt2 >= 'a' && charAt2 <= 'z'))) {
                    i7--;
                    break;
                } else {
                    sb2.append(charAt2);
                }
                i7++;
            }
        }
        iArr[0] = i7;
        return sb2.toString();
    }

    public NumberRule selectNumberRule(int i7, int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return new PaddedNumberField(i7, i10);
            }
            return new TwoDigitNumberField(i7);
        }
        return new UnpaddedNumberField(i7);
    }

    public String toString() {
        return "FastDatePrinter[" + this.mPattern + "," + this.mLocale + "," + this.mTimeZone.getID() + "]";
    }

    public static class TwelveHourField implements NumberRule {
        private final NumberRule mRule;

        public TwelveHourField(NumberRule numberRule) {
            this.mRule = numberRule;
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            int i7 = calendar.get(10);
            if (i7 == 0) {
                i7 = calendar.getLeastMaximum(10) + 1;
            }
            this.mRule.appendTo(stringBuffer, i7);
        }

        @Override
        public int estimateLength() {
            return this.mRule.estimateLength();
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, int i7) {
            this.mRule.appendTo(stringBuffer, i7);
        }
    }

    public static class TwentyFourHourField implements NumberRule {
        private final NumberRule mRule;

        public TwentyFourHourField(NumberRule numberRule) {
            this.mRule = numberRule;
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            int i7 = calendar.get(11);
            if (i7 == 0) {
                i7 = calendar.getMaximum(11) + 1;
            }
            this.mRule.appendTo(stringBuffer, i7);
        }

        @Override
        public int estimateLength() {
            return this.mRule.estimateLength();
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, int i7) {
            this.mRule.appendTo(stringBuffer, i7);
        }
    }

    @Override
    public String format(long j3) {
        GregorianCalendar newCalendar = newCalendar();
        newCalendar.setTimeInMillis(j3);
        return applyRulesToString(newCalendar);
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
    public StringBuffer format(long j3, StringBuffer stringBuffer) {
        return format(new Date(j3), stringBuffer);
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
