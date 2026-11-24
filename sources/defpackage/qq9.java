package defpackage;

import java.util.Arrays;
import java.util.List;
public abstract class qq9 {
    public static final Class a;
    public static final t5c b;
    public static final t5c c;

    static {
        Class<?> cls;
        Class<?> cls2;
        ft8 ft8Var = ft8.c;
        t5c t5cVar = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            ft8 ft8Var2 = ft8.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                t5cVar = (t5c) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = t5cVar;
        c = new Object();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof cp5) {
            cp5 cp5Var = (cp5) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ck2.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ck2.g(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ck2.g(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof cp5) {
            cp5 cp5Var = (cp5) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ck2.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof qf6) {
            qf6 qf6Var = (qf6) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ck2.i(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int f(List list) {
        int size = list.size();
        if (size != 0) {
            if (list instanceof cp5) {
                ir2.u(list);
                if (size > 0) {
                    throw null;
                }
            } else {
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    i += ck2.h((intValue << 1) ^ (intValue >> 31));
                }
                return i;
            }
        }
        return 0;
    }

    public static int g(List list) {
        int size = list.size();
        if (size != 0) {
            if (list instanceof qf6) {
                ir2.u(list);
                if (size > 0) {
                    throw null;
                }
            } else {
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    i += ck2.i((longValue << 1) ^ (longValue >> 63));
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
        if (list instanceof cp5) {
            cp5 cp5Var = (cp5) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ck2.h(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof qf6) {
            qf6 qf6Var = (qf6) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ck2.i(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void k(t5c t5cVar, Object obj, Object obj2) {
        t5cVar.getClass();
        fs4 fs4Var = (fs4) obj;
        s5c s5cVar = fs4Var.unknownFields;
        s5c s5cVar2 = ((fs4) obj2).unknownFields;
        s5c s5cVar3 = s5c.f;
        if (!s5cVar3.equals(s5cVar2)) {
            if (s5cVar3.equals(s5cVar)) {
                int i = s5cVar.a + s5cVar2.a;
                int[] copyOf = Arrays.copyOf(s5cVar.b, i);
                System.arraycopy(s5cVar2.b, 0, copyOf, s5cVar.a, s5cVar2.a);
                Object[] copyOf2 = Arrays.copyOf(s5cVar.c, i);
                System.arraycopy(s5cVar2.c, 0, copyOf2, s5cVar.a, s5cVar2.a);
                s5cVar = new s5c(i, copyOf, copyOf2, true);
            } else {
                s5cVar.getClass();
                if (!s5cVar2.equals(s5cVar3)) {
                    if (s5cVar.e) {
                        int i2 = s5cVar.a + s5cVar2.a;
                        s5cVar.a(i2);
                        System.arraycopy(s5cVar2.b, 0, s5cVar.b, s5cVar.a, s5cVar2.a);
                        System.arraycopy(s5cVar2.c, 0, s5cVar.c, s5cVar.a, s5cVar2.a);
                        s5cVar.a = i2;
                    } else {
                        fvc.b();
                        return;
                    }
                }
            }
        }
        fs4Var.unknownFields = s5cVar;
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

    public static void m(int i, List list, l69 l69Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ck2 ck2Var = (ck2) l69Var.b;
            if (!(list instanceof gm0)) {
                int i2 = 0;
                if (z) {
                    ck2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Boolean) list.get(i4)).getClass();
                        i3++;
                    }
                    ck2Var.C(i3);
                    while (i2 < list.size()) {
                        ck2Var.l(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    ck2Var.n(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            fyb.g();
        }
    }

    public static void n(int i, List list, l69 l69Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ck2 ck2Var = (ck2) l69Var.b;
            if (!(list instanceof xo3)) {
                int i2 = 0;
                if (z) {
                    ck2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Double) list.get(i4)).getClass();
                        i3 += 8;
                    }
                    ck2Var.C(i3);
                    while (i2 < list.size()) {
                        ck2Var.t(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    ck2Var.s(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            fyb.g();
        }
    }

    public static void o(int i, List list, l69 l69Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ck2 ck2Var = (ck2) l69Var.b;
            if (!(list instanceof cp5)) {
                int i2 = 0;
                if (z) {
                    ck2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += ck2.i(((Integer) list.get(i4)).intValue());
                    }
                    ck2Var.C(i3);
                    while (i2 < list.size()) {
                        ck2Var.v(((Integer) list.get(i2)).intValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    ck2Var.u(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            fyb.g();
        }
    }

    public static void p(int i, List list, l69 l69Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ck2 ck2Var = (ck2) l69Var.b;
            if (!(list instanceof cp5)) {
                int i2 = 0;
                if (z) {
                    ck2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Integer) list.get(i4)).getClass();
                        i3 += 4;
                    }
                    ck2Var.C(i3);
                    while (i2 < list.size()) {
                        ck2Var.r(((Integer) list.get(i2)).intValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    ck2Var.q(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            fyb.g();
        }
    }

    public static void q(int i, List list, l69 l69Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ck2 ck2Var = (ck2) l69Var.b;
            if (!(list instanceof qf6)) {
                int i2 = 0;
                if (z) {
                    ck2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Long) list.get(i4)).getClass();
                        i3 += 8;
                    }
                    ck2Var.C(i3);
                    while (i2 < list.size()) {
                        ck2Var.t(((Long) list.get(i2)).longValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    ck2Var.s(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            fyb.g();
        }
    }

    public static void r(int i, List list, l69 l69Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ck2 ck2Var = (ck2) l69Var.b;
            if (!(list instanceof qi4)) {
                int i2 = 0;
                if (z) {
                    ck2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Float) list.get(i4)).getClass();
                        i3 += 4;
                    }
                    ck2Var.C(i3);
                    while (i2 < list.size()) {
                        ck2Var.r(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    ck2Var.q(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            fyb.g();
        }
    }

    public static void s(int i, List list, l69 l69Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ck2 ck2Var = (ck2) l69Var.b;
            if (!(list instanceof cp5)) {
                int i2 = 0;
                if (z) {
                    ck2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += ck2.i(((Integer) list.get(i4)).intValue());
                    }
                    ck2Var.C(i3);
                    while (i2 < list.size()) {
                        ck2Var.v(((Integer) list.get(i2)).intValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    ck2Var.u(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            fyb.g();
        }
    }

    public static void t(int i, List list, l69 l69Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ck2 ck2Var = (ck2) l69Var.b;
            if (!(list instanceof qf6)) {
                int i2 = 0;
                if (z) {
                    ck2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += ck2.i(((Long) list.get(i4)).longValue());
                    }
                    ck2Var.C(i3);
                    while (i2 < list.size()) {
                        ck2Var.E(((Long) list.get(i2)).longValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    ck2Var.D(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            fyb.g();
        }
    }

    public static void u(int i, List list, l69 l69Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ck2 ck2Var = (ck2) l69Var.b;
            if (!(list instanceof cp5)) {
                int i2 = 0;
                if (z) {
                    ck2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Integer) list.get(i4)).getClass();
                        i3 += 4;
                    }
                    ck2Var.C(i3);
                    while (i2 < list.size()) {
                        ck2Var.r(((Integer) list.get(i2)).intValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    ck2Var.q(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            fyb.g();
        }
    }

    public static void v(int i, List list, l69 l69Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ck2 ck2Var = (ck2) l69Var.b;
            if (!(list instanceof qf6)) {
                int i2 = 0;
                if (z) {
                    ck2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Long) list.get(i4)).getClass();
                        i3 += 8;
                    }
                    ck2Var.C(i3);
                    while (i2 < list.size()) {
                        ck2Var.t(((Long) list.get(i2)).longValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    ck2Var.s(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            fyb.g();
        }
    }

    public static void w(int i, List list, l69 l69Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ck2 ck2Var = (ck2) l69Var.b;
            if (!(list instanceof cp5)) {
                int i2 = 0;
                if (z) {
                    ck2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        int intValue = ((Integer) list.get(i4)).intValue();
                        i3 += ck2.h((intValue << 1) ^ (intValue >> 31));
                    }
                    ck2Var.C(i3);
                    while (i2 < list.size()) {
                        int intValue2 = ((Integer) list.get(i2)).intValue();
                        ck2Var.C((intValue2 << 1) ^ (intValue2 >> 31));
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    int intValue3 = ((Integer) list.get(i2)).intValue();
                    ck2Var.B(i, (intValue3 << 1) ^ (intValue3 >> 31));
                    i2++;
                }
                return;
            }
            fyb.g();
        }
    }

    public static void x(int i, List list, l69 l69Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ck2 ck2Var = (ck2) l69Var.b;
            if (!(list instanceof qf6)) {
                int i2 = 0;
                if (z) {
                    ck2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        long longValue = ((Long) list.get(i4)).longValue();
                        i3 += ck2.i((longValue << 1) ^ (longValue >> 63));
                    }
                    ck2Var.C(i3);
                    while (i2 < list.size()) {
                        long longValue2 = ((Long) list.get(i2)).longValue();
                        ck2Var.E((longValue2 << 1) ^ (longValue2 >> 63));
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    long longValue3 = ((Long) list.get(i2)).longValue();
                    ck2Var.D(i, (longValue3 << 1) ^ (longValue3 >> 63));
                    i2++;
                }
                return;
            }
            fyb.g();
        }
    }

    public static void y(int i, List list, l69 l69Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ck2 ck2Var = (ck2) l69Var.b;
            if (!(list instanceof cp5)) {
                int i2 = 0;
                if (z) {
                    ck2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += ck2.h(((Integer) list.get(i4)).intValue());
                    }
                    ck2Var.C(i3);
                    while (i2 < list.size()) {
                        ck2Var.C(((Integer) list.get(i2)).intValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    ck2Var.B(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            fyb.g();
        }
    }

    public static void z(int i, List list, l69 l69Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ck2 ck2Var = (ck2) l69Var.b;
            if (!(list instanceof qf6)) {
                int i2 = 0;
                if (z) {
                    ck2Var.A(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += ck2.i(((Long) list.get(i4)).longValue());
                    }
                    ck2Var.C(i3);
                    while (i2 < list.size()) {
                        ck2Var.E(((Long) list.get(i2)).longValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    ck2Var.D(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            fyb.g();
        }
    }

    public static Object j(Object obj, int i, lp5 lp5Var, Object obj2, t5c t5cVar) {
        return obj2;
    }
}
