package defpackage;
public final class l5b implements Runnable {
    public final byte a;
    public final t5b b;

    public l5b(t5b t5bVar, byte b) {
        this.a = b;
        this.b = t5bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        t5b t5bVar = this.b;
        switch (b) {
            case 0:
                y5b y5bVar = t5bVar.a0;
                m21.h(y5bVar.c);
                super/*fx0*/.dismiss();
                return;
            case 1:
                t5bVar.w.setLoading(false);
                y5b y5bVar2 = t5bVar.a0;
                y5bVar2.F0();
                y5bVar2.l1.E(0);
                return;
            case 2:
                t5bVar.V = false;
                return;
            case 3:
                y5b y5bVar3 = t5bVar.a0;
                y5bVar3.G1 = 6;
                y5bVar3.l1.E(1);
                return;
            case 4:
                t5bVar.n.g(2);
                t5bVar.f.forceLayout();
                t5bVar.k();
                return;
            default:
                int i = t5bVar.a;
                y5b y5bVar4 = t5bVar.a0;
                if (i == 0) {
                    y5bVar4.dismiss();
                    return;
                } else {
                    y5bVar4.onBackPressed();
                    return;
                }
        }
    }
}
