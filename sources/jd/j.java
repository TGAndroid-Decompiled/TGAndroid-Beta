package jd;
public abstract class j extends i {
    public static boolean b(String str, String str2) {
        kotlin.jvm.internal.j.e(str, "<this>");
        if (d(0, str, str2, false) < 0) {
            return false;
        }
        return true;
    }

    public static final int c(CharSequence charSequence) {
        kotlin.jvm.internal.j.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int d(int i10, CharSequence charSequence, String string, boolean z4) {
        char upperCase;
        char upperCase2;
        boolean z10;
        String str;
        boolean z11;
        boolean regionMatches;
        kotlin.jvm.internal.j.e(charSequence, "<this>");
        kotlin.jvm.internal.j.e(string, "string");
        if (!z4 && (charSequence instanceof String)) {
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
        gd.d dVar = new gd.d(i10, length, 1);
        boolean z12 = charSequence instanceof String;
        int i11 = dVar.f7024c;
        int i12 = dVar.f7023b;
        if (z12 && e2.c.s(string)) {
            if ((i11 > 0 && i10 <= i12) || (i11 < 0 && i12 <= i10)) {
                int i13 = i10;
                while (true) {
                    String str2 = (String) charSequence;
                    int length3 = string.length();
                    if (!z4) {
                        regionMatches = string.regionMatches(0, str2, i13, length3);
                        str = string;
                        z11 = z4;
                    } else {
                        str = string;
                        z11 = z4;
                        regionMatches = str.regionMatches(z11, 0, str2, i13, length3);
                    }
                    if (regionMatches) {
                        return i13;
                    }
                    if (i13 != i12) {
                        i13 += i11;
                        string = str;
                        z4 = z11;
                    } else {
                        return -1;
                    }
                }
            } else {
                return -1;
            }
        } else if ((i11 <= 0 || i10 > i12) && (i11 >= 0 || i12 > i10)) {
            return -1;
        } else {
            while (true) {
                int length4 = string.length();
                if (i10 >= 0 && string.length() - length4 >= 0 && i10 <= charSequence.length() - length4) {
                    for (int i14 = 0; i14 < length4; i14++) {
                        char charAt = string.charAt(i14);
                        char charAt2 = charSequence.charAt(i10 + i14);
                        if (charAt == charAt2 || (z4 && ((upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(charAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                        }
                    }
                    return i10;
                }
                if (i10 != i12) {
                    i10 += i11;
                } else {
                    return -1;
                }
            }
        }
    }

    public static boolean e(String str) {
        kotlin.jvm.internal.j.e(str, "<this>");
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static String f(int i10, String str) {
        CharSequence charSequence;
        kotlin.jvm.internal.j.e(str, "<this>");
        if (i10 >= 0) {
            if (i10 <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb = new StringBuilder(i10);
                sb.append((CharSequence) str);
                int length = i10 - str.length();
                int i11 = 1;
                if (1 <= length) {
                    while (true) {
                        sb.append(' ');
                        if (i11 == length) {
                            break;
                        }
                        i11++;
                    }
                }
                charSequence = sb;
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(l.d.k(i10, "Desired length ", " is less than zero."));
    }

    public static String g(String str, String str2, String newValue) {
        kotlin.jvm.internal.j.e(str, "<this>");
        kotlin.jvm.internal.j.e(newValue, "newValue");
        int d = d(0, str, str2, false);
        if (d < 0) {
            return str;
        }
        int length = str2.length();
        int i10 = 1;
        if (length >= 1) {
            i10 = length;
        }
        int length2 = newValue.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            int i11 = 0;
            do {
                sb.append((CharSequence) str, i11, d);
                sb.append(newValue);
                i11 = d + length;
                if (d >= str.length()) {
                    break;
                }
                d = d(d + i10, str, str2, false);
            } while (d > 0);
            sb.append((CharSequence) str, i11, str.length());
            String sb2 = sb.toString();
            kotlin.jvm.internal.j.d(sb2, "toString(...)");
            return sb2;
        }
        throw new OutOfMemoryError();
    }

    public static boolean h(String str, String prefix) {
        kotlin.jvm.internal.j.e(str, "<this>");
        kotlin.jvm.internal.j.e(prefix, "prefix");
        return str.startsWith(prefix);
    }

    public static String i(String str, String delimiter, String str2) {
        kotlin.jvm.internal.j.e(delimiter, "delimiter");
        int d = d(0, str, delimiter, false);
        if (d == -1) {
            return str2;
        }
        String substring = str.substring(delimiter.length() + d, str.length());
        kotlin.jvm.internal.j.d(substring, "substring(...)");
        return substring;
    }

    public static String j(String str, String str2) {
        int lastIndexOf = str.lastIndexOf(46, c(str));
        if (lastIndexOf == -1) {
            return str2;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        kotlin.jvm.internal.j.d(substring, "substring(...)");
        return substring;
    }
}
