package defpackage;
public final class k95 implements s84 {
    public final t84 a;
    public final t84 b;
    public final fm0 c;
    public final fm0 d;
    public final kmc e;
    public final rj4 f;
    public boolean h;

    public k95(kmc kmcVar, rj4 rj4Var) {
        k43 k43Var = k43.h;
        this.a = new t84(1, this, k43Var, 350L);
        this.b = new t84(2, this, k43Var, 350L);
        this.c = new fm0(0, this, k43Var, 350L, true);
        this.d = new fm0(3, this, k43Var, 350L, true);
        this.h = true;
        this.e = kmcVar;
        this.f = rj4Var;
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        int i2;
        kmc kmcVar = this.e;
        if (i == 1) {
            kmcVar.setTranslationX(this.a.f);
        }
        if (i == 2) {
            kmcVar.setTranslationY(this.b.f);
        }
        fm0 fm0Var = this.d;
        fm0 fm0Var2 = this.c;
        if (i == 0) {
            kmcVar.setAlpha(hl.R1(0.5f, 1.0f, fm0Var.e) * fm0Var2.e);
            kmcVar.setScaleX(hl.R1(0.3f, 1.0f, f));
            kmcVar.setScaleY(hl.R1(0.3f, 1.0f, f));
            if (f > 0.0f) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            kmcVar.setVisibility(i2);
        }
        if (i == 3) {
            kmcVar.setAlpha(hl.R1(0.5f, 1.0f, fm0Var.e) * fm0Var2.e);
        }
        rj4 rj4Var = this.f;
        if (rj4Var != null) {
            rj4Var.run();
        }
    }

    @Override
    public final void v0(float f, int i) {
    }
}
