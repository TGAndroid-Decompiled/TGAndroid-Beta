package kotlin.text;

import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

public abstract class StringsKt__StringsKt extends StringsKt__StringNumberConversionsJVMKt {
    public static boolean contains$default(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return indexOf(str, str2, 0, false) >= 0;
    }

    public static final int getLastIndex(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int indexOf(String str, String string, int i, boolean z) {
        char upperCase;
        char upperCase2;
        String str2;
        String str3;
        boolean z2;
        boolean zRegionMatches;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (!z) {
            return str.indexOf(string, i);
        }
        int length = str.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = str.length();
        if (length > length2) {
            length = length2;
        }
        IntRange intRange = new IntRange(i, length, 1);
        boolean zM82m = Fragment$$ExternalSyntheticOutline0.m82m((Object) str);
        int i2 = intRange.step;
        int i3 = intRange.last;
        if (zM82m && Fragment$$ExternalSyntheticOutline0.m82m((Object) string)) {
            if ((i2 <= 0 || i > i3) && (i2 >= 0 || i3 > i)) {
                return -1;
            }
            int i4 = i;
            while (true) {
                int length3 = string.length();
                if (z) {
                    str2 = str;
                    str3 = string;
                    z2 = z;
                    zRegionMatches = str3.regionMatches(z2, 0, str2, i4, length3);
                } else {
                    zRegionMatches = string.regionMatches(0, str, i4, length3);
                    str2 = str;
                    str3 = string;
                    z2 = z;
                }
                if (zRegionMatches) {
                    return i4;
                }
                if (i4 == i3) {
                    return -1;
                }
                i4 += i2;
                string = str3;
                z = z2;
                str = str2;
            }
        } else {
            if ((i2 <= 0 || i > i3) && (i2 >= 0 || i3 > i)) {
                return -1;
            }
            while (true) {
                int length4 = string.length();
                if (i >= 0 && string.length() - length4 >= 0 && i <= str.length() - length4) {
                    for (int i5 = 0; i5 < length4; i5++) {
                        char cCharAt = string.charAt(i5);
                        char cCharAt2 = str.charAt(i + i5);
                        if (cCharAt == cCharAt2 || (z && ((upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(cCharAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                        }
                    }
                    return i;
                }
                if (i == i3) {
                    return -1;
                }
                i += i2;
            }
        }
    }

    public static boolean isBlank(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static String padEnd$default(int i, String str) {
        CharSequence charSequenceSubSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(Fragment$$ExternalSyntheticOutline0.m(i, "Desired length ", " is less than zero."));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append((CharSequence) str);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(' ');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static String replace$default(String str, String str2, String newValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int iIndexOf = indexOf(str, str2, 0, false);
        if (iIndexOf < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(newValue);
            i2 = iIndexOf + length;
            if (iIndexOf >= str.length()) {
                break;
            }
            iIndexOf = indexOf(str, str2, iIndexOf + i, false);
        } while (iIndexOf > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static boolean startsWith$default(String str, String prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return str.startsWith(prefix);
    }

    public static String substringAfter(String str, String delimiter, String str2) {
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        int iIndexOf = indexOf(str, delimiter, 0, false);
        if (iIndexOf == -1) {
            return str2;
        }
        String strSubstring = str.substring(delimiter.length() + iIndexOf, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String substringAfterLast(String str, String str2) {
        int iLastIndexOf = str.lastIndexOf(46, getLastIndex(str));
        if (iLastIndexOf == -1) {
            return str2;
        }
        String strSubstring = str.substring(iLastIndexOf + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }
}
