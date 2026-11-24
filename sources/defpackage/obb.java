package defpackage;
public abstract class obb extends nbb {
    public static Integer b(String str) {
        boolean z;
        int i;
        int i2;
        str.getClass();
        int length = str.length();
        if (length != 0) {
            int i3 = 0;
            char charAt = str.charAt(0);
            int i4 = -2147483647;
            if (rr5.b(charAt, 48) < 0) {
                i = 1;
                if (length != 1) {
                    if (charAt != '+') {
                        if (charAt == '-') {
                            i4 = Integer.MIN_VALUE;
                            z = true;
                        } else {
                            return null;
                        }
                    } else {
                        z = false;
                    }
                } else {
                    return null;
                }
            } else {
                z = false;
                i = 0;
            }
            int i5 = -59652323;
            while (i < length) {
                int digit = Character.digit((int) str.charAt(i), 10);
                if (digit >= 0) {
                    if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + digit) {
                        return null;
                    }
                    i3 = i2 - digit;
                    i++;
                } else {
                    return null;
                }
            }
            if (z) {
                return Integer.valueOf(i3);
            }
            return Integer.valueOf(-i3);
        }
        return null;
    }
}
