package defpackage;

import java.util.Arrays;
import java.util.List;
public abstract class ugf {
    public static final Class a;
    public static final dhf b;
    public static final dhf c;

    static {
        Class<?> cls;
        Class<?> cls2;
        dhf dhfVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                dhfVar = (dhf) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = dhfVar;
        c = new Object();
    }

    public static void a(int i, List list, xdd xddVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            hef hefVar = (hef) xddVar.a;
            int i2 = 0;
            if (z) {
                hefVar.i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = ((Integer) list.get(i4)).intValue();
                    i3 += hef.o((intValue << 1) ^ (intValue >> 31));
                }
                hefVar.j(i3);
                while (i2 < list.size()) {
                    int intValue2 = ((Integer) list.get(i2)).intValue();
                    hefVar.j((intValue2 << 1) ^ (intValue2 >> 31));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                hefVar.j(i << 3);
                hefVar.j((intValue3 << 1) ^ (intValue3 >> 31));
                i2++;
            }
        }
    }

    public static void b(int i, List list, xdd xddVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            hef hefVar = (hef) xddVar.a;
            int i2 = 0;
            if (z) {
                hefVar.i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    i3 += hef.p((longValue << 1) ^ (longValue >> 63));
                }
                hefVar.j(i3);
                while (i2 < list.size()) {
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    hefVar.l((longValue2 << 1) ^ (longValue2 >> 63));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                hefVar.k(i, (longValue3 << 1) ^ (longValue3 >> 63));
                i2++;
            }
        }
    }

    public static void c(int i, List list, xdd xddVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            hef hefVar = (hef) xddVar.a;
            int i2 = 0;
            if (z) {
                hefVar.i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += hef.o(((Integer) list.get(i4)).intValue());
                }
                hefVar.j(i3);
                while (i2 < list.size()) {
                    hefVar.j(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                hefVar.j(i << 3);
                hefVar.j(intValue);
                i2++;
            }
        }
    }

    public static void d(int i, List list, xdd xddVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            hef hefVar = (hef) xddVar.a;
            int i2 = 0;
            if (z) {
                hefVar.i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += hef.p(((Long) list.get(i4)).longValue());
                }
                hefVar.j(i3);
                while (i2 < list.size()) {
                    hefVar.l(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                hefVar.k(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof wef) {
            wef wefVar = (wef) list;
            int i2 = 0;
            while (i < size) {
                wefVar.i(i);
                i2 += hef.m(wefVar.b[i]);
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += hef.m(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (hef.o(i << 3) + 4) * size;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (hef.o(i << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof wef) {
            wef wefVar = (wef) list;
            int i2 = 0;
            while (i < size) {
                wefVar.i(i);
                i2 += hef.m(wefVar.b[i]);
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += hef.m(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int j(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zff) {
            zff zffVar = (zff) list;
            int i2 = 0;
            while (i < size) {
                zffVar.i(i);
                i2 += hef.p(zffVar.b[i]);
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += hef.p(((Long) list.get(i)).longValue());
            i++;
        }
        return i3;
    }

    public static int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof wef) {
            wef wefVar = (wef) list;
            int i2 = 0;
            while (i < size) {
                wefVar.i(i);
                int i3 = wefVar.b[i];
                i2 += hef.o((i3 << 1) ^ (i3 >> 31));
                i++;
            }
            return i2;
        }
        int i4 = 0;
        while (i < size) {
            int intValue = ((Integer) list.get(i)).intValue();
            i4 += hef.o((intValue << 1) ^ (intValue >> 31));
            i++;
        }
        return i4;
    }

    public static int l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zff) {
            zff zffVar = (zff) list;
            int i2 = 0;
            while (i < size) {
                zffVar.i(i);
                long j = zffVar.b[i];
                i2 += hef.p((j << 1) ^ (j >> 63));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            long longValue = ((Long) list.get(i)).longValue();
            i3 += hef.p((longValue << 1) ^ (longValue >> 63));
            i++;
        }
        return i3;
    }

    public static int m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof wef) {
            wef wefVar = (wef) list;
            int i2 = 0;
            while (i < size) {
                wefVar.i(i);
                i2 += hef.o(wefVar.b[i]);
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += hef.o(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int n(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zff) {
            zff zffVar = (zff) list;
            int i2 = 0;
            while (i < size) {
                zffVar.i(i);
                i2 += hef.p(zffVar.b[i]);
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += hef.p(((Long) list.get(i)).longValue());
            i++;
        }
        return i3;
    }

    public static void o(dhf dhfVar, Object obj, Object obj2) {
        dhfVar.getClass();
        vef vefVar = (vef) obj;
        chf chfVar = vefVar.zzc;
        chf chfVar2 = ((vef) obj2).zzc;
        chf chfVar3 = chf.e;
        if (!chfVar3.equals(chfVar2)) {
            if (chfVar3.equals(chfVar)) {
                chfVar.getClass();
                chfVar2.getClass();
                int[] copyOf = Arrays.copyOf(chfVar.a, 0);
                System.arraycopy(chfVar2.a, 0, copyOf, 0, 0);
                Object[] copyOf2 = Arrays.copyOf(chfVar.b, 0);
                System.arraycopy(chfVar2.b, 0, copyOf2, 0, 0);
                chfVar = new chf(copyOf, copyOf2, true);
            } else {
                chfVar.getClass();
                if (!chfVar2.equals(chfVar3)) {
                    if (chfVar.d) {
                        System.arraycopy(chfVar2.a, 0, chfVar.a, 0, 0);
                        System.arraycopy(chfVar2.b, 0, chfVar.b, 0, 0);
                    } else {
                        fvc.b();
                        return;
                    }
                }
            }
        }
        vefVar.zzc = chfVar;
    }

    public static void p(int i, List list, xdd xddVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            hef hefVar = (hef) xddVar.a;
            int i2 = 0;
            if (z) {
                hefVar.i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).getClass();
                    i3++;
                }
                hefVar.j(i3);
                while (i2 < list.size()) {
                    hefVar.a(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                boolean booleanValue = ((Boolean) list.get(i2)).booleanValue();
                hefVar.j(i << 3);
                hefVar.a(booleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
        }
    }

    public static void q(int i, List list, xdd xddVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            hef hefVar = (hef) xddVar.a;
            int i2 = 0;
            if (z) {
                hefVar.i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).getClass();
                    i3 += 8;
                }
                hefVar.j(i3);
                while (i2 < list.size()) {
                    hefVar.g(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                hefVar.f(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
        }
    }

    public static void r(int i, List list, xdd xddVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            hef hefVar = (hef) xddVar.a;
            int i2 = 0;
            if (z) {
                hefVar.i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += hef.m(((Integer) list.get(i4)).intValue());
                }
                hefVar.j(i3);
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    if (intValue >= 0) {
                        hefVar.j(intValue);
                    } else {
                        hefVar.l(intValue);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                int intValue2 = ((Integer) list.get(i2)).intValue();
                hefVar.j(i << 3);
                if (intValue2 >= 0) {
                    hefVar.j(intValue2);
                } else {
                    hefVar.l(intValue2);
                }
                i2++;
            }
        }
    }

    public static void s(int i, List list, xdd xddVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            hef hefVar = (hef) xddVar.a;
            int i2 = 0;
            if (z) {
                hefVar.i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).getClass();
                    i3 += 4;
                }
                hefVar.j(i3);
                while (i2 < list.size()) {
                    hefVar.e(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                hefVar.d(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void t(int i, List list, xdd xddVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            hef hefVar = (hef) xddVar.a;
            int i2 = 0;
            if (z) {
                hefVar.i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    i3 += 8;
                }
                hefVar.j(i3);
                while (i2 < list.size()) {
                    hefVar.g(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                hefVar.f(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void u(int i, List list, xdd xddVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            hef hefVar = (hef) xddVar.a;
            int i2 = 0;
            if (z) {
                hefVar.i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).getClass();
                    i3 += 4;
                }
                hefVar.j(i3);
                while (i2 < list.size()) {
                    hefVar.e(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                hefVar.d(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
        }
    }

    public static void v(int i, List list, xdd xddVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            hef hefVar = (hef) xddVar.a;
            int i2 = 0;
            if (z) {
                hefVar.i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += hef.m(((Integer) list.get(i4)).intValue());
                }
                hefVar.j(i3);
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    if (intValue >= 0) {
                        hefVar.j(intValue);
                    } else {
                        hefVar.l(intValue);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                int intValue2 = ((Integer) list.get(i2)).intValue();
                hefVar.j(i << 3);
                if (intValue2 >= 0) {
                    hefVar.j(intValue2);
                } else {
                    hefVar.l(intValue2);
                }
                i2++;
            }
        }
    }

    public static void w(int i, List list, xdd xddVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            hef hefVar = (hef) xddVar.a;
            int i2 = 0;
            if (z) {
                hefVar.i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += hef.p(((Long) list.get(i4)).longValue());
                }
                hefVar.j(i3);
                while (i2 < list.size()) {
                    hefVar.l(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                hefVar.k(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void x(int i, List list, xdd xddVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            hef hefVar = (hef) xddVar.a;
            int i2 = 0;
            if (z) {
                hefVar.i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).getClass();
                    i3 += 4;
                }
                hefVar.j(i3);
                while (i2 < list.size()) {
                    hefVar.e(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                hefVar.d(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void y(int i, List list, xdd xddVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            hef hefVar = (hef) xddVar.a;
            int i2 = 0;
            if (z) {
                hefVar.i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    i3 += 8;
                }
                hefVar.j(i3);
                while (i2 < list.size()) {
                    hefVar.g(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                hefVar.f(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }
}
