package defpackage;
public final class w27 implements Runnable {
    public final byte a;
    public final f37 b;

    public w27(f37 f37Var, byte b) {
        this.a = b;
        this.b = f37Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        f37 f37Var = this.b;
        switch (b) {
            case 0:
                boolean z = f37Var.d0.d.r;
                fu fuVar = f37Var.f;
                if (z) {
                    fuVar.y0(-fuVar.computeVerticalScrollOffset(), 250, la2.V);
                    return;
                }
                fuVar.y0(fuVar.computeVerticalScrollRange() - (fuVar.computeVerticalScrollExtent() + fuVar.computeVerticalScrollOffset()), 250, la2.V);
                return;
            default:
                f37Var.g(true, false);
                return;
        }
    }
}
