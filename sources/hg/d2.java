package hg;
public final class d2 implements Runnable {
    public final f2 f11020a;

    public d2(f2 f2Var) {
        this.f11020a = f2Var;
    }

    public final void a() {
        f2 f2Var = this.f11020a;
        if (f2Var.Q) {
            return;
        }
        f2Var.Q = true;
        f2Var.I.clear();
        f2Var.J.clear();
        f2Var.F.clear();
        f2Var.E.clear();
        f2Var.G.clear();
        f2Var.H.clear();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hg.d2.run():void");
    }
}
