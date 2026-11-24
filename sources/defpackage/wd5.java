package defpackage;

import android.util.Pair;
import java.util.List;
public final class wd5 implements j74 {
    public final byte a;
    public final qia b;
    public l74 c;
    public j74 d;
    public Pair e;
    public final j74 f;

    public wd5(int i, byte b) {
        ku5 ku5Var;
        vd5 vd5Var;
        this.a = b;
        switch (b) {
            case 1:
                this.b = new qia(65496, 2, "image/jpeg");
                if ((i & 1) == 0) {
                    ku5Var = new ku5();
                } else {
                    ku5Var = null;
                }
                this.f = ku5Var;
                return;
            default:
                this.b = new qia(-1, -1, "image/heif");
                if ((i & 1) != 0) {
                    vd5Var = null;
                } else {
                    vd5Var = new vd5();
                }
                this.f = vd5Var;
                return;
        }
    }

    @Override
    public final j74 a() {
        byte b = this.a;
        return this;
    }

    @Override
    public final int b(k74 k74Var, m11 m11Var) {
        byte b = this.a;
        j74 j74Var = this.b;
        boolean z = true;
        j74 j74Var2 = this.f;
        switch (b) {
            case 0:
                j74 j74Var3 = this.d;
                if (j74Var3 == null) {
                    j74 j74Var4 = (vd5) j74Var2;
                    if (j74Var3 != null) {
                        z = false;
                    }
                    gre.p(z);
                    j74Var4.getClass();
                    if (j74Var4.c(k74Var)) {
                        j74Var = j74Var4;
                    }
                    this.d = j74Var;
                    ((ja3) k74Var).f = 0;
                    Pair pair = this.e;
                    if (pair != null) {
                        j74Var.d(((Long) pair.first).longValue(), ((Long) this.e.second).longValue());
                        this.e = null;
                    }
                    j74 j74Var5 = this.d;
                    l74 l74Var = this.c;
                    l74Var.getClass();
                    j74Var5.f(l74Var);
                }
                return this.d.b(k74Var, m11Var);
            default:
                j74 j74Var6 = this.d;
                if (j74Var6 == null) {
                    j74 j74Var7 = (ku5) j74Var2;
                    if (j74Var6 != null) {
                        z = false;
                    }
                    gre.p(z);
                    j74Var7.getClass();
                    if (j74Var7.c(k74Var)) {
                        j74Var = j74Var7;
                    }
                    this.d = j74Var;
                    ((ja3) k74Var).f = 0;
                    Pair pair2 = this.e;
                    if (pair2 != null) {
                        j74Var.d(((Long) pair2.first).longValue(), ((Long) this.e.second).longValue());
                        this.e = null;
                    }
                    j74 j74Var8 = this.d;
                    l74 l74Var2 = this.c;
                    l74Var2.getClass();
                    j74Var8.f(l74Var2);
                }
                return this.d.b(k74Var, m11Var);
        }
    }

    @Override
    public final boolean c(k74 k74Var) {
        byte b = this.a;
        j74 j74Var = this.f;
        switch (b) {
            case 0:
                if (((vd5) j74Var) != null && hje.a((ja3) k74Var, true)) {
                    return true;
                }
                ja3 ja3Var = (ja3) k74Var;
                ja3Var.f = 0;
                return hje.a(ja3Var, false);
            default:
                ku5 ku5Var = (ku5) j74Var;
                if (ku5Var != null && ku5Var.c(k74Var)) {
                    return true;
                }
                ((ja3) k74Var).f = 0;
                return this.b.c(k74Var);
        }
    }

    @Override
    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                j74 j74Var = this.d;
                if (j74Var != null) {
                    j74Var.d(j, j2);
                    return;
                } else {
                    this.e = Pair.create(Long.valueOf(j), Long.valueOf(j2));
                    return;
                }
            default:
                j74 j74Var2 = this.d;
                if (j74Var2 != null) {
                    j74Var2.d(j, j2);
                    return;
                } else {
                    this.e = Pair.create(Long.valueOf(j), Long.valueOf(j2));
                    return;
                }
        }
    }

    @Override
    public final List e() {
        byte b = this.a;
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override
    public final void f(l74 l74Var) {
        byte b = this.a;
        qia qiaVar = this.b;
        j74 j74Var = this.f;
        switch (b) {
            case 0:
                this.c = l74Var;
                if (((vd5) j74Var) == null) {
                    this.d = qiaVar;
                    qiaVar.f(l74Var);
                    return;
                }
                return;
            default:
                this.c = l74Var;
                if (((ku5) j74Var) == null) {
                    this.d = qiaVar;
                    qiaVar.f(l74Var);
                    return;
                }
                return;
        }
    }

    @Override
    public final void release() {
        byte b = this.a;
        j74 j74Var = this.f;
        switch (b) {
            case 0:
                vd5 vd5Var = (vd5) j74Var;
                if (vd5Var != null) {
                    vd5Var.release();
                    return;
                }
                return;
            default:
                ku5 ku5Var = (ku5) j74Var;
                if (ku5Var != null) {
                    ku5Var.release();
                    return;
                }
                return;
        }
    }
}
