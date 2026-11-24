package defpackage;
public final class h95 implements g94 {
    public final h94 a;
    public final h94 b;
    public final fn0 c;
    public final fn0 d;
    public final dkc e;
    public final qn4 f;
    public boolean h;

    public h95(dkc dkcVar, qn4 qn4Var) {
        d53 d53Var = d53.h;
        this.a = new h94(1, this, d53Var, 350L);
        this.b = new h94(2, this, d53Var, 350L);
        this.c = new fn0(0, this, d53Var, 350L, true);
        this.d = new fn0(3, this, d53Var, 350L, true);
        this.h = true;
        this.e = dkcVar;
        this.f = qn4Var;
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        int i2;
        dkc dkcVar = this.e;
        if (i == 1) {
            dkcVar.setTranslationX(this.a.f);
        }
        if (i == 2) {
            dkcVar.setTranslationY(this.b.f);
        }
        fn0 fn0Var = this.d;
        fn0 fn0Var2 = this.c;
        if (i == 0) {
            dkcVar.setAlpha(gm.R1(0.5f, 1.0f, fn0Var.e) * fn0Var2.e);
            dkcVar.setScaleX(gm.R1(0.3f, 1.0f, f));
            dkcVar.setScaleY(gm.R1(0.3f, 1.0f, f));
            if (f > 0.0f) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            dkcVar.setVisibility(i2);
        }
        if (i == 3) {
            dkcVar.setAlpha(gm.R1(0.5f, 1.0f, fn0Var.e) * fn0Var2.e);
        }
        qn4 qn4Var = this.f;
        if (qn4Var != null) {
            qn4Var.run();
        }
    }

    @Override
    public final void V(float f, int i) {
    }
}
