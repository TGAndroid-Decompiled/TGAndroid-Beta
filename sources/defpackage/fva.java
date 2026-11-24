package defpackage;
public final class fva implements Runnable {
    public final byte a;
    public final hva b;

    public fva(hva hvaVar, byte b) {
        this.a = b;
        this.b = hvaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hva hvaVar = this.b;
        switch (b) {
            case 0:
                hvaVar.b();
                return;
            case 1:
                hvaVar.a();
                return;
            default:
                u31 u31Var = hvaVar.d;
                jva jvaVar = hvaVar.q;
                fva fvaVar = hvaVar.p;
                k47 k47Var = hvaVar.b;
                if (!hvaVar.l) {
                    hvaVar.l = true;
                    k47Var.f((int) hvaVar.k, hvaVar.c(), true);
                    long j = jvaVar.g;
                    int i = jvaVar.a;
                    jvaVar.g = j + hvaVar.k;
                    nm7.f(i).k(224, new Object[0]);
                    hvaVar.k = 0L;
                    nm7.f(i).k(104, Long.valueOf(k47.B0(k47Var.k)), Integer.valueOf(k47Var.e1()), k47Var.k.reactions);
                }
                if (!hvaVar.m) {
                    hvaVar.m = true;
                    hvaVar.f.b = 5000L;
                    gm.r(fvaVar);
                    gm.d3(fvaVar, 5000L);
                    u31Var.k(true);
                    u31Var.w = fvaVar;
                }
                hvaVar.e.b.setText(hvaVar.d());
                return;
        }
    }
}
