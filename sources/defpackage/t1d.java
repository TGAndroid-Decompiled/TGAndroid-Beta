package defpackage;
public final class t1d implements nd0 {
    public final hy4 a;

    public t1d(hy4 hy4Var) {
        this.a = hy4Var;
    }

    @Override
    public final void a(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        o59 o59Var = this.a.y;
        o59Var.sendMessage(o59Var.obtainMessage(1, valueOf));
    }
}
