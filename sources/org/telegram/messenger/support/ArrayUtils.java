package org.telegram.messenger.support;

import java.lang.reflect.Array;
public class ArrayUtils {
    private static final int CACHE_SIZE = 73;
    private static Object[] EMPTY = new Object[0];
    private static Object[] sCache = new Object[73];

    private ArrayUtils() {
    }

    public static <T> T[] appendElement(Class<T> cls, T[] tArr, T t6) {
        T[] tArr2;
        int i7 = 0;
        if (tArr != null) {
            int length = tArr.length;
            tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, length + 1));
            System.arraycopy(tArr, 0, tArr2, 0, length);
            i7 = length;
        } else {
            tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, 1));
        }
        tArr2[i7] = t6;
        return tArr2;
    }

    public static int[] appendInt(int[] iArr, int i7) {
        if (iArr == null) {
            return new int[]{i7};
        }
        int length = iArr.length;
        for (int i10 : iArr) {
            if (i10 == i7) {
                return iArr;
            }
        }
        int[] iArr2 = new int[length + 1];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        iArr2[length] = i7;
        return iArr2;
    }

    public static <T> boolean contains(T[] tArr, T t6) {
        for (T t10 : tArr) {
            if (t10 == null) {
                if (t6 == null) {
                    return true;
                }
            } else if (t6 != null && t10.equals(t6)) {
                return true;
            }
        }
        return false;
    }

    public static <T> T[] emptyArray(Class<T> cls) {
        if (cls == Object.class) {
            return (T[]) EMPTY;
        }
        int identityHashCode = ((System.identityHashCode(cls) / 8) & Integer.MAX_VALUE) % 73;
        Object obj = sCache[identityHashCode];
        if (obj == null || obj.getClass().getComponentType() != cls) {
            obj = Array.newInstance((Class<?>) cls, 0);
            sCache[identityHashCode] = obj;
        }
        return (T[]) ((Object[]) obj);
    }

    public static boolean equals(byte[] bArr, byte[] bArr2, int i7) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length < i7 || bArr2.length < i7) {
            return false;
        }
        for (int i10 = 0; i10 < i7; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int idealBooleanArraySize(int i7) {
        return idealByteArraySize(i7);
    }

    public static int idealByteArraySize(int i7) {
        for (int i10 = 4; i10 < 32; i10++) {
            int i11 = (1 << i10) - 12;
            if (i7 <= i11) {
                return i11;
            }
        }
        return i7;
    }

    public static int idealCharArraySize(int i7) {
        return idealByteArraySize(i7 * 2) / 2;
    }

    public static int idealFloatArraySize(int i7) {
        return idealByteArraySize(i7 * 4) / 4;
    }

    public static int idealIntArraySize(int i7) {
        return idealByteArraySize(i7 * 4) / 4;
    }

    public static int idealLongArraySize(int i7) {
        return idealByteArraySize(i7 * 8) / 8;
    }

    public static int idealObjectArraySize(int i7) {
        return idealByteArraySize(i7 * 4) / 4;
    }

    public static int idealShortArraySize(int i7) {
        return idealByteArraySize(i7 * 2) / 2;
    }

    public static int indexOf(int[] iArr, int i7) {
        if (iArr != null) {
            for (int i10 = 0; i10 < iArr.length; i10++) {
                if (iArr[i10] == i7) {
                    return i10;
                }
            }
            return -1;
        }
        return -1;
    }

    public static <T> T[] removeElement(Class<T> cls, T[] tArr, T t6) {
        if (tArr != null) {
            int length = tArr.length;
            for (int i7 = 0; i7 < length; i7++) {
                if (tArr[i7] == t6) {
                    if (length == 1) {
                        return null;
                    }
                    T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, length - 1));
                    System.arraycopy(tArr, 0, tArr2, 0, i7);
                    System.arraycopy(tArr, i7 + 1, tArr2, i7, (length - i7) - 1);
                    return tArr2;
                }
            }
        }
        return tArr;
    }

    public static int[] removeInt(int[] iArr, int i7) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (iArr[i10] == i7) {
                int i11 = length - 1;
                int[] iArr2 = new int[i11];
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, i10);
                }
                if (i10 < i11) {
                    System.arraycopy(iArr, i10 + 1, iArr2, i10, (length - i10) - 1);
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static long total(long[] jArr) {
        long j3 = 0;
        for (long j10 : jArr) {
            j3 += j10;
        }
        return j3;
    }

    public static boolean contains(int[] iArr, int i7) {
        for (int i10 : iArr) {
            if (i10 == i7) {
                return true;
            }
        }
        return false;
    }
}
