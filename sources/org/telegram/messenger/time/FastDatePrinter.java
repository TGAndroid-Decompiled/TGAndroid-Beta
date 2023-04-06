package org.telegram.messenger.time;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
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
import org.telegram.messenger.FileLoader;
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

    public interface NumberRule extends Rule {
        void appendTo(StringBuffer stringBuffer, int i);
    }

    public interface Rule {
        void appendTo(StringBuffer stringBuffer, Calendar calendar);

        int estimateLength();
    }

    public FastDatePrinter(String str, TimeZone timeZone, Locale locale) {
        this.mPattern = str;
        this.mTimeZone = timeZone;
        this.mLocale = locale;
        init();
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

    protected List<Rule> parsePattern() {
        NumberRule selectNumberRule;
        TwoDigitYearField twoDigitYearField;
        ?? timeZoneNameRule;
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(this.mLocale);
        ArrayList arrayList = new ArrayList();
        String[] eras = dateFormatSymbols.getEras();
        String[] months = dateFormatSymbols.getMonths();
        String[] shortMonths = dateFormatSymbols.getShortMonths();
        String[] weekdays = dateFormatSymbols.getWeekdays();
        String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
        String[] amPmStrings = dateFormatSymbols.getAmPmStrings();
        int length = this.mPattern.length();
        int[] iArr = new int[1];
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            iArr[i] = i2;
            String parseToken = parseToken(this.mPattern, iArr);
            int i3 = iArr[i];
            int length2 = parseToken.length();
            if (length2 == 0) {
                return arrayList;
            }
            char charAt = parseToken.charAt(i);
            if (charAt != 'y') {
                if (charAt != 'z') {
                    switch (charAt) {
                        case '\'':
                            String substring = parseToken.substring(1);
                            if (substring.length() == 1) {
                                timeZoneNameRule = new CharacterLiteral(substring.charAt(0));
                                break;
                            } else {
                                timeZoneNameRule = new StringLiteral(substring);
                                break;
                            }
                        case 'S':
                            selectNumberRule = selectNumberRule(14, length2);
                            break;
                        case 'W':
                            selectNumberRule = selectNumberRule(4, length2);
                            break;
                        case 'Z':
                            if (length2 == 1) {
                                selectNumberRule = TimeZoneNumberRule.INSTANCE_NO_COLON;
                                break;
                            } else {
                                selectNumberRule = TimeZoneNumberRule.INSTANCE_COLON;
                                break;
                            }
                        case 'a':
                            timeZoneNameRule = new TextField(9, amPmStrings);
                            break;
                        case FileLoader.MEDIA_DIR_IMAGE_PUBLIC:
                            timeZoneNameRule = selectNumberRule(5, length2);
                            break;
                        case 'h':
                            timeZoneNameRule = new TwelveHourField(selectNumberRule(10, length2));
                            break;
                        case 'k':
                            timeZoneNameRule = new TwentyFourHourField(selectNumberRule(11, length2));
                            break;
                        case 'm':
                            timeZoneNameRule = selectNumberRule(12, length2);
                            break;
                        case 's':
                            timeZoneNameRule = selectNumberRule(13, length2);
                            break;
                        case 'w':
                            timeZoneNameRule = selectNumberRule(3, length2);
                            break;
                        default:
                            switch (charAt) {
                                case 'D':
                                    timeZoneNameRule = selectNumberRule(6, length2);
                                    break;
                                case 'E':
                                    timeZoneNameRule = new TextField(7, length2 < 4 ? shortWeekdays : weekdays);
                                    break;
                                case 'F':
                                    timeZoneNameRule = selectNumberRule(8, length2);
                                    break;
                                case 'G':
                                    timeZoneNameRule = new TextField(0, eras);
                                    break;
                                case 'H':
                                    timeZoneNameRule = selectNumberRule(11, length2);
                                    break;
                                default:
                                    switch (charAt) {
                                        case 'K':
                                            timeZoneNameRule = selectNumberRule(10, length2);
                                            break;
                                        case 'L':
                                            if (length2 < 4) {
                                                if (length2 != 3) {
                                                    if (length2 == 2) {
                                                        timeZoneNameRule = TwoDigitMonthField.INSTANCE;
                                                        break;
                                                    } else {
                                                        timeZoneNameRule = UnpaddedMonthField.INSTANCE;
                                                        break;
                                                    }
                                                } else {
                                                    timeZoneNameRule = new TextField(2, shortMonths);
                                                    break;
                                                }
                                            } else {
                                                timeZoneNameRule = new TextField(2, months);
                                                break;
                                            }
                                        case 'M':
                                            if (length2 < 4) {
                                                if (length2 != 3) {
                                                    if (length2 == 2) {
                                                        timeZoneNameRule = TwoDigitMonthField.INSTANCE;
                                                        break;
                                                    } else {
                                                        timeZoneNameRule = UnpaddedMonthField.INSTANCE;
                                                        break;
                                                    }
                                                } else {
                                                    timeZoneNameRule = new TextField(2, shortMonths);
                                                    break;
                                                }
                                            } else {
                                                timeZoneNameRule = new TextField(2, months);
                                                break;
                                            }
                                        default:
                                            throw new IllegalArgumentException("Illegal pattern component: " + parseToken);
                                    }
                            }
                    }
                } else if (length2 >= 4) {
                    timeZoneNameRule = new TimeZoneNameRule(this.mTimeZone, this.mLocale, 1);
                } else {
                    twoDigitYearField = new TimeZoneNameRule(this.mTimeZone, this.mLocale, 0);
                    selectNumberRule = twoDigitYearField;
                }
                selectNumberRule = timeZoneNameRule;
            } else if (length2 == 2) {
                twoDigitYearField = TwoDigitYearField.INSTANCE;
                selectNumberRule = twoDigitYearField;
            } else {
                if (length2 < 4) {
                    length2 = 4;
                }
                selectNumberRule = selectNumberRule(1, length2);
            }
            arrayList.add(selectNumberRule);
            i2 = i3 + 1;
            i = 0;
        }
        return arrayList;
    }

    protected String parseToken(String str, int[] iArr) {
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
                if (charAt2 != '\'') {
                    if (!z && ((charAt2 >= 'A' && charAt2 <= 'Z') || (charAt2 >= 'a' && charAt2 <= 'z'))) {
                        i--;
                        break;
                    }
                    sb.append(charAt2);
                } else {
                    int i3 = i + 1;
                    if (i3 >= length || str.charAt(i3) != '\'') {
                        z = !z;
                    } else {
                        sb.append(charAt2);
                        i = i3;
                    }
                }
                i++;
            }
        }
        iArr[0] = i;
        return sb.toString();
    }

    protected NumberRule selectNumberRule(int i, int i2) {
        if (i2 != 1) {
            if (i2 == 2) {
                return new TwoDigitNumberField(i);
            }
            return new PaddedNumberField(i, i2);
        }
        return new UnpaddedNumberField(i);
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
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown class: ");
        sb.append(obj == null ? "<null>" : obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    @Override
    public String format(long j) {
        GregorianCalendar newCalendar = newCalendar();
        newCalendar.setTimeInMillis(j);
        return applyRulesToString(newCalendar);
    }

    private String applyRulesToString(Calendar calendar) {
        return applyRules(calendar, new StringBuffer(this.mMaxLengthEstimate)).toString();
    }

    private GregorianCalendar newCalendar() {
        return new GregorianCalendar(this.mTimeZone, this.mLocale);
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

    public StringBuffer applyRules(Calendar calendar, StringBuffer stringBuffer) {
        for (Rule rule : this.mRules) {
            rule.appendTo(stringBuffer, calendar);
        }
        return stringBuffer;
    }

    @Override
    public String getPattern() {
        return this.mPattern;
    }

    @Override
    public TimeZone getTimeZone() {
        return this.mTimeZone;
    }

    @Override
    public Locale getLocale() {
        return this.mLocale;
    }

    public int getMaxLengthEstimate() {
        return this.mMaxLengthEstimate;
    }

    public boolean equals(Object obj) {
        if (obj instanceof FastDatePrinter) {
            FastDatePrinter fastDatePrinter = (FastDatePrinter) obj;
            return this.mPattern.equals(fastDatePrinter.mPattern) && this.mTimeZone.equals(fastDatePrinter.mTimeZone) && this.mLocale.equals(fastDatePrinter.mLocale);
        }
        return false;
    }

    public int hashCode() {
        return this.mPattern.hashCode() + ((this.mTimeZone.hashCode() + (this.mLocale.hashCode() * 13)) * 13);
    }

    public String toString() {
        return "FastDatePrinter[" + this.mPattern + "," + this.mLocale + "," + this.mTimeZone.getID() + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        init();
    }

    public static class CharacterLiteral implements Rule {
        private final char mValue;

        @Override
        public int estimateLength() {
            return 1;
        }

        CharacterLiteral(char c) {
            this.mValue = c;
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.mValue);
        }
    }

    public static class StringLiteral implements Rule {
        private final String mValue;

        StringLiteral(String str) {
            this.mValue = str;
        }

        @Override
        public int estimateLength() {
            return this.mValue.length();
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.mValue);
        }
    }

    public static class TextField implements Rule {
        private final int mField;
        private final String[] mValues;

        TextField(int i, String[] strArr) {
            this.mField = i;
            this.mValues = strArr;
        }

        @Override
        public int estimateLength() {
            int length = this.mValues.length;
            int i = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i;
                }
                int length2 = this.mValues[length].length();
                if (length2 > i) {
                    i = length2;
                }
            }
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.mValues[calendar.get(this.mField)]);
        }
    }

    public static class UnpaddedNumberField implements NumberRule {
        private final int mField;

        @Override
        public int estimateLength() {
            return 4;
        }

        UnpaddedNumberField(int i) {
            this.mField = i;
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(this.mField));
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
    }

    public static class UnpaddedMonthField implements NumberRule {
        static final UnpaddedMonthField INSTANCE = new UnpaddedMonthField();

        @Override
        public int estimateLength() {
            return 2;
        }

        UnpaddedMonthField() {
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(2) + 1);
        }

        @Override
        public final void appendTo(StringBuffer stringBuffer, int i) {
            if (i < 10) {
                stringBuffer.append((char) (i + 48));
                return;
            }
            stringBuffer.append((char) ((i / 10) + 48));
            stringBuffer.append((char) ((i % 10) + 48));
        }
    }

    public static class PaddedNumberField implements NumberRule {
        private final int mField;
        private final int mSize;

        @Override
        public int estimateLength() {
            return 4;
        }

        PaddedNumberField(int i, int i2) {
            if (i2 < 3) {
                throw new IllegalArgumentException();
            }
            this.mField = i;
            this.mSize = i2;
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(this.mField));
        }

        @Override
        public final void appendTo(StringBuffer stringBuffer, int i) {
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
                int length = i < 1000 ? 3 : Integer.toString(i).length();
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
    }

    public static class TwoDigitNumberField implements NumberRule {
        private final int mField;

        @Override
        public int estimateLength() {
            return 2;
        }

        TwoDigitNumberField(int i) {
            this.mField = i;
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(this.mField));
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
    }

    public static class TwoDigitYearField implements NumberRule {
        static final TwoDigitYearField INSTANCE = new TwoDigitYearField();

        @Override
        public int estimateLength() {
            return 2;
        }

        TwoDigitYearField() {
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(1) % 100);
        }

        @Override
        public final void appendTo(StringBuffer stringBuffer, int i) {
            stringBuffer.append((char) ((i / 10) + 48));
            stringBuffer.append((char) ((i % 10) + 48));
        }
    }

    public static class TwoDigitMonthField implements NumberRule {
        static final TwoDigitMonthField INSTANCE = new TwoDigitMonthField();

        @Override
        public int estimateLength() {
            return 2;
        }

        TwoDigitMonthField() {
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(2) + 1);
        }

        @Override
        public final void appendTo(StringBuffer stringBuffer, int i) {
            stringBuffer.append((char) ((i / 10) + 48));
            stringBuffer.append((char) ((i % 10) + 48));
        }
    }

    public static class TwelveHourField implements NumberRule {
        private final NumberRule mRule;

        TwelveHourField(NumberRule numberRule) {
            this.mRule = numberRule;
        }

        @Override
        public int estimateLength() {
            return this.mRule.estimateLength();
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
        public void appendTo(StringBuffer stringBuffer, int i) {
            this.mRule.appendTo(stringBuffer, i);
        }
    }

    public static class TwentyFourHourField implements NumberRule {
        private final NumberRule mRule;

        TwentyFourHourField(NumberRule numberRule) {
            this.mRule = numberRule;
        }

        @Override
        public int estimateLength() {
            return this.mRule.estimateLength();
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
        public void appendTo(StringBuffer stringBuffer, int i) {
            this.mRule.appendTo(stringBuffer, i);
        }
    }

    static String getTimeZoneDisplay(TimeZone timeZone, boolean z, int i, Locale locale) {
        TimeZoneDisplayKey timeZoneDisplayKey = new TimeZoneDisplayKey(timeZone, z, i, locale);
        ConcurrentMap<TimeZoneDisplayKey, String> concurrentMap = cTimeZoneDisplayCache;
        String str = concurrentMap.get(timeZoneDisplayKey);
        if (str == null) {
            String displayName = timeZone.getDisplayName(z, i, locale);
            String putIfAbsent = concurrentMap.putIfAbsent(timeZoneDisplayKey, displayName);
            return putIfAbsent != null ? putIfAbsent : displayName;
        }
        return str;
    }

    public static class TimeZoneNameRule implements Rule {
        private final String mDaylight;
        private final Locale mLocale;
        private final String mStandard;
        private final int mStyle;

        TimeZoneNameRule(TimeZone timeZone, Locale locale, int i) {
            this.mLocale = locale;
            this.mStyle = i;
            this.mStandard = FastDatePrinter.getTimeZoneDisplay(timeZone, false, i, locale);
            this.mDaylight = FastDatePrinter.getTimeZoneDisplay(timeZone, true, i, locale);
        }

        @Override
        public int estimateLength() {
            return Math.max(this.mStandard.length(), this.mDaylight.length());
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
    }

    public static class TimeZoneNumberRule implements Rule {
        static final TimeZoneNumberRule INSTANCE_COLON = new TimeZoneNumberRule(true);
        static final TimeZoneNumberRule INSTANCE_NO_COLON = new TimeZoneNumberRule(false);
        final boolean mColon;

        @Override
        public int estimateLength() {
            return 5;
        }

        TimeZoneNumberRule(boolean z) {
            this.mColon = z;
        }

        @Override
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            int i = calendar.get(15) + calendar.get(16);
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
    }

    public static class TimeZoneDisplayKey {
        private final Locale mLocale;
        private final int mStyle;
        private final TimeZone mTimeZone;

        TimeZoneDisplayKey(TimeZone timeZone, boolean z, int i, Locale locale) {
            this.mTimeZone = timeZone;
            if (z) {
                this.mStyle = Integer.MIN_VALUE | i;
            } else {
                this.mStyle = i;
            }
            this.mLocale = locale;
        }

        public int hashCode() {
            return (((this.mStyle * 31) + this.mLocale.hashCode()) * 31) + this.mTimeZone.hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TimeZoneDisplayKey) {
                TimeZoneDisplayKey timeZoneDisplayKey = (TimeZoneDisplayKey) obj;
                return this.mTimeZone.equals(timeZoneDisplayKey.mTimeZone) && this.mStyle == timeZoneDisplayKey.mStyle && this.mLocale.equals(timeZoneDisplayKey.mLocale);
            }
            return false;
        }
    }
}
