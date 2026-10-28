package ig;
public final class b2 implements Runnable {
    public final d2 f14007a;

    public b2(d2 d2Var) {
        this.f14007a = d2Var;
    }

    public final void a() {
        d2 d2Var = this.f14007a;
        if (d2Var.Q) {
            return;
        }
        d2Var.Q = true;
        d2Var.I.clear();
        d2Var.J.clear();
        d2Var.F.clear();
        d2Var.E.clear();
        d2Var.G.clear();
        d2Var.H.clear();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ig.b2.run():void");
    }
}
