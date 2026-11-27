package defpackage;
public final class xbb implements r11 {
    public final float[] a = new float[2];
    public final ybb b;

    public xbb(ybb ybbVar) {
        this.b = ybbVar;
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
        ybb ybbVar = this.b;
        lcb lcbVar = ybbVar.s0;
        o68 w = lcbVar.w();
        if (w == null) {
            return 0;
        }
        t58 t58Var = w.M0;
        ybb ybbVar2 = lcbVar.s;
        float[] fArr = this.a;
        hl.p1(t58Var, ybbVar2, fArr);
        return (int) (ybbVar.getMeasuredHeight() - (fArr[1] + t58Var.getMeasuredHeight()));
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
