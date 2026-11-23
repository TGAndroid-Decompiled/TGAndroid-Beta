package jg;
public final class a2 implements Runnable {
    public final c2 f17430a;

    public a2(c2 c2Var) {
        this.f17430a = c2Var;
    }

    public final void a() {
        c2 c2Var = this.f17430a;
        if (c2Var.R) {
            return;
        }
        c2Var.R = true;
        c2Var.J.clear();
        c2Var.K.clear();
        c2Var.G.clear();
        c2Var.F.clear();
        c2Var.H.clear();
        c2Var.I.clear();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: jg.a2.run():void");
    }
}
