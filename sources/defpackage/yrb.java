package defpackage;

import j$.util.Objects;
import java.util.HashMap;
public final class yrb extends asb {
    public final j99 e;
    public final j99 f;
    public final int[] g;
    public final int[] h;
    public final to5 i;

    public yrb(j99 j99Var, j99 j99Var2, int[] iArr) {
        boolean z;
        int i;
        int i2;
        j99 j99Var3 = j99Var;
        int i3 = j99Var3.d;
        int i4 = j99Var3.d;
        int i5 = 1;
        if (i3 == iArr.length) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        this.g = iArr;
        this.h = new int[iArr.length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            this.h[iArr[i6]] = i6;
        }
        mo5 p = po5.p();
        int i7 = 0;
        while (i7 < i4) {
            zrb zrbVar = (zrb) j99Var3.get(i7);
            if (i4 > i5 && Objects.equals(zrbVar.a, zrb.p)) {
                zrb zrbVar2 = new zrb();
                i = i7;
                i2 = i4;
                zrbVar2.b(new Object(), zrbVar.b, zrbVar.c, zrbVar.d, zrbVar.e, zrbVar.f, zrbVar.g, zrbVar.h, zrbVar.i, zrbVar.k, zrbVar.l, zrbVar.m, zrbVar.n, zrbVar.o);
                zrbVar2.j = zrbVar.j;
                zrbVar = zrbVar2;
            } else {
                i = i7;
                i2 = i4;
            }
            p.c(zrbVar);
            i7 = i + 1;
            j99Var3 = j99Var;
            i4 = i2;
            i5 = 1;
        }
        this.e = p.f();
        mo5 p2 = po5.p();
        HashMap hashMap = new HashMap(use.a(j99Var2.d));
        for (int i8 = 0; i8 < j99Var2.d; i8++) {
            xrb xrbVar = (xrb) j99Var2.get(i8);
            if (xrbVar.b == null) {
                xrb xrbVar2 = new xrb();
                Object obj = xrbVar.a;
                Object obj2 = new Object();
                int i9 = xrbVar.c;
                long j = xrbVar.d;
                long j2 = xrbVar.e;
                ea eaVar = ea.c;
                xrbVar2.h(obj, obj2, i9, j, j2, xrbVar.f);
                xrbVar = xrbVar2;
            }
            p2.c(xrbVar);
            Object obj3 = xrbVar.b;
            obj3.getClass();
            if (!hashMap.containsKey(obj3)) {
                hashMap.put(obj3, Integer.valueOf(i8));
            }
        }
        this.f = p2.f();
        this.i = to5.b(hashMap);
    }

    @Override
    public final int a(boolean z) {
        if (p()) {
            return -1;
        }
        if (!z) {
            return 0;
        }
        return this.g[0];
    }

    @Override
    public final int b(Object obj) {
        Integer num = (Integer) this.i.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override
    public final int c(boolean z) {
        if (p()) {
            return -1;
        }
        j99 j99Var = this.e;
        if (z) {
            return this.g[j99Var.d - 1];
        }
        return j99Var.d - 1;
    }

    @Override
    public final int e(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == c(z)) {
            if (i2 == 2) {
                return a(z);
            }
            return -1;
        } else if (z) {
            return this.g[this.h[i] + 1];
        } else {
            return i + 1;
        }
    }

    @Override
    public final xrb f(int i, xrb xrbVar, boolean z) {
        xrb xrbVar2 = (xrb) this.f.get(i);
        Object obj = xrbVar2.a;
        Object obj2 = xrbVar2.b;
        int i2 = xrbVar2.c;
        long j = xrbVar2.d;
        long j2 = xrbVar2.e;
        ea eaVar = ea.c;
        xrbVar.h(obj, obj2, i2, j, j2, xrbVar2.f);
        return xrbVar;
    }

    @Override
    public final int h() {
        return this.f.d;
    }

    @Override
    public final int k(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == a(z)) {
            if (i2 == 2) {
                return c(z);
            }
            return -1;
        } else if (z) {
            return this.g[this.h[i] - 1];
        } else {
            return i - 1;
        }
    }

    @Override
    public final Object l(int i) {
        Object obj = ((xrb) this.f.get(i)).b;
        obj.getClass();
        return obj;
    }

    @Override
    public final zrb m(int i, zrb zrbVar, long j) {
        zrb zrbVar2 = (zrb) this.e.get(i);
        zrbVar.b(zrbVar2.a, zrbVar2.b, zrbVar2.c, zrbVar2.d, zrbVar2.e, zrbVar2.f, zrbVar2.g, zrbVar2.h, zrbVar2.i, zrbVar2.k, zrbVar2.l, zrbVar2.m, zrbVar2.n, zrbVar2.o);
        zrbVar.j = zrbVar2.j;
        return zrbVar;
    }

    @Override
    public final int o() {
        return this.e.d;
    }
}
