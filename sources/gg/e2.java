package gg;
public final class e2 implements Runnable {
    public final g2 f9723a;

    public e2(g2 g2Var) {
        this.f9723a = g2Var;
    }

    public final void a() {
        g2 g2Var = this.f9723a;
        if (g2Var.Q) {
            return;
        }
        g2Var.Q = true;
        g2Var.I.clear();
        g2Var.J.clear();
        g2Var.F.clear();
        g2Var.E.clear();
        g2Var.G.clear();
        g2Var.H.clear();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: gg.e2.run():void");
    }
}
