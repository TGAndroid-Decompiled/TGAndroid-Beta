package defpackage;
public final class i75 implements x74 {
    public final y74 a;
    public final y74 b;
    public final fm0 c;
    public final fm0 d;
    public final dic e;
    public final iu4 f;
    public boolean h;

    public i75(dic dicVar, iu4 iu4Var) {
        s33 s33Var = s33.h;
        this.a = new y74(1, this, s33Var, 350L);
        this.b = new y74(2, this, s33Var, 350L);
        this.c = new fm0(0, this, s33Var, 350L, true);
        this.d = new fm0(3, this, s33Var, 350L, true);
        this.h = true;
        this.e = dicVar;
        this.f = iu4Var;
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        int i2;
        dic dicVar = this.e;
        if (i == 1) {
            dicVar.setTranslationX(this.a.f);
        }
        if (i == 2) {
            dicVar.setTranslationY(this.b.f);
        }
        fm0 fm0Var = this.d;
        fm0 fm0Var2 = this.c;
        if (i == 0) {
            dicVar.setAlpha(gl.R1(0.5f, 1.0f, fm0Var.e) * fm0Var2.e);
            dicVar.setScaleX(gl.R1(0.3f, 1.0f, f));
            dicVar.setScaleY(gl.R1(0.3f, 1.0f, f));
            if (f > 0.0f) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            dicVar.setVisibility(i2);
        }
        if (i == 3) {
            dicVar.setAlpha(gl.R1(0.5f, 1.0f, fm0Var.e) * fm0Var2.e);
        }
        iu4 iu4Var = this.f;
        if (iu4Var != null) {
            iu4Var.run();
        }
    }

    @Override
    public final void D(float f, int i) {
    }
}
