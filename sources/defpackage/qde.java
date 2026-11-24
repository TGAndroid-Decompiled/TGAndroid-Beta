package defpackage;

import java.util.Arrays;
import java.util.List;
public abstract class qde {
    public static final a8d a;

    static {
        kce kceVar = kce.c;
        a = new Object();
    }

    public static void a(int i, List list, cf9 cf9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fyd fydVar = (fyd) cf9Var.b;
            int i2 = 0;
            if (list instanceof k4e) {
                k4e k4eVar = (k4e) list;
                if (z) {
                    fydVar.m(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < k4eVar.c; i4++) {
                        int i5 = k4eVar.i(i4);
                        i3 += fyd.b((i5 << 1) ^ (i5 >> 31));
                    }
                    fydVar.o(i3);
                    while (i2 < k4eVar.c) {
                        int i6 = k4eVar.i(i2);
                        fydVar.o((i6 << 1) ^ (i6 >> 31));
                        i2++;
                    }
                    return;
                }
                while (i2 < k4eVar.c) {
                    int i7 = k4eVar.i(i2);
                    fydVar.n(i, (i7 << 1) ^ (i7 >> 31));
                    i2++;
                }
            } else if (z) {
                fydVar.m(i, 2);
                int i8 = 0;
                for (int i9 = 0; i9 < list.size(); i9++) {
                    int intValue = ((Integer) list.get(i9)).intValue();
                    i8 += fyd.b((intValue << 1) ^ (intValue >> 31));
                }
                fydVar.o(i8);
                while (i2 < list.size()) {
                    int intValue2 = ((Integer) list.get(i2)).intValue();
                    fydVar.o((intValue2 << 1) ^ (intValue2 >> 31));
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    int intValue3 = ((Integer) list.get(i2)).intValue();
                    fydVar.n(i, (intValue3 << 1) ^ (intValue3 >> 31));
                    i2++;
                }
            }
        }
    }

    public static void b(int i, List list, cf9 cf9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fyd fydVar = (fyd) cf9Var.b;
            if (!(list instanceof o8e)) {
                int i2 = 0;
                if (z) {
                    fydVar.m(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        long longValue = ((Long) list.get(i4)).longValue();
                        i3 += fyd.c((longValue << 1) ^ (longValue >> 63));
                    }
                    fydVar.o(i3);
                    while (i2 < list.size()) {
                        long longValue2 = ((Long) list.get(i2)).longValue();
                        fydVar.q((longValue2 << 1) ^ (longValue2 >> 63));
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    long longValue3 = ((Long) list.get(i2)).longValue();
                    fydVar.p(i, (longValue3 << 1) ^ (longValue3 >> 63));
                    i2++;
                }
                return;
            }
            rjb.p();
        }
    }

    public static void c(int i, List list, cf9 cf9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fyd fydVar = (fyd) cf9Var.b;
            int i2 = 0;
            if (list instanceof k4e) {
                k4e k4eVar = (k4e) list;
                if (z) {
                    fydVar.m(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < k4eVar.c; i4++) {
                        i3 += fyd.b(k4eVar.i(i4));
                    }
                    fydVar.o(i3);
                    while (i2 < k4eVar.c) {
                        fydVar.o(k4eVar.i(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < k4eVar.c) {
                    fydVar.n(i, k4eVar.i(i2));
                    i2++;
                }
            } else if (z) {
                fydVar.m(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += fyd.b(((Integer) list.get(i6)).intValue());
                }
                fydVar.o(i5);
                while (i2 < list.size()) {
                    fydVar.o(((Integer) list.get(i2)).intValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    fydVar.n(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
            }
        }
    }

    public static void d(int i, List list, cf9 cf9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fyd fydVar = (fyd) cf9Var.b;
            if (!(list instanceof o8e)) {
                int i2 = 0;
                if (z) {
                    fydVar.m(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += fyd.c(((Long) list.get(i4)).longValue());
                    }
                    fydVar.o(i3);
                    while (i2 < list.size()) {
                        fydVar.q(((Long) list.get(i2)).longValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    fydVar.p(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            rjb.p();
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
        if (list instanceof k4e) {
            k4e k4eVar = (k4e) list;
            int i2 = 0;
            while (i < size) {
                i2 += fyd.c(k4eVar.i(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += fyd.c(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (fyd.b(i << 3) + 4) * size;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (fyd.b(i << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof k4e) {
            k4e k4eVar = (k4e) list;
            int i2 = 0;
            while (i < size) {
                i2 += fyd.c(k4eVar.i(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += fyd.c(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof o8e) {
            o8e o8eVar = (o8e) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += fyd.c(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof k4e) {
            k4e k4eVar = (k4e) list;
            int i2 = 0;
            while (i < size) {
                int i3 = k4eVar.i(i);
                i2 += fyd.b((i3 << 1) ^ (i3 >> 31));
                i++;
            }
            return i2;
        }
        int i4 = 0;
        while (i < size) {
            int intValue = ((Integer) list.get(i)).intValue();
            i4 += fyd.b((intValue << 1) ^ (intValue >> 31));
            i++;
        }
        return i4;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof o8e) {
            o8e o8eVar = (o8e) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += fyd.c((longValue << 1) ^ (longValue >> 63));
        }
        return i;
    }

    public static int m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof k4e) {
            k4e k4eVar = (k4e) list;
            int i2 = 0;
            while (i < size) {
                i2 += fyd.b(k4eVar.i(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += fyd.b(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof o8e) {
            o8e o8eVar = (o8e) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += fyd.c(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void o(Object obj, Object obj2) {
        f4e f4eVar = (f4e) obj;
        jge jgeVar = f4eVar.zzc;
        jge jgeVar2 = ((f4e) obj2).zzc;
        jge jgeVar3 = jge.f;
        if (!jgeVar3.equals(jgeVar2)) {
            if (jgeVar3.equals(jgeVar)) {
                int i = jgeVar.a + jgeVar2.a;
                int[] copyOf = Arrays.copyOf(jgeVar.b, i);
                System.arraycopy(jgeVar2.b, 0, copyOf, jgeVar.a, jgeVar2.a);
                Object[] copyOf2 = Arrays.copyOf(jgeVar.c, i);
                System.arraycopy(jgeVar2.c, 0, copyOf2, jgeVar.a, jgeVar2.a);
                jgeVar = new jge(i, copyOf, copyOf2, true);
            } else {
                jgeVar.getClass();
                if (!jgeVar2.equals(jgeVar3)) {
                    if (jgeVar.e) {
                        int i2 = jgeVar.a + jgeVar2.a;
                        jgeVar.e(i2);
                        System.arraycopy(jgeVar2.b, 0, jgeVar.b, jgeVar.a, jgeVar2.a);
                        System.arraycopy(jgeVar2.c, 0, jgeVar.c, jgeVar.a, jgeVar2.a);
                        jgeVar.a = i2;
                    } else {
                        gxc.b();
                        return;
                    }
                }
            }
        }
        f4eVar.zzc = jgeVar;
    }

    public static void p(int i, List list, cf9 cf9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fyd fydVar = (fyd) cf9Var.b;
            int i2 = fydVar.c;
            byte[] bArr = fydVar.b;
            if (!(list instanceof wud)) {
                int i3 = 0;
                if (z) {
                    fydVar.m(i, 2);
                    int i4 = 0;
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        ((Boolean) list.get(i5)).getClass();
                        i4++;
                    }
                    fydVar.o(i4);
                    while (i3 < list.size()) {
                        byte booleanValue = ((Boolean) list.get(i3)).booleanValue();
                        int i6 = fydVar.d;
                        int i7 = i6 + 1;
                        try {
                            bArr[i6] = booleanValue;
                            fydVar.d = i7;
                            i3++;
                        } catch (IndexOutOfBoundsException e) {
                            throw new ol2(i7, i2, 1, e);
                        }
                    }
                    return;
                }
                while (i3 < list.size()) {
                    byte booleanValue2 = ((Boolean) list.get(i3)).booleanValue();
                    fydVar.o(i << 3);
                    int i8 = fydVar.d;
                    int i9 = i8 + 1;
                    try {
                        bArr[i8] = booleanValue2;
                        fydVar.d = i9;
                        i3++;
                    } catch (IndexOutOfBoundsException e2) {
                        throw new ol2(i9, i2, 1, e2);
                    }
                }
                return;
            }
            rjb.p();
        }
    }

    public static void q(int i, List list, cf9 cf9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fyd fydVar = (fyd) cf9Var.b;
            if (!(list instanceof czd)) {
                int i2 = 0;
                if (z) {
                    fydVar.m(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Double) list.get(i4)).getClass();
                        i3 += 8;
                    }
                    fydVar.o(i3);
                    while (i2 < list.size()) {
                        fydVar.i(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    fydVar.h(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            rjb.p();
        }
    }

    public static void r(int i, List list, cf9 cf9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fyd fydVar = (fyd) cf9Var.b;
            int i2 = 0;
            if (list instanceof k4e) {
                k4e k4eVar = (k4e) list;
                if (z) {
                    fydVar.m(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < k4eVar.c; i4++) {
                        i3 += fyd.c(k4eVar.i(i4));
                    }
                    fydVar.o(i3);
                    while (i2 < k4eVar.c) {
                        fydVar.k(k4eVar.i(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < k4eVar.c) {
                    fydVar.j(i, k4eVar.i(i2));
                    i2++;
                }
            } else if (z) {
                fydVar.m(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += fyd.c(((Integer) list.get(i6)).intValue());
                }
                fydVar.o(i5);
                while (i2 < list.size()) {
                    fydVar.k(((Integer) list.get(i2)).intValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    fydVar.j(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
            }
        }
    }

    public static void s(int i, List list, cf9 cf9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fyd fydVar = (fyd) cf9Var.b;
            int i2 = 0;
            if (list instanceof k4e) {
                k4e k4eVar = (k4e) list;
                if (z) {
                    fydVar.m(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < k4eVar.c; i4++) {
                        k4eVar.i(i4);
                        i3 += 4;
                    }
                    fydVar.o(i3);
                    while (i2 < k4eVar.c) {
                        fydVar.g(k4eVar.i(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < k4eVar.c) {
                    fydVar.f(i, k4eVar.i(i2));
                    i2++;
                }
            } else if (z) {
                fydVar.m(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Integer) list.get(i6)).getClass();
                    i5 += 4;
                }
                fydVar.o(i5);
                while (i2 < list.size()) {
                    fydVar.g(((Integer) list.get(i2)).intValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    fydVar.f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
            }
        }
    }

    public static void t(int i, List list, cf9 cf9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fyd fydVar = (fyd) cf9Var.b;
            if (!(list instanceof o8e)) {
                int i2 = 0;
                if (z) {
                    fydVar.m(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Long) list.get(i4)).getClass();
                        i3 += 8;
                    }
                    fydVar.o(i3);
                    while (i2 < list.size()) {
                        fydVar.i(((Long) list.get(i2)).longValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    fydVar.h(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            rjb.p();
        }
    }

    public static void u(int i, List list, cf9 cf9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fyd fydVar = (fyd) cf9Var.b;
            if (!(list instanceof n1e)) {
                int i2 = 0;
                if (z) {
                    fydVar.m(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Float) list.get(i4)).getClass();
                        i3 += 4;
                    }
                    fydVar.o(i3);
                    while (i2 < list.size()) {
                        fydVar.g(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    fydVar.f(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            rjb.p();
        }
    }

    public static void v(int i, List list, cf9 cf9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fyd fydVar = (fyd) cf9Var.b;
            int i2 = 0;
            if (list instanceof k4e) {
                k4e k4eVar = (k4e) list;
                if (z) {
                    fydVar.m(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < k4eVar.c; i4++) {
                        i3 += fyd.c(k4eVar.i(i4));
                    }
                    fydVar.o(i3);
                    while (i2 < k4eVar.c) {
                        fydVar.k(k4eVar.i(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < k4eVar.c) {
                    fydVar.j(i, k4eVar.i(i2));
                    i2++;
                }
            } else if (z) {
                fydVar.m(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += fyd.c(((Integer) list.get(i6)).intValue());
                }
                fydVar.o(i5);
                while (i2 < list.size()) {
                    fydVar.k(((Integer) list.get(i2)).intValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    fydVar.j(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
            }
        }
    }

    public static void w(int i, List list, cf9 cf9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fyd fydVar = (fyd) cf9Var.b;
            if (!(list instanceof o8e)) {
                int i2 = 0;
                if (z) {
                    fydVar.m(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += fyd.c(((Long) list.get(i4)).longValue());
                    }
                    fydVar.o(i3);
                    while (i2 < list.size()) {
                        fydVar.q(((Long) list.get(i2)).longValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    fydVar.p(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            rjb.p();
        }
    }

    public static void x(int i, List list, cf9 cf9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fyd fydVar = (fyd) cf9Var.b;
            int i2 = 0;
            if (list instanceof k4e) {
                k4e k4eVar = (k4e) list;
                if (z) {
                    fydVar.m(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < k4eVar.c; i4++) {
                        k4eVar.i(i4);
                        i3 += 4;
                    }
                    fydVar.o(i3);
                    while (i2 < k4eVar.c) {
                        fydVar.g(k4eVar.i(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < k4eVar.c) {
                    fydVar.f(i, k4eVar.i(i2));
                    i2++;
                }
            } else if (z) {
                fydVar.m(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Integer) list.get(i6)).getClass();
                    i5 += 4;
                }
                fydVar.o(i5);
                while (i2 < list.size()) {
                    fydVar.g(((Integer) list.get(i2)).intValue());
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    fydVar.f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
            }
        }
    }

    public static void y(int i, List list, cf9 cf9Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            fyd fydVar = (fyd) cf9Var.b;
            if (!(list instanceof o8e)) {
                int i2 = 0;
                if (z) {
                    fydVar.m(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        ((Long) list.get(i4)).getClass();
                        i3 += 8;
                    }
                    fydVar.o(i3);
                    while (i2 < list.size()) {
                        fydVar.i(((Long) list.get(i2)).longValue());
                        i2++;
                    }
                    return;
                }
                while (i2 < list.size()) {
                    fydVar.h(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            rjb.p();
        }
    }
}
