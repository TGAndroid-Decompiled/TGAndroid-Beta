package gd;

public abstract class j extends i {
    public static boolean b(String str, String str2) {
        kotlin.jvm.internal.j.e(str, "<this>");
        return d(0, str, str2, false) >= 0;
    }

    public static final int c(CharSequence charSequence) {
        kotlin.jvm.internal.j.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int d(int i10, CharSequence charSequence, String string, boolean z10) {
        char upperCase;
        char upperCase2;
        String str;
        boolean z11;
        boolean zRegionMatches;
        kotlin.jvm.internal.j.e(charSequence, "<this>");
        kotlin.jvm.internal.j.e(string, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i10);
        }
        int length = charSequence.length();
        if (i10 < 0) {
            i10 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        dd.e eVar = new dd.e(i10, length, 1);
        boolean z12 = charSequence instanceof String;
        int i11 = eVar.f4916c;
        int i12 = eVar.f4915b;
        if (z12 && com.google.android.recaptcha.internal.a.u(string)) {
            if ((i11 <= 0 || i10 > i12) && (i11 >= 0 || i12 > i10)) {
                return -1;
            }
            int i13 = i10;
            while (true) {
                String str2 = (String) charSequence;
                int length3 = string.length();
                if (z10) {
                    str = string;
                    z11 = z10;
                    zRegionMatches = str.regionMatches(z11, 0, str2, i13, length3);
                } else {
                    zRegionMatches = string.regionMatches(0, str2, i13, length3);
                    str = string;
                    z11 = z10;
                }
                if (zRegionMatches) {
                    return i13;
                }
                if (i13 == i12) {
                    return -1;
                }
                i13 += i11;
                string = str;
                z10 = z11;
            }
        } else {
            if ((i11 <= 0 || i10 > i12) && (i11 >= 0 || i12 > i10)) {
                return -1;
            }
            while (true) {
                int length4 = string.length();
                if (i10 >= 0 && string.length() - length4 >= 0 && i10 <= charSequence.length() - length4) {
                    for (int i14 = 0; i14 < length4; i14++) {
                        char cCharAt = string.charAt(i14);
                        char cCharAt2 = charSequence.charAt(i10 + i14);
                        if (cCharAt == cCharAt2 || (z10 && ((upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(cCharAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                        }
                    }
                    return i10;
                }
                if (i10 == i12) {
                    return -1;
                }
                i10 += i11;
            }
        }
    }

    public static boolean e(String str) {
        kotlin.jvm.internal.j.e(str, "<this>");
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static String f(int i10, String str) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.j.e(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(i0.a.l(i10, "Desired length ", " is less than zero."));
        }
        if (i10 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i10);
            sb2.append((CharSequence) str);
            int length = i10 - str.length();
            int i11 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append(' ');
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            charSequenceSubSequence = sb2;
        }
        return charSequenceSubSequence.toString();
    }

    public static String g(String str, String str2, String newValue) {
        kotlin.jvm.internal.j.e(str, "<this>");
        kotlin.jvm.internal.j.e(newValue, "newValue");
        int iD = d(0, str, str2, false);
        if (iD < 0) {
            return str;
        }
        int length = str2.length();
        int i10 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        int i11 = 0;
        do {
            sb2.append((CharSequence) str, i11, iD);
            sb2.append(newValue);
            i11 = iD + length;
            if (iD >= str.length()) {
                break;
            }
            iD = d(iD + i10, str, str2, false);
        } while (iD > 0);
        sb2.append((CharSequence) str, i11, str.length());
        String string = sb2.toString();
        kotlin.jvm.internal.j.d(string, "toString(...)");
        return string;
    }

    public static boolean h(String str, String prefix) {
        kotlin.jvm.internal.j.e(str, "<this>");
        kotlin.jvm.internal.j.e(prefix, "prefix");
        return str.startsWith(prefix);
    }

    public static String i(String str, String delimiter, String str2) {
        kotlin.jvm.internal.j.e(delimiter, "delimiter");
        int iD = d(0, str, delimiter, false);
        if (iD == -1) {
            return str2;
        }
        String strSubstring = str.substring(delimiter.length() + iD, str.length());
        kotlin.jvm.internal.j.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String j(String str, String str2) {
        int iLastIndexOf = str.lastIndexOf(46, c(str));
        if (iLastIndexOf == -1) {
            return str2;
        }
        String strSubstring = str.substring(iLastIndexOf + 1, str.length());
        kotlin.jvm.internal.j.d(strSubstring, "substring(...)");
        return strSubstring;
    }
}
