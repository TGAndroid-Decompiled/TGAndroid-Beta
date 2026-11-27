package defpackage;
public final class ybb implements r11 {
    public final float[] a = new float[2];
    public final zbb b;

    public ybb(zbb zbbVar) {
        this.b = zbbVar;
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
        zbb zbbVar = this.b;
        lcb lcbVar = zbbVar.s0;
        o68 w = lcbVar.w();
        if (w == null) {
            return 0;
        }
        u58 u58Var = w.M0;
        zbb zbbVar2 = lcbVar.s;
        float[] fArr = this.a;
        hl.p1(u58Var, zbbVar2, fArr);
        return (int) (zbbVar.getMeasuredHeight() - (fArr[1] + u58Var.getMeasuredHeight()));
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
    public final void c(v21 v21Var) {
    }

    @Override
    public final void g(v21 v21Var) {
    }
}
