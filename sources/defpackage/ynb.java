package defpackage;

import j$.util.Objects;
import java.util.HashMap;
public final class ynb extends aob {
    public final w59 e;
    public final w59 f;
    public final int[] g;
    public final int[] h;
    public final qm5 i;

    public ynb(w59 w59Var, w59 w59Var2, int[] iArr) {
        boolean z;
        int i;
        int i2;
        w59 w59Var3 = w59Var;
        int i3 = w59Var3.d;
        int i4 = w59Var3.d;
        int i5 = 1;
        if (i3 == iArr.length) {
            z = true;
        } else {
            z = false;
        }
        gre.f(z);
        this.g = iArr;
        this.h = new int[iArr.length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            this.h[iArr[i6]] = i6;
        }
        jm5 p = mm5.p();
        int i7 = 0;
        while (i7 < i4) {
            znb znbVar = (znb) w59Var3.get(i7);
            if (i4 > i5 && Objects.equals(znbVar.a, znb.p)) {
                znb znbVar2 = new znb();
                i = i7;
                i2 = i4;
                znbVar2.b(new Object(), znbVar.b, znbVar.c, znbVar.d, znbVar.e, znbVar.f, znbVar.g, znbVar.h, znbVar.i, znbVar.k, znbVar.l, znbVar.m, znbVar.n, znbVar.o);
                znbVar2.j = znbVar.j;
                znbVar = znbVar2;
            } else {
                i = i7;
                i2 = i4;
            }
            p.c(znbVar);
            i7 = i + 1;
            w59Var3 = w59Var;
            i4 = i2;
            i5 = 1;
        }
        this.e = p.f();
        jm5 p2 = mm5.p();
        HashMap hashMap = new HashMap(coe.a(w59Var2.d));
        for (int i8 = 0; i8 < w59Var2.d; i8++) {
            xnb xnbVar = (xnb) w59Var2.get(i8);
            if (xnbVar.b == null) {
                xnb xnbVar2 = new xnb();
                Object obj = xnbVar.a;
                Object obj2 = new Object();
                int i9 = xnbVar.c;
                long j = xnbVar.d;
                long j2 = xnbVar.e;
                da daVar = da.c;
                xnbVar2.h(obj, obj2, i9, j, j2, xnbVar.f);
                xnbVar = xnbVar2;
            }
            p2.c(xnbVar);
            Object obj3 = xnbVar.b;
            obj3.getClass();
            if (!hashMap.containsKey(obj3)) {
                hashMap.put(obj3, Integer.valueOf(i8));
            }
        }
        this.f = p2.f();
        this.i = qm5.b(hashMap);
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
        w59 w59Var = this.e;
        if (z) {
            return this.g[w59Var.d - 1];
        }
        return w59Var.d - 1;
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
    public final xnb f(int i, xnb xnbVar, boolean z) {
        xnb xnbVar2 = (xnb) this.f.get(i);
        Object obj = xnbVar2.a;
        Object obj2 = xnbVar2.b;
        int i2 = xnbVar2.c;
        long j = xnbVar2.d;
        long j2 = xnbVar2.e;
        da daVar = da.c;
        xnbVar.h(obj, obj2, i2, j, j2, xnbVar2.f);
        return xnbVar;
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
        Object obj = ((xnb) this.f.get(i)).b;
        obj.getClass();
        return obj;
    }

    @Override
    public final znb m(int i, znb znbVar, long j) {
        znb znbVar2 = (znb) this.e.get(i);
        znbVar.b(znbVar2.a, znbVar2.b, znbVar2.c, znbVar2.d, znbVar2.e, znbVar2.f, znbVar2.g, znbVar2.h, znbVar2.i, znbVar2.k, znbVar2.l, znbVar2.m, znbVar2.n, znbVar2.o);
        znbVar.j = znbVar2.j;
        return znbVar;
    }

    @Override
    public final int o() {
        return this.e.d;
    }
}
