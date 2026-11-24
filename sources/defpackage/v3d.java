package defpackage;
public final class v3d implements ne0 {
    public final i05 a;

    public v3d(i05 i05Var) {
        this.a = i05Var;
    }

    @Override
    public final void a(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        q79 q79Var = this.a.y;
        q79Var.sendMessage(q79Var.obtainMessage(1, valueOf));
    }
}
