package defpackage;

import j$.util.Objects;
import java.util.HashMap;
public final class zpb extends bqb {
    public final y79 e;
    public final y79 f;
    public final int[] g;
    public final int[] h;
    public final qo5 i;

    public zpb(y79 y79Var, y79 y79Var2, int[] iArr) {
        boolean z;
        int i;
        int i2;
        y79 y79Var3 = y79Var;
        int i3 = y79Var3.d;
        int i4 = y79Var3.d;
        int i5 = 1;
        if (i3 == iArr.length) {
            z = true;
        } else {
            z = false;
        }
        jte.f(z);
        this.g = iArr;
        this.h = new int[iArr.length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            this.h[iArr[i6]] = i6;
        }
        jo5 p = mo5.p();
        int i7 = 0;
        while (i7 < i4) {
            aqb aqbVar = (aqb) y79Var3.get(i7);
            if (i4 > i5 && Objects.equals(aqbVar.a, aqb.p)) {
                aqb aqbVar2 = new aqb();
                i = i7;
                i2 = i4;
                aqbVar2.b(new Object(), aqbVar.b, aqbVar.c, aqbVar.d, aqbVar.e, aqbVar.f, aqbVar.g, aqbVar.h, aqbVar.i, aqbVar.k, aqbVar.l, aqbVar.m, aqbVar.n, aqbVar.o);
                aqbVar2.j = aqbVar.j;
                aqbVar = aqbVar2;
            } else {
                i = i7;
                i2 = i4;
            }
            p.c(aqbVar);
            i7 = i + 1;
            y79Var3 = y79Var;
            i4 = i2;
            i5 = 1;
        }
        this.e = p.f();
        jo5 p2 = mo5.p();
        HashMap hashMap = new HashMap(fqe.a(y79Var2.d));
        for (int i8 = 0; i8 < y79Var2.d; i8++) {
            ypb ypbVar = (ypb) y79Var2.get(i8);
            if (ypbVar.b == null) {
                ypb ypbVar2 = new ypb();
                Object obj = ypbVar.a;
                Object obj2 = new Object();
                int i9 = ypbVar.c;
                long j = ypbVar.d;
                long j2 = ypbVar.e;
                da daVar = da.c;
                ypbVar2.h(obj, obj2, i9, j, j2, ypbVar.f);
                ypbVar = ypbVar2;
            }
            p2.c(ypbVar);
            Object obj3 = ypbVar.b;
            obj3.getClass();
            if (!hashMap.containsKey(obj3)) {
                hashMap.put(obj3, Integer.valueOf(i8));
            }
        }
        this.f = p2.f();
        this.i = qo5.b(hashMap);
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
        y79 y79Var = this.e;
        if (z) {
            return this.g[y79Var.d - 1];
        }
        return y79Var.d - 1;
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
    public final ypb f(int i, ypb ypbVar, boolean z) {
        ypb ypbVar2 = (ypb) this.f.get(i);
        Object obj = ypbVar2.a;
        Object obj2 = ypbVar2.b;
        int i2 = ypbVar2.c;
        long j = ypbVar2.d;
        long j2 = ypbVar2.e;
        da daVar = da.c;
        ypbVar.h(obj, obj2, i2, j, j2, ypbVar2.f);
        return ypbVar;
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
        Object obj = ((ypb) this.f.get(i)).b;
        obj.getClass();
        return obj;
    }

    @Override
    public final aqb m(int i, aqb aqbVar, long j) {
        aqb aqbVar2 = (aqb) this.e.get(i);
        aqbVar.b(aqbVar2.a, aqbVar2.b, aqbVar2.c, aqbVar2.d, aqbVar2.e, aqbVar2.f, aqbVar2.g, aqbVar2.h, aqbVar2.i, aqbVar2.k, aqbVar2.l, aqbVar2.m, aqbVar2.n, aqbVar2.o);
        aqbVar.j = aqbVar2.j;
        return aqbVar;
    }

    @Override
    public final int o() {
        return this.e.d;
    }
}
