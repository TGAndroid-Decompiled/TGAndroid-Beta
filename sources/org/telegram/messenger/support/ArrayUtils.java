package org.telegram.messenger.support;

import java.lang.reflect.Array;
public class ArrayUtils {
    private static final int CACHE_SIZE = 73;
    private static Object[] EMPTY = new Object[0];
    private static Object[] sCache = new Object[73];

    public static int idealByteArraySize(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }

    private ArrayUtils() {
    }

    public static int idealBooleanArraySize(int i) {
        return idealByteArraySize(i);
    }

    public static int idealShortArraySize(int i) {
        return idealByteArraySize(i * 2) / 2;
    }

    public static int idealCharArraySize(int i) {
        return idealByteArraySize(i * 2) / 2;
    }

    public static int idealIntArraySize(int i) {
        return idealByteArraySize(i * 4) / 4;
    }

    public static int idealFloatArraySize(int i) {
        return idealByteArraySize(i * 4) / 4;
    }

    public static int idealObjectArraySize(int i) {
        return idealByteArraySize(i * 4) / 4;
    }

    public static int idealLongArraySize(int i) {
        return idealByteArraySize(i * 8) / 8;
    }

    public static boolean equals(byte[] bArr, byte[] bArr2, int i) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length < i || bArr2.length < i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
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

    public static <T> boolean contains(T[] tArr, T t) {
        for (T t2 : tArr) {
            if (t2 == null) {
                if (t == null) {
                    return true;
                }
            } else if (t != null && t2.equals(t)) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static int indexOf(int[] iArr, int i) {
        if (iArr != null) {
            for (int i2 = 0; i2 < iArr.length; i2++) {
                if (iArr[i2] == i) {
                    return i2;
                }
            }
            return -1;
        }
        return -1;
    }

    public static long total(long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        return j;
    }

    public static <T> T[] appendElement(Class<T> cls, T[] tArr, T t) {
        T[] tArr2;
        int i = 0;
        if (tArr != null) {
            int length = tArr.length;
            tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, length + 1));
            System.arraycopy(tArr, 0, tArr2, 0, length);
            i = length;
        } else {
            tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, 1));
        }
        tArr2[i] = t;
        return tArr2;
    }

    public static <T> T[] removeElement(Class<T> cls, T[] tArr, T t) {
        if (tArr != null) {
            int length = tArr.length;
            for (int i = 0; i < length; i++) {
                if (tArr[i] == t) {
                    if (length == 1) {
                        return null;
                    }
                    T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, length - 1));
                    System.arraycopy(tArr, 0, tArr2, 0, i);
                    System.arraycopy(tArr, i + 1, tArr2, i, (length - i) - 1);
                    return tArr2;
                }
            }
        }
        return tArr;
    }

    public static int[] appendInt(int[] iArr, int i) {
        if (iArr == null) {
            return new int[]{i};
        }
        int length = iArr.length;
        for (int i2 : iArr) {
            if (i2 == i) {
                return iArr;
            }
        }
        int[] iArr2 = new int[length + 1];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        iArr2[length] = i;
        return iArr2;
    }

    public static int[] removeInt(int[] iArr, int i) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (iArr[i2] == i) {
                int i3 = length - 1;
                int[] iArr2 = new int[i3];
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, i2);
                }
                if (i2 < i3) {
                    System.arraycopy(iArr, i2 + 1, iArr2, i2, (length - i2) - 1);
                }
                return iArr2;
            }
        }
        return iArr;
    }
}
