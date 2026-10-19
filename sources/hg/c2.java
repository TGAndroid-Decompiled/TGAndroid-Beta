package hg;
public final class c2 implements Runnable {
    public final e2 f11827a;

    public c2(e2 e2Var) {
        this.f11827a = e2Var;
    }

    public final void a() {
        e2 e2Var = this.f11827a;
        if (e2Var.Q) {
            return;
        }
        e2Var.Q = true;
        e2Var.I.clear();
        e2Var.J.clear();
        e2Var.F.clear();
        e2Var.E.clear();
        e2Var.G.clear();
        e2Var.H.clear();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hg.c2.run():void");
    }
}
