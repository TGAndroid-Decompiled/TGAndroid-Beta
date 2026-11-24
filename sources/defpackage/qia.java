package defpackage;

import java.util.List;
public final class qia implements j74 {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public byte e;
    public l74 f;
    public wxb g;

    public qia(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override
    public final int b(k74 k74Var, m11 m11Var) {
        byte b = this.e;
        if (b != 1) {
            if (b == 2) {
                return -1;
            }
            sdb.a();
            return 0;
        }
        wxb wxbVar = this.g;
        wxbVar.getClass();
        int f = wxbVar.f(k74Var, 1024, true);
        if (f == -1) {
            this.e = (byte) 2;
            this.g.a(0L, 1, this.d, 0, null);
            this.d = 0;
            return 0;
        }
        this.d += f;
        return 0;
    }

    @Override
    public final boolean c(k74 k74Var) {
        boolean z;
        int i = this.b;
        int i2 = this.a;
        if (i2 != -1 && i != -1) {
            z = true;
        } else {
            z = false;
        }
        gre.p(z);
        xu7 xu7Var = new xu7(i);
        ((ja3) k74Var).d(xu7Var.a, 0, i, false);
        if (xu7Var.H() == i2) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(long j, long j2) {
        if (j != 0 && this.e != 1) {
            return;
        }
        this.e = (byte) 1;
        this.d = 0;
    }

    @Override
    public final List e() {
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override
    public final void f(l74 l74Var) {
        this.f = l74Var;
        wxb S = l74Var.S(1024, 4);
        this.g = S;
        em4 em4Var = new em4();
        String str = this.c;
        em4Var.r = ud7.n(str);
        em4Var.s = ud7.n(str);
        yjb.v(em4Var, S);
        this.f.z();
        this.f.g0(new Object());
        this.e = (byte) 1;
    }

    @Override
    public final j74 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
