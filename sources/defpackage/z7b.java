package defpackage;
public final class z7b implements i11 {
    public final float[] a = new float[2];
    public final a8b b;

    public z7b(a8b a8bVar) {
        this.b = a8bVar;
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
        a8b a8bVar = this.b;
        m8b m8bVar = a8bVar.y0;
        y28 w = m8bVar.w();
        if (w == null) {
            return 0;
        }
        d28 d28Var = w.S0;
        a8b a8bVar2 = m8bVar.s;
        float[] fArr = this.a;
        gl.p1(d28Var, a8bVar2, fArr);
        return (int) (a8bVar.getMeasuredHeight() - (fArr[1] + d28Var.getMeasuredHeight()));
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
    public final void c(m21 m21Var) {
    }

    @Override
    public final void g(m21 m21Var) {
    }
}
