package defpackage;
public final class d57 implements Runnable {
    public final byte a;
    public final m57 b;

    public d57(m57 m57Var, byte b) {
        this.a = b;
        this.b = m57Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        m57 m57Var = this.b;
        switch (b) {
            case 0:
                boolean z = m57Var.d0.d.r;
                gu guVar = m57Var.f;
                if (z) {
                    guVar.z0(-guVar.computeVerticalScrollOffset(), 250, bb2.V);
                    return;
                }
                guVar.z0(guVar.computeVerticalScrollRange() - (guVar.computeVerticalScrollExtent() + guVar.computeVerticalScrollOffset()), 250, bb2.V);
                return;
            default:
                m57Var.g(true, false);
                return;
        }
    }
}
