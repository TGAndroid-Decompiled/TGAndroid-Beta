package defpackage;
public final class bab implements q21 {
    public final float[] a = new float[2];
    public final cab b;

    public bab(cab cabVar) {
        this.b = cabVar;
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final int e(int i) {
        cab cabVar = this.b;
        oab oabVar = cabVar.y0;
        a58 w = oabVar.w();
        if (w == null) {
            return 0;
        }
        g48 g48Var = w.S0;
        cab cabVar2 = oabVar.s;
        float[] fArr = this.a;
        gm.p1(g48Var, cabVar2, fArr);
        return (int) (cabVar.getMeasuredHeight() - (fArr[1] + g48Var.getMeasuredHeight()));
    }

    @Override
    public final boolean f(int i) {
        return false;
    }

    @Override
    public final int h(int i) {
        return 0;
    }

    @Override
    public final void b(float f) {
    }

    @Override
    public final void c(u31 u31Var) {
    }

    @Override
    public final void g(u31 u31Var) {
    }
}
