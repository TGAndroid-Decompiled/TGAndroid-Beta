package defpackage;
public final class lab implements Runnable {
    public final byte a;
    public final sbb b;
    public final boolean c;

    public lab(sbb sbbVar, boolean z, byte b) {
        this.a = b;
        this.b = sbbVar;
        this.c = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        sbb sbbVar = this.b;
        switch (b) {
            case 0:
                sbbVar.c(z);
                return;
            case 1:
                if (!z) {
                    sbbVar.K0.b(false, false);
                    return;
                }
                return;
            default:
                sbbVar.S = null;
                sbbVar.e = false;
                sbbVar.o(z);
                return;
        }
    }
}
