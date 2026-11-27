package defpackage;

import java.util.Arrays;
import java.util.List;
public abstract class fge {
    public static final rad a;

    static {
        zee zeeVar = zee.c;
        a = new Object();
    }

    public static void a(int i, List list, oqd oqdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            s0e s0eVar = (s0e) oqdVar.a;
            int i2 = 0;
            if (list instanceof x6e) {
                x6e x6eVar = (x6e) list;
                if (z) {
                    s0eVar.m(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < x6eVar.c; i4++) {
                        int i5 = x6eVar.i(i4);
                        i3 += s0e.b((i5 << 1) ^ (i5 >> 31));
                    }
                    s0eVar.o(i3);
                    while (i2 < x6eVar.c) {
                        int i6 = x6eVar.i(i2);
                        s0eVar.o((i6 << 1) ^ (i6 >> 31));
                        i2++;
                    }
                    return;
                }
                while (i2 < x6eVar.c) {
                    int i7 = x6eVar.i(i2);
                    s0eVar.n(i, (i7 << 1) ^ (i7 >> 31));
                    i2++;
                }
            } else if (z) {
                s0eVar.m(i, 2);
                int i8 = 0;
                for (int i9 = 0; i9 < list.size(); i9++) {
                    int intValue = ((Integer) list.get(i9)).intValue();
                    i8 += s0e.b((intValue << 1) ^ (intValue >> 31));
                }
                s0eVar.o(i8);
                while (i2 < list.size()) {
                    int intValue2 = ((Integer) list.get(i2)).intValue();
                    s0eVar.o((intValue2 << 1) ^ (intValue2 >> 31));
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    int intValue3 = ((Integer) list.get(i2)).intValue();
                    s0eVar.n(i, (intValue3 << 1) ^ (intValue3 >> 31));
                    i2++;
                }
            }
        }
    }

    public static void b(int i, List list, oqd oqdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            s0e s0eVar = (s0e) oqdVar.a;
            if (!(list instanceof dbe)) {
                int i2 = 0;
                if (z) {
                    s0eVar.m(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        long longValue = ((Long) list.get(i4)).longValue();
                        i3 += s0e.c((longValue << 1) ^ (longValue >> 63));
                    }
                    s0eVar.o(i3);
                    while (i2 < list.size()) {
                        long longValue2 = ((Long) list.get(i2)).longValue();
                        s0eVar.q((longValue2 << 1) ^ (longValue2 >> 63));
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    long longValue3 = ((Long) list.get(i2)).longValue();
                    s0eVar.p(i, (longValue3 << 1) ^ (longValue3 >> 63));
                    i2++;
                }
                return;
            }
            grb.o();
        }
    }

    public static void c(int i, List list, oqd oqdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            s0e s0eVar = (s0e) oqdVar.a;
            int i2 = 0;
            if (list instanceof x6e) {
                x6e x6eVar = (x6e) list;
                if (z) {
                    s0eVar.m(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < x6eVar.c; i4++) {
                        i3 += s0e.b(x6eVar.i(i4));
                    }
                    s0eVar.o(i3);
                    while (i2 < x6eVar.c) {
                        s0eVar.o(x6eVar.i(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < x6eVar.c) {
                    s0eVar.n(i, x6eVar.i(i2));
                    i2++;
                }
            } else if (z) {
                s0eVar.m(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += s0e.b(((Integer) list.get(i6)).intValue());
                }
                s0eVar.o(i5);
                while (i2 < list.size()) {
                    s0eVar.o(((Integer) list.get(i2)).intValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    s0eVar.n(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
            }
        }
    }

    public static void d(int i, List list, oqd oqdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            s0e s0eVar = (s0e) oqdVar.a;
            if (!(list instanceof dbe)) {
                int i2 = 0;
                if (z) {
                    s0eVar.m(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += s0e.c(((Long) list.get(i4)).longValue());
                    }
                    s0eVar.o(i3);
                    while (i2 < list.size()) {
                        s0eVar.q(((Long) list.get(i2)).longValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    s0eVar.p(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            grb.o();
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
        if (list instanceof x6e) {
            x6e x6eVar = (x6e) list;
            int i2 = 0;
            while (i < size) {
                i2 += s0e.c(x6eVar.i(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += s0e.c(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (s0e.b(i << 3) + 4) * size;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (s0e.b(i << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x6e) {
            x6e x6eVar = (x6e) list;
            int i2 = 0;
            while (i < size) {
                i2 += s0e.c(x6eVar.i(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += s0e.c(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof dbe) {
            dbe dbeVar = (dbe) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += s0e.c(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x6e) {
            x6e x6eVar = (x6e) list;
            int i2 = 0;
            while (i < size) {
                int i3 = x6eVar.i(i);
                i2 += s0e.b((i3 << 1) ^ (i3 >> 31));
                i++;
            }
            return i2;
        }
        int i4 = 0;
        while (i < size) {
            int intValue = ((Integer) list.get(i)).intValue();
            i4 += s0e.b((intValue << 1) ^ (intValue >> 31));
            i++;
        }
        return i4;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof dbe) {
            dbe dbeVar = (dbe) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += s0e.c((longValue << 1) ^ (longValue >> 63));
        }
        return i;
    }

    public static int m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x6e) {
            x6e x6eVar = (x6e) list;
            int i2 = 0;
            while (i < size) {
                i2 += s0e.b(x6eVar.i(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += s0e.b(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof dbe) {
            dbe dbeVar = (dbe) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += s0e.c(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void o(Object obj, Object obj2) {
        s6e s6eVar = (s6e) obj;
        zie zieVar = s6eVar.zzc;
        zie zieVar2 = ((s6e) obj2).zzc;
        zie zieVar3 = zie.f;
        if (!zieVar3.equals(zieVar2)) {
            if (zieVar3.equals(zieVar)) {
                int i = zieVar.a + zieVar2.a;
                int[] copyOf = Arrays.copyOf(zieVar.b, i);
                System.arraycopy(zieVar2.b, 0, copyOf, zieVar.a, zieVar2.a);
                Object[] copyOf2 = Arrays.copyOf(zieVar.c, i);
                System.arraycopy(zieVar2.c, 0, copyOf2, zieVar.a, zieVar2.a);
                zieVar = new zie(i, copyOf, copyOf2, true);
            } else {
                zieVar.getClass();
                if (!zieVar2.equals(zieVar3)) {
                    if (zieVar.e) {
                        int i2 = zieVar.a + zieVar2.a;
                        zieVar.e(i2);
                        System.arraycopy(zieVar2.b, 0, zieVar.b, zieVar.a, zieVar2.a);
                        System.arraycopy(zieVar2.c, 0, zieVar.c, zieVar.a, zieVar2.a);
                        zieVar.a = i2;
                    } else {
                        p3d.a();
                        return;
                    }
                }
            }
        }
        s6eVar.zzc = zieVar;
    }

    public static void p(int i, List list, oqd oqdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            s0e s0eVar = (s0e) oqdVar.a;
            int i2 = s0eVar.c;
            byte[] bArr = s0eVar.b;
            if (!(list instanceof jxd)) {
                int i3 = 0;
                if (z) {
                    s0eVar.m(i, 2);
                    int i4 = 0;
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        ((Boolean) list.get(i5)).getClass();
                        i4++;
                    }
                    s0eVar.o(i4);
                    while (i3 < list.size()) {
                        byte booleanValue = ((Boolean) list.get(i3)).booleanValue();
                        int i6 = s0eVar.d;
                        int i7 = i6 + 1;
                        try {
                            bArr[i6] = booleanValue;
                            s0eVar.d = i7;
                            i3++;
                        } catch (IndexOutOfBoundsException e) {
                            throw new wk2(i7, i2, 1, e);
                        }
                    }
                    return;
                }
                while (i3 < list.size()) {
                    byte booleanValue2 = ((Boolean) list.get(i3)).booleanValue();
                    s0eVar.o(i << 3);
                    int i8 = s0eVar.d;
                    int i9 = i8 + 1;
                    try {
                        bArr[i8] = booleanValue2;
                        s0eVar.d = i9;
                        i3++;
                    } catch (IndexOutOfBoundsException e2) {
                        throw new wk2(i9, i2, 1, e2);
                    }
                }
                return;
            }
            grb.o();
        }
    }

    public static void q(int i, List list, oqd oqdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            s0e s0eVar = (s0e) oqdVar.a;
            if (!(list instanceof p1e)) {
                int i2 = 0;
                if (z) {
                    s0eVar.m(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Double) list.get(i4)).getClass();
                        i3 += 8;
                    }
                    s0eVar.o(i3);
                    while (i2 < list.size()) {
                        s0eVar.i(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    s0eVar.h(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            grb.o();
        }
    }

    public static void r(int i, List list, oqd oqdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            s0e s0eVar = (s0e) oqdVar.a;
            int i2 = 0;
            if (list instanceof x6e) {
                x6e x6eVar = (x6e) list;
                if (z) {
                    s0eVar.m(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < x6eVar.c; i4++) {
                        i3 += s0e.c(x6eVar.i(i4));
                    }
                    s0eVar.o(i3);
                    while (i2 < x6eVar.c) {
                        s0eVar.k(x6eVar.i(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < x6eVar.c) {
                    s0eVar.j(i, x6eVar.i(i2));
                    i2++;
                }
            } else if (z) {
                s0eVar.m(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += s0e.c(((Integer) list.get(i6)).intValue());
                }
                s0eVar.o(i5);
                while (i2 < list.size()) {
                    s0eVar.k(((Integer) list.get(i2)).intValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    s0eVar.j(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
            }
        }
    }

    public static void s(int i, List list, oqd oqdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            s0e s0eVar = (s0e) oqdVar.a;
            int i2 = 0;
            if (list instanceof x6e) {
                x6e x6eVar = (x6e) list;
                if (z) {
                    s0eVar.m(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < x6eVar.c; i4++) {
                        x6eVar.i(i4);
                        i3 += 4;
                    }
                    s0eVar.o(i3);
                    while (i2 < x6eVar.c) {
                        s0eVar.g(x6eVar.i(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < x6eVar.c) {
                    s0eVar.f(i, x6eVar.i(i2));
                    i2++;
                }
            } else if (z) {
                s0eVar.m(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Integer) list.get(i6)).getClass();
                    i5 += 4;
                }
                s0eVar.o(i5);
                while (i2 < list.size()) {
                    s0eVar.g(((Integer) list.get(i2)).intValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    s0eVar.f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
            }
        }
    }

    public static void t(int i, List list, oqd oqdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            s0e s0eVar = (s0e) oqdVar.a;
            if (!(list instanceof dbe)) {
                int i2 = 0;
                if (z) {
                    s0eVar.m(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Long) list.get(i4)).getClass();
                        i3 += 8;
                    }
                    s0eVar.o(i3);
                    while (i2 < list.size()) {
                        s0eVar.i(((Long) list.get(i2)).longValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    s0eVar.h(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            grb.o();
        }
    }

    public static void u(int i, List list, oqd oqdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            s0e s0eVar = (s0e) oqdVar.a;
            if (!(list instanceof a4e)) {
                int i2 = 0;
                if (z) {
                    s0eVar.m(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Float) list.get(i4)).getClass();
                        i3 += 4;
                    }
                    s0eVar.o(i3);
                    while (i2 < list.size()) {
                        s0eVar.g(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    s0eVar.f(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            grb.o();
        }
    }

    public static void v(int i, List list, oqd oqdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            s0e s0eVar = (s0e) oqdVar.a;
            int i2 = 0;
            if (list instanceof x6e) {
                x6e x6eVar = (x6e) list;
                if (z) {
                    s0eVar.m(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < x6eVar.c; i4++) {
                        i3 += s0e.c(x6eVar.i(i4));
                    }
                    s0eVar.o(i3);
                    while (i2 < x6eVar.c) {
                        s0eVar.k(x6eVar.i(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < x6eVar.c) {
                    s0eVar.j(i, x6eVar.i(i2));
                    i2++;
                }
            } else if (z) {
                s0eVar.m(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += s0e.c(((Integer) list.get(i6)).intValue());
                }
                s0eVar.o(i5);
                while (i2 < list.size()) {
                    s0eVar.k(((Integer) list.get(i2)).intValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    s0eVar.j(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
            }
        }
    }

    public static void w(int i, List list, oqd oqdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            s0e s0eVar = (s0e) oqdVar.a;
            if (!(list instanceof dbe)) {
                int i2 = 0;
                if (z) {
                    s0eVar.m(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += s0e.c(((Long) list.get(i4)).longValue());
                    }
                    s0eVar.o(i3);
                    while (i2 < list.size()) {
                        s0eVar.q(((Long) list.get(i2)).longValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    s0eVar.p(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            grb.o();
        }
    }

    public static void x(int i, List list, oqd oqdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            s0e s0eVar = (s0e) oqdVar.a;
            int i2 = 0;
            if (list instanceof x6e) {
                x6e x6eVar = (x6e) list;
                if (z) {
                    s0eVar.m(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < x6eVar.c; i4++) {
                        x6eVar.i(i4);
                        i3 += 4;
                    }
                    s0eVar.o(i3);
                    while (i2 < x6eVar.c) {
                        s0eVar.g(x6eVar.i(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < x6eVar.c) {
                    s0eVar.f(i, x6eVar.i(i2));
                    i2++;
                }
            } else if (z) {
                s0eVar.m(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Integer) list.get(i6)).getClass();
                    i5 += 4;
                }
                s0eVar.o(i5);
                while (i2 < list.size()) {
                    s0eVar.g(((Integer) list.get(i2)).intValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    s0eVar.f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
            }
        }
    }

    public static void y(int i, List list, oqd oqdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            s0e s0eVar = (s0e) oqdVar.a;
            if (!(list instanceof dbe)) {
                int i2 = 0;
                if (z) {
                    s0eVar.m(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Long) list.get(i4)).getClass();
                        i3 += 8;
                    }
                    s0eVar.o(i3);
                    while (i2 < list.size()) {
                        s0eVar.i(((Long) list.get(i2)).longValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    s0eVar.h(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            grb.o();
        }
    }
}
