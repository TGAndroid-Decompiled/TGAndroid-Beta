package defpackage;

import java.util.Arrays;
import java.util.List;
public abstract class rs9 {
    public static final Class a;
    public static final t7c b;
    public static final t7c c;

    static {
        Class<?> cls;
        Class<?> cls2;
        gv8 gv8Var = gv8.c;
        t7c t7cVar = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            gv8 gv8Var2 = gv8.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                t7cVar = (t7c) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = t7cVar;
        c = new Object();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof cr5) {
            cr5 cr5Var = (cr5) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += pl2.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (pl2.g(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (pl2.g(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof cr5) {
            cr5 cr5Var = (cr5) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += pl2.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof qh6) {
            qh6 qh6Var = (qh6) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += pl2.i(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int f(List list) {
        int size = list.size();
        if (size != 0) {
            if (list instanceof cr5) {
                ts2.t(list);
                if (size > 0) {
                    throw null;
                }
            } else {
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    i += pl2.h((intValue << 1) ^ (intValue >> 31));
                }
                return i;
            }
        }
        return 0;
    }

    public static int g(List list) {
        int size = list.size();
        if (size != 0) {
            if (list instanceof qh6) {
                ts2.t(list);
                if (size > 0) {
                    throw null;
                }
            } else {
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    i += pl2.i((longValue << 1) ^ (longValue >> 63));
                }
                return i;
            }
        }
        return 0;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof cr5) {
            cr5 cr5Var = (cr5) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += pl2.h(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof qh6) {
            qh6 qh6Var = (qh6) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += pl2.i(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void k(t7c t7cVar, Object obj, Object obj2) {
        t7cVar.getClass();
        gu4 gu4Var = (gu4) obj;
        s7c s7cVar = gu4Var.unknownFields;
        s7c s7cVar2 = ((gu4) obj2).unknownFields;
        s7c s7cVar3 = s7c.f;
        if (!s7cVar3.equals(s7cVar2)) {
            if (s7cVar3.equals(s7cVar)) {
                int i = s7cVar.a + s7cVar2.a;
                int[] copyOf = Arrays.copyOf(s7cVar.b, i);
                System.arraycopy(s7cVar2.b, 0, copyOf, s7cVar.a, s7cVar2.a);
                Object[] copyOf2 = Arrays.copyOf(s7cVar.c, i);
                System.arraycopy(s7cVar2.c, 0, copyOf2, s7cVar.a, s7cVar2.a);
                s7cVar = new s7c(i, copyOf, copyOf2, true);
            } else {
                s7cVar.getClass();
                if (!s7cVar2.equals(s7cVar3)) {
                    if (s7cVar.e) {
                        int i2 = s7cVar.a + s7cVar2.a;
                        s7cVar.a(i2);
                        System.arraycopy(s7cVar2.b, 0, s7cVar.b, s7cVar.a, s7cVar2.a);
                        System.arraycopy(s7cVar2.c, 0, s7cVar.c, s7cVar.a, s7cVar2.a);
                        s7cVar.a = i2;
                    } else {
                        gxc.b();
                        return;
                    }
                }
            }
        }
        gu4Var.unknownFields = s7cVar;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void m(int i, List list, k6d k6dVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            pl2 pl2Var = (pl2) k6dVar.b;
            if (!(list instanceof gn0)) {
                int i2 = 0;
                if (z) {
                    pl2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Boolean) list.get(i4)).getClass();
                        i3++;
                    }
                    pl2Var.C(i3);
                    while (i2 < list.size()) {
                        pl2Var.l(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    pl2Var.n(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            rjb.p();
        }
    }

    public static void n(int i, List list, k6d k6dVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            pl2 pl2Var = (pl2) k6dVar.b;
            if (!(list instanceof hq3)) {
                int i2 = 0;
                if (z) {
                    pl2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Double) list.get(i4)).getClass();
                        i3 += 8;
                    }
                    pl2Var.C(i3);
                    while (i2 < list.size()) {
                        pl2Var.t(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    pl2Var.s(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            rjb.p();
        }
    }

    public static void o(int i, List list, k6d k6dVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            pl2 pl2Var = (pl2) k6dVar.b;
            if (!(list instanceof cr5)) {
                int i2 = 0;
                if (z) {
                    pl2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += pl2.i(((Integer) list.get(i4)).intValue());
                    }
                    pl2Var.C(i3);
                    while (i2 < list.size()) {
                        pl2Var.v(((Integer) list.get(i2)).intValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    pl2Var.u(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            rjb.p();
        }
    }

    public static void p(int i, List list, k6d k6dVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            pl2 pl2Var = (pl2) k6dVar.b;
            if (!(list instanceof cr5)) {
                int i2 = 0;
                if (z) {
                    pl2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Integer) list.get(i4)).getClass();
                        i3 += 4;
                    }
                    pl2Var.C(i3);
                    while (i2 < list.size()) {
                        pl2Var.r(((Integer) list.get(i2)).intValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    pl2Var.q(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            rjb.p();
        }
    }

    public static void q(int i, List list, k6d k6dVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            pl2 pl2Var = (pl2) k6dVar.b;
            if (!(list instanceof qh6)) {
                int i2 = 0;
                if (z) {
                    pl2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Long) list.get(i4)).getClass();
                        i3 += 8;
                    }
                    pl2Var.C(i3);
                    while (i2 < list.size()) {
                        pl2Var.t(((Long) list.get(i2)).longValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    pl2Var.s(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            rjb.p();
        }
    }

    public static void r(int i, List list, k6d k6dVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            pl2 pl2Var = (pl2) k6dVar.b;
            if (!(list instanceof uk4)) {
                int i2 = 0;
                if (z) {
                    pl2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Float) list.get(i4)).getClass();
                        i3 += 4;
                    }
                    pl2Var.C(i3);
                    while (i2 < list.size()) {
                        pl2Var.r(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    pl2Var.q(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            rjb.p();
        }
    }

    public static void s(int i, List list, k6d k6dVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            pl2 pl2Var = (pl2) k6dVar.b;
            if (!(list instanceof cr5)) {
                int i2 = 0;
                if (z) {
                    pl2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += pl2.i(((Integer) list.get(i4)).intValue());
                    }
                    pl2Var.C(i3);
                    while (i2 < list.size()) {
                        pl2Var.v(((Integer) list.get(i2)).intValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    pl2Var.u(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            rjb.p();
        }
    }

    public static void t(int i, List list, k6d k6dVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            pl2 pl2Var = (pl2) k6dVar.b;
            if (!(list instanceof qh6)) {
                int i2 = 0;
                if (z) {
                    pl2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += pl2.i(((Long) list.get(i4)).longValue());
                    }
                    pl2Var.C(i3);
                    while (i2 < list.size()) {
                        pl2Var.E(((Long) list.get(i2)).longValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    pl2Var.D(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            rjb.p();
        }
    }

    public static void u(int i, List list, k6d k6dVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            pl2 pl2Var = (pl2) k6dVar.b;
            if (!(list instanceof cr5)) {
                int i2 = 0;
                if (z) {
                    pl2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Integer) list.get(i4)).getClass();
                        i3 += 4;
                    }
                    pl2Var.C(i3);
                    while (i2 < list.size()) {
                        pl2Var.r(((Integer) list.get(i2)).intValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    pl2Var.q(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            rjb.p();
        }
    }

    public static void v(int i, List list, k6d k6dVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            pl2 pl2Var = (pl2) k6dVar.b;
            if (!(list instanceof qh6)) {
                int i2 = 0;
                if (z) {
                    pl2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Long) list.get(i4)).getClass();
                        i3 += 8;
                    }
                    pl2Var.C(i3);
                    while (i2 < list.size()) {
                        pl2Var.t(((Long) list.get(i2)).longValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    pl2Var.s(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            rjb.p();
        }
    }

    public static void w(int i, List list, k6d k6dVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            pl2 pl2Var = (pl2) k6dVar.b;
            if (!(list instanceof cr5)) {
                int i2 = 0;
                if (z) {
                    pl2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        int intValue = ((Integer) list.get(i4)).intValue();
                        i3 += pl2.h((intValue << 1) ^ (intValue >> 31));
                    }
                    pl2Var.C(i3);
                    while (i2 < list.size()) {
                        int intValue2 = ((Integer) list.get(i2)).intValue();
                        pl2Var.C((intValue2 << 1) ^ (intValue2 >> 31));
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    int intValue3 = ((Integer) list.get(i2)).intValue();
                    pl2Var.B(i, (intValue3 << 1) ^ (intValue3 >> 31));
                    i2++;
                }
                return;
            }
            rjb.p();
        }
    }

    public static void x(int i, List list, k6d k6dVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            pl2 pl2Var = (pl2) k6dVar.b;
            if (!(list instanceof qh6)) {
                int i2 = 0;
                if (z) {
                    pl2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        long longValue = ((Long) list.get(i4)).longValue();
                        i3 += pl2.i((longValue << 1) ^ (longValue >> 63));
                    }
                    pl2Var.C(i3);
                    while (i2 < list.size()) {
                        long longValue2 = ((Long) list.get(i2)).longValue();
                        pl2Var.E((longValue2 << 1) ^ (longValue2 >> 63));
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    long longValue3 = ((Long) list.get(i2)).longValue();
                    pl2Var.D(i, (longValue3 << 1) ^ (longValue3 >> 63));
                    i2++;
                }
                return;
            }
            rjb.p();
        }
    }

    public static void y(int i, List list, k6d k6dVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            pl2 pl2Var = (pl2) k6dVar.b;
            if (!(list instanceof cr5)) {
                int i2 = 0;
                if (z) {
                    pl2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += pl2.h(((Integer) list.get(i4)).intValue());
                    }
                    pl2Var.C(i3);
                    while (i2 < list.size()) {
                        pl2Var.C(((Integer) list.get(i2)).intValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    pl2Var.B(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            rjb.p();
        }
    }

    public static void z(int i, List list, k6d k6dVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            pl2 pl2Var = (pl2) k6dVar.b;
            if (!(list instanceof qh6)) {
                int i2 = 0;
                if (z) {
                    pl2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += pl2.i(((Long) list.get(i4)).longValue());
                    }
                    pl2Var.C(i3);
                    while (i2 < list.size()) {
                        pl2Var.E(((Long) list.get(i2)).longValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    pl2Var.D(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            rjb.p();
        }
    }

    public static Object j(Object obj, int i, lr5 lr5Var, Object obj2, t7c t7cVar) {
        return obj2;
    }
}
