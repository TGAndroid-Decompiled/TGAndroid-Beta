package defpackage;
public final class vd0 implements rb1 {
    public final ud0[] a;

    public vd0(ud0[] ud0VarArr) {
        this.a = ud0VarArr;
    }

    @Override
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (ud0 ud0Var : this.a) {
            xp3 xp3Var = ud0Var.f;
            if (xp3Var != null) {
                xp3Var.dispose();
            } else {
                rr5.e("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
