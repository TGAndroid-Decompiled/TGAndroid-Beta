package defpackage;
public final class dta implements Runnable {
    public final byte a;
    public final eta b;
    public final long c;

    public dta(eta etaVar, long j, byte b) {
        this.a = b;
        this.b = etaVar;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        eta etaVar = this.b;
        switch (b) {
            case 0:
                etaVar.q.b0(etaVar.b, etaVar.c, this.c, true, true, etaVar.n);
                return;
            default:
                etaVar.q.b0(etaVar.b, etaVar.c, this.c, true, true, etaVar.n);
                return;
        }
    }
}
