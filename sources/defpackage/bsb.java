package defpackage;
public final class bsb implements Runnable {
    public final byte a;
    public final ksb b;

    public bsb(ksb ksbVar, byte b) {
        this.a = b;
        this.b = ksbVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ksb ksbVar = this.b;
        switch (b) {
            case 0:
                isb isbVar = ksbVar.N;
                if (isbVar != null) {
                    long j = isbVar.a;
                    if (j > 0) {
                        ksbVar.I = j;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                esb esbVar = ksbVar.a;
                if (esbVar != null) {
                    esbVar.S1();
                    return;
                }
                return;
            default:
                esb esbVar2 = ksbVar.a;
                if (esbVar2 != null) {
                    esbVar2.V();
                    return;
                }
                return;
        }
    }
}
