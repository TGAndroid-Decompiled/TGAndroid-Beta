package defpackage;
public final class fxa implements Runnable {
    public final byte a;
    public final hxa b;

    public fxa(hxa hxaVar, byte b) {
        this.a = b;
        this.b = hxaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hxa hxaVar = this.b;
        switch (b) {
            case 0:
                hxaVar.b();
                return;
            case 1:
                hxaVar.a();
                return;
            default:
                v21 v21Var = hxaVar.d;
                jxa jxaVar = hxaVar.q;
                fxa fxaVar = hxaVar.p;
                r47 r47Var = hxaVar.b;
                if (!hxaVar.l) {
                    hxaVar.l = true;
                    r47Var.f((int) hxaVar.k, hxaVar.c(), true);
                    long j = jxaVar.g;
                    int i = jxaVar.a;
                    jxaVar.g = j + hxaVar.k;
                    jn7.f(i).k(224, new Object[0]);
                    hxaVar.k = 0L;
                    jn7.f(i).k(104, Long.valueOf(r47.B0(r47Var.k)), Integer.valueOf(r47Var.e1()), r47Var.k.reactions);
                }
                if (!hxaVar.m) {
                    hxaVar.m = true;
                    hxaVar.f.b = 5000L;
                    hl.r(fxaVar);
                    hl.d3(fxaVar, 5000L);
                    v21Var.k(true);
                    v21Var.w = fxaVar;
                }
                hxaVar.e.b.setText(hxaVar.d());
                return;
        }
    }
}
