package ed;

import b8.sb;
import b8.tb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public abstract class f extends sb {
    public static boolean a(Object[] objArr, Object obj) {
        int i3;
        kotlin.jvm.internal.j.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i3 = 0;
            while (i3 < length) {
                if (objArr[i3] == null) {
                    break;
                }
                i3++;
            }
            i3 = -1;
        } else {
            int length2 = objArr.length;
            for (int i10 = 0; i10 < length2; i10++) {
                if (obj.equals(objArr[i10])) {
                    i3 = i10;
                    break;
                }
            }
            i3 = -1;
        }
        if (i3 < 0) {
            return false;
        }
        return true;
    }

    public static void b(int i3, int i10, int i11, int[] iArr, int[] destination) {
        kotlin.jvm.internal.j.e(iArr, "<this>");
        kotlin.jvm.internal.j.e(destination, "destination");
        System.arraycopy(iArr, i10, destination, i3, i11 - i10);
    }

    public static void c(int i3, int i10, int i11, Object[] objArr, Object[] destination) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        kotlin.jvm.internal.j.e(destination, "destination");
        System.arraycopy(objArr, i10, destination, i3, i11 - i10);
    }

    public static void d(int i3, int i10, int i11, Object[] objArr, Object[] objArr2) {
        if ((i11 & 4) != 0) {
            i3 = 0;
        }
        c(0, i3, i10, objArr, objArr2);
    }

    public static final void e(int i3, int i10, Object[] objArr) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        Arrays.fill(objArr, i3, i10, (Object) null);
    }

    public static String f(Object[] objArr) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int i3 = 0;
        for (Object obj : objArr) {
            i3++;
            if (i3 > 1) {
                sb2.append((CharSequence) ",");
            }
            ud.e.a(sb2, obj, null);
        }
        sb2.append((CharSequence) "]");
        return sb2.toString();
    }

    public static List g(long[] jArr) {
        kotlin.jvm.internal.j.e(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            int i3 = 0;
            if (length != 1) {
                ArrayList arrayList = new ArrayList(jArr.length);
                int length2 = jArr.length;
                while (i3 < length2) {
                    i3 = a1.g.h(i3, 1, jArr[i3], arrayList);
                }
                return arrayList;
            }
            return tb.a(Long.valueOf(jArr[0]));
        }
        return o.f9953a;
    }

    public static List h(Object[] objArr) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return new ArrayList(new a0.e(objArr));
            }
            return tb.a(objArr[0]);
        }
        return o.f9953a;
    }
}
