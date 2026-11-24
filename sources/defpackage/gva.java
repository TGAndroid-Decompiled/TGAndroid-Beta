package defpackage;
public final class gva implements Runnable {
    public final byte a;
    public final hva b;
    public final long c;

    public gva(hva hvaVar, long j, byte b) {
        this.a = b;
        this.b = hvaVar;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hva hvaVar = this.b;
        switch (b) {
            case 0:
                hvaVar.q.b0(hvaVar.b, hvaVar.c, this.c, true, true, hvaVar.n);
                return;
            default:
                hvaVar.q.b0(hvaVar.b, hvaVar.c, this.c, true, true, hvaVar.n);
                return;
        }
    }
}
