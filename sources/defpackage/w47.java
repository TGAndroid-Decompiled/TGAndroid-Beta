package defpackage;
public final class w47 implements Runnable {
    public final byte a;
    public final f57 b;

    public w47(f57 f57Var, byte b) {
        this.a = b;
        this.b = f57Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        f57 f57Var = this.b;
        switch (b) {
            case 0:
                boolean z = f57Var.d0.d.r;
                fv fvVar = f57Var.f;
                if (z) {
                    fvVar.y0(-fvVar.computeVerticalScrollOffset(), 250, wb2.V);
                    return;
                }
                fvVar.y0(fvVar.computeVerticalScrollRange() - (fvVar.computeVerticalScrollExtent() + fvVar.computeVerticalScrollOffset()), 250, wb2.V);
                return;
            default:
                f57Var.g(true, false);
                return;
        }
    }
}
