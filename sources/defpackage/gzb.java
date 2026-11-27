package defpackage;
public final class gzb extends zb3 {
    public Runnable F;
    public int G;
    public final tzb H;

    public gzb(tzb tzbVar) {
        this.H = tzbVar;
    }

    @Override
    public final void F() {
        if (this.G == -1) {
            this.G = this.H.getNotificationCenter().p(null, this.G, false);
            Runnable runnable = this.F;
            if (runnable != null) {
                hl.r(runnable);
                this.F = null;
            }
        }
    }

    @Override
    public final void N() {
        Runnable runnable = this.F;
        if (runnable != null) {
            hl.r(runnable);
            this.F = null;
        }
        fzb fzbVar = new fzb(this, (byte) 0);
        this.F = fzbVar;
        hl.c3(fzbVar);
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            hl.r(runnable);
        }
        fzb fzbVar = new fzb(this, (byte) 1);
        this.F = fzbVar;
        hl.c3(fzbVar);
    }

    @Override
    public final void z(f89 f89Var) {
        tzb tzbVar = this.H;
        qzb qzbVar = tzbVar.d1;
        if (qzbVar == f89Var.a) {
            qzbVar.setTranslationX(0.0f);
            wyb wybVar = tzbVar.P;
            if (wybVar != null) {
                wybVar.G.clear();
            }
            qzb qzbVar2 = tzbVar.d1;
            if (ik8.A(qzbVar2)) {
                qzbVar2.setTopicIcon(qzbVar2.d5);
            }
            tzbVar.d1 = null;
        }
    }
}
