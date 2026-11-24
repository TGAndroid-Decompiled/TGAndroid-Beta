package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public abstract class gle {
    public static List a(int... iArr) {
        if (iArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        return new xp5(0, iArr.length, iArr);
    }

    public static int b(long j) {
        boolean z;
        int i = (int) j;
        if (i == j) {
            z = true;
        } else {
            z = false;
        }
        gre.d(j, "Out of range: %s", z);
        return i;
    }

    public static int c(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static int d(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int[] e(Collection collection) {
        if (collection instanceof xp5) {
            xp5 xp5Var = (xp5) collection;
            return Arrays.copyOfRange(xp5Var.a, xp5Var.b, xp5Var.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static Integer f(String str) {
        Long l;
        byte b;
        byte b2;
        str.getClass();
        if (!str.isEmpty()) {
            int i = 0;
            if (str.charAt(0) == '-') {
                i = 1;
            }
            if (i != str.length()) {
                int i2 = i + 1;
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    b = xf6.a[charAt];
                } else {
                    byte[] bArr = xf6.a;
                    b = -1;
                }
                if (b >= 0 && b < 10) {
                    long j = -b;
                    while (true) {
                        if (i2 < str.length()) {
                            int i3 = i2 + 1;
                            char charAt2 = str.charAt(i2);
                            if (charAt2 < 128) {
                                b2 = xf6.a[charAt2];
                            } else {
                                byte[] bArr2 = xf6.a;
                                b2 = -1;
                            }
                            if (b2 < 0 || b2 >= 10 || j < -922337203685477580L) {
                                break;
                            }
                            long j2 = j * 10;
                            long j3 = b2;
                            if (j2 < Long.MIN_VALUE + j3) {
                                break;
                            }
                            j = j2 - j3;
                            i2 = i3;
                        } else if (i != 0) {
                            l = Long.valueOf(j);
                        } else if (j != Long.MIN_VALUE) {
                            l = Long.valueOf(-j);
                        }
                    }
                }
            }
        }
        l = null;
        if (l == null || l.longValue() != l.intValue()) {
            return null;
        }
        return Integer.valueOf(l.intValue());
    }
}
