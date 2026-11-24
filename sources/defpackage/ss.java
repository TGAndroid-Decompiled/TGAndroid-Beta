package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public abstract class ss extends rmd {
    public static boolean a(Object[] objArr, Object obj) {
        int i;
        objArr.getClass();
        if (obj == null) {
            int length = objArr.length;
            i = 0;
            while (i < length) {
                if (objArr[i] == null) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            int length2 = objArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                if (obj.equals(objArr[i2])) {
                    i = i2;
                    break;
                }
            }
            i = -1;
        }
        if (i < 0) {
            return false;
        }
        return true;
    }

    public static void b(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void c(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void d(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        c(0, i, i2, objArr, objArr2);
    }

    public static final void e(int i, int i2, Object[] objArr) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static String f(Object[] objArr) {
        objArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ",");
            }
            g9b.a(sb, obj, null);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public static List g(long[] jArr) {
        jArr.getClass();
        int length = jArr.length;
        if (length != 0) {
            int i = 0;
            if (length != 1) {
                ArrayList arrayList = new ArrayList(jArr.length);
                int length2 = jArr.length;
                while (i < length2) {
                    i = mue.c(i, 1, jArr[i], arrayList);
                }
                return arrayList;
            }
            return zk2.a(Long.valueOf(jArr[0]));
        }
        return c24.a;
    }

    public static List h(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return new ArrayList(new js(objArr));
            }
            return zk2.a(objArr[0]);
        }
        return c24.a;
    }
}
