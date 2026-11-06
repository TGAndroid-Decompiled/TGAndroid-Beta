package hd;

import c8.c0;
import c8.d0;
import c8.sd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public abstract class e extends c0 {
    public static boolean a(Object[] objArr, Object obj) {
        int i7;
        kotlin.jvm.internal.j.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i7 = 0;
            while (i7 < length) {
                if (objArr[i7] == null) {
                    break;
                }
                i7++;
            }
            i7 = -1;
        } else {
            int length2 = objArr.length;
            for (int i10 = 0; i10 < length2; i10++) {
                if (obj.equals(objArr[i10])) {
                    i7 = i10;
                    break;
                }
            }
            i7 = -1;
        }
        if (i7 < 0) {
            return false;
        }
        return true;
    }

    public static void b(int i7, int i10, int i11, int[] iArr, int[] destination) {
        kotlin.jvm.internal.j.e(iArr, "<this>");
        kotlin.jvm.internal.j.e(destination, "destination");
        System.arraycopy(iArr, i10, destination, i7, i11 - i10);
    }

    public static void c(int i7, int i10, int i11, Object[] objArr, Object[] destination) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        kotlin.jvm.internal.j.e(destination, "destination");
        System.arraycopy(objArr, i10, destination, i7, i11 - i10);
    }

    public static void d(int i7, int i10, int i11, Object[] objArr, Object[] objArr2) {
        if ((i11 & 4) != 0) {
            i7 = 0;
        }
        c(0, i7, i10, objArr, objArr2);
    }

    public static final void e(int i7, int i10, Object[] objArr) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        Arrays.fill(objArr, i7, i10, (Object) null);
    }

    public static String f(Object[] objArr) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int i7 = 0;
        for (Object obj : objArr) {
            i7++;
            if (i7 > 1) {
                sb2.append((CharSequence) ",");
            }
            sd.a(sb2, obj, null);
        }
        sb2.append((CharSequence) "]");
        return sb2.toString();
    }

    public static List g(long[] jArr) {
        kotlin.jvm.internal.j.e(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            int i7 = 0;
            if (length != 1) {
                ArrayList arrayList = new ArrayList(jArr.length);
                int length2 = jArr.length;
                while (i7 < length2) {
                    i7 = com.google.android.recaptcha.internal.a.g(i7, 1, jArr[i7], arrayList);
                }
                return arrayList;
            }
            return d0.a(Long.valueOf(jArr[0]));
        }
        return n.f14474a;
    }

    public static List h(Object[] objArr) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return new ArrayList(new a0.e(objArr));
            }
            return d0.a(objArr[0]);
        }
        return n.f14474a;
    }
}
