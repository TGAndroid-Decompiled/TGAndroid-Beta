package c8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public abstract class e1 {
    public static List a(int... iArr) {
        if (iArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        return new l9.b(0, iArr.length, iArr);
    }

    public static int b(long j3) {
        boolean z9;
        int i7 = (int) j3;
        if (i7 == j3) {
            z9 = true;
        } else {
            z9 = false;
        }
        a8.ia.d(j3, "Out of range: %s", z9);
        return i7;
    }

    public static int c(byte b10, byte b11, byte b12, byte b13) {
        return (b10 << 24) | ((b11 & 255) << 16) | ((b12 & 255) << 8) | (b13 & 255);
    }

    public static int d(int i7, int i10, int i11, int[] iArr) {
        while (i10 < i11) {
            if (iArr[i10] == i7) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int e(long j3) {
        if (j3 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j3 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j3;
    }

    public static int[] f(Collection collection) {
        if (collection instanceof l9.b) {
            l9.b bVar = (l9.b) collection;
            return Arrays.copyOfRange(bVar.f18206a, bVar.f18207b, bVar.f18208c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            Object obj = array[i7];
            obj.getClass();
            iArr[i7] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static Integer g(String str) {
        byte b10;
        Integer num;
        Long l10;
        byte b11;
        str.getClass();
        if (!str.isEmpty()) {
            int i7 = 0;
            if (str.charAt(0) == '-') {
                i7 = 1;
            }
            if (i7 != str.length()) {
                int i10 = i7 + 1;
                char charAt = str.charAt(i7);
                if (charAt < 128) {
                    b10 = l9.c.f18209a[charAt];
                } else {
                    byte[] bArr = l9.c.f18209a;
                    b10 = -1;
                }
                if (b10 >= 0 && b10 < 10) {
                    long j3 = -b10;
                    long j10 = 10;
                    long j11 = Long.MIN_VALUE / j10;
                    while (true) {
                        if (i10 < str.length()) {
                            int i11 = i10 + 1;
                            char charAt2 = str.charAt(i10);
                            if (charAt2 < 128) {
                                b11 = l9.c.f18209a[charAt2];
                            } else {
                                byte[] bArr2 = l9.c.f18209a;
                                b11 = -1;
                            }
                            if (b11 < 0 || b11 >= 10 || j3 < j11) {
                                break;
                            }
                            long j12 = j3 * j10;
                            num = null;
                            long j13 = b11;
                            if (j12 < j13 - Long.MIN_VALUE) {
                                break;
                            }
                            j3 = j12 - j13;
                            i10 = i11;
                        } else {
                            num = null;
                            if (i7 != 0) {
                                l10 = Long.valueOf(j3);
                            } else if (j3 != Long.MIN_VALUE) {
                                l10 = Long.valueOf(-j3);
                            }
                        }
                    }
                }
                num = null;
                l10 = num;
                if (l10 == 0 && l10.longValue() == l10.intValue()) {
                    return Integer.valueOf(l10.intValue());
                }
                return num;
            }
        }
        l10 = 0;
        num = null;
        if (l10 == 0) {
        }
        return num;
    }
}
