package defpackage;
public final class cta implements Runnable {
    public final byte a;
    public final eta b;

    public cta(eta etaVar, byte b) {
        this.a = b;
        this.b = etaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        eta etaVar = this.b;
        switch (b) {
            case 0:
                etaVar.b();
                return;
            case 1:
                etaVar.a();
                return;
            default:
                m21 m21Var = etaVar.d;
                gta gtaVar = etaVar.q;
                cta ctaVar = etaVar.p;
                k27 k27Var = etaVar.b;
                if (!etaVar.l) {
                    etaVar.l = true;
                    k27Var.f((int) etaVar.k, etaVar.c(), true);
                    long j = gtaVar.g;
                    int i = gtaVar.a;
                    gtaVar.g = j + etaVar.k;
                    kk7.f(i).k(223, new Object[0]);
                    etaVar.k = 0L;
                    kk7.f(i).k(103, Long.valueOf(k27.B0(k27Var.k)), Integer.valueOf(k27Var.e1()), k27Var.k.reactions);
                }
                if (!etaVar.m) {
                    etaVar.m = true;
                    etaVar.f.b = 5000L;
                    gl.r(ctaVar);
                    gl.e3(ctaVar, 5000L);
                    m21Var.k(true);
                    m21Var.v = ctaVar;
                }
                etaVar.e.b.setText(etaVar.d());
                return;
        }
    }
}
