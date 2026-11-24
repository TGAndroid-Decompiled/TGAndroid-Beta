package defpackage;
public abstract class f9b extends n9b {
    public static final int e(int i, CharSequence charSequence, String str, boolean z) {
        String str2;
        boolean z2;
        boolean regionMatches;
        charSequence.getClass();
        str.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        fp5 fp5Var = new fp5(i, length, 1);
        boolean z3 = charSequence instanceof String;
        int i2 = fp5Var.c;
        int i3 = fp5Var.b;
        if (z3) {
            if ((i2 > 0 && i <= i3) || (i2 < 0 && i3 <= i)) {
                int i4 = i;
                while (true) {
                    String str3 = (String) charSequence;
                    int length3 = str.length();
                    if (!z) {
                        regionMatches = str.regionMatches(0, str3, i4, length3);
                        str2 = str;
                        z2 = z;
                    } else {
                        str2 = str;
                        z2 = z;
                        regionMatches = str2.regionMatches(z2, 0, str3, i4, length3);
                    }
                    if (regionMatches) {
                        return i4;
                    }
                    if (i4 != i3) {
                        i4 += i2;
                        str = str2;
                        z = z2;
                    } else {
                        return -1;
                    }
                }
            } else {
                return -1;
            }
        } else if ((i2 <= 0 || i > i3) && (i2 >= 0 || i3 > i)) {
            return -1;
        } else {
            while (true) {
                int length4 = str.length();
                if (i >= 0 && str.length() - length4 >= 0 && i <= charSequence.length() - length4) {
                    for (int i5 = 0; i5 < length4; i5++) {
                        if (xqd.a(str.charAt(i5), charSequence.charAt(i + i5), z)) {
                        }
                    }
                    return i;
                }
                if (i != i3) {
                    i += i2;
                } else {
                    return -1;
                }
            }
        }
    }

    public static int f(int i, int i2, CharSequence charSequence, String str) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return e(i, charSequence, str, false);
    }

    public static int g(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        if (!(charSequence instanceof String)) {
            char[] cArr = {c};
            if (charSequence instanceof String) {
                return ((String) charSequence).indexOf(cArr[0], i);
            }
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length() - 1;
            if (i <= length) {
                while (!xqd.a(cArr[0], charSequence.charAt(i), false)) {
                    if (i != length) {
                        i++;
                    } else {
                        return -1;
                    }
                }
                return i;
            }
            return -1;
        }
        return ((String) charSequence).indexOf(c, i);
    }

    public static boolean h(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static String i(int i, String str) {
        CharSequence charSequence;
        str.getClass();
        if (i >= 0) {
            if (i <= str.length()) {
                charSequence = str.subSequence(0, str.length());
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
                charSequence = sb;
            }
            return charSequence.toString();
        }
        w26.j(tb4.n(i, "Desired length ", " is less than zero."));
        return null;
    }

    public static String j(String str, String str2, String str3) {
        int f = f(0, 6, str, str2);
        if (f == -1) {
            return str3;
        }
        return str.substring(str2.length() + f, str.length());
    }
}
