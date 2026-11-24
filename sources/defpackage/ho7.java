package defpackage;

import java.util.List;
public final class ho7 implements j74 {
    public l74 a;
    public w8b b;
    public boolean c;

    @Override
    public final int b(defpackage.k74 r25, defpackage.m11 r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ho7.b(k74, m11):int");
    }

    @Override
    public final boolean c(k74 k74Var) {
        try {
            return g((ja3) k74Var);
        } catch (av7 unused) {
            return false;
        }
    }

    @Override
    public final void d(long j, long j2) {
        w8b w8bVar = this.b;
        if (w8bVar != null) {
            jo7 jo7Var = w8bVar.a;
            ko7 ko7Var = jo7Var.a;
            ko7Var.a = (short) 0;
            ko7Var.b = 0L;
            ko7Var.c = (short) 0;
            ko7Var.d = 0;
            ko7Var.e = 0;
            jo7Var.b.K(0);
            jo7Var.c = -1;
            jo7Var.e = false;
            if (j == 0) {
                w8bVar.d(!w8bVar.l);
            } else if (w8bVar.h != 0) {
                long j3 = (w8bVar.i * j2) / 1000000;
                w8bVar.e = j3;
                lo7 lo7Var = w8bVar.d;
                String str = g8c.a;
                lo7Var.b0(j3);
                w8bVar.h = (byte) 2;
            }
        }
    }

    @Override
    public final List e() {
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override
    public final void f(l74 l74Var) {
        this.a = l74Var;
    }

    public final boolean g(ja3 ja3Var) {
        boolean z;
        ko7 ko7Var = new ko7();
        if (ko7Var.a(ja3Var, true) && (ko7Var.a & 2) == 2) {
            int min = Math.min(ko7Var.e, 8);
            xu7 xu7Var = new xu7(min);
            ja3Var.d(xu7Var.a, 0, min, false);
            xu7Var.N(0);
            if (xu7Var.a() >= 5 && xu7Var.A() == 127 && xu7Var.C() == 1179402563) {
                this.b = new w8b();
                return true;
            }
            xu7Var.N(0);
            try {
                z = aye.c(1, xu7Var, true);
            } catch (av7 unused) {
                z = false;
            }
            if (z) {
                this.b = new w8b();
            } else {
                xu7Var.N(0);
                if (wq7.e(xu7Var, wq7.o)) {
                    this.b = new w8b();
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final j74 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
