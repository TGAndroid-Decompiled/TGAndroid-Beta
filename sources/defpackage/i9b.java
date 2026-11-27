package defpackage;
public final class i9b implements Runnable {
    public final byte a;
    public final r9b b;

    public i9b(r9b r9bVar, byte b) {
        this.a = b;
        this.b = r9bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        r9b r9bVar = this.b;
        switch (b) {
            case 0:
                r9bVar.V = false;
                return;
            case 1:
                w9b w9bVar = r9bVar.a0;
                v21.h(w9bVar.c);
                super/*nx0*/.dismiss();
                return;
            case 2:
                r9bVar.w.setLoading(false);
                w9b w9bVar2 = r9bVar.a0;
                w9bVar2.G0();
                w9bVar2.l1.F(0);
                return;
            case 3:
                w9b w9bVar3 = r9bVar.a0;
                w9bVar3.G1 = 6;
                w9bVar3.l1.F(1);
                return;
            case 4:
                r9bVar.n.g(2);
                r9bVar.f.forceLayout();
                r9bVar.k();
                return;
            default:
                int i = r9bVar.a;
                w9b w9bVar4 = r9bVar.a0;
                if (i == 0) {
                    w9bVar4.dismiss();
                    return;
                } else {
                    w9bVar4.onBackPressed();
                    return;
                }
        }
    }
}
