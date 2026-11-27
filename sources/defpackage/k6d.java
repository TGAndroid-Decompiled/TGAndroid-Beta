package defpackage;
public final class k6d implements pd0 {
    public final n05 a;

    public k6d(n05 n05Var) {
        this.a = n05Var;
    }

    @Override
    public final void a(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        b99 b99Var = this.a.y;
        b99Var.sendMessage(b99Var.obtainMessage(1, valueOf));
    }
}
