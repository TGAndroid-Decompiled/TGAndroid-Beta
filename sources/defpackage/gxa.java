package defpackage;
public final class gxa implements Runnable {
    public final byte a;
    public final hxa b;
    public final long c;

    public gxa(hxa hxaVar, long j, byte b) {
        this.a = b;
        this.b = hxaVar;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hxa hxaVar = this.b;
        switch (b) {
            case 0:
                hxaVar.q.c0(hxaVar.b, hxaVar.c, this.c, true, true, hxaVar.n);
                return;
            default:
                hxaVar.q.c0(hxaVar.b, hxaVar.c, this.c, true, true, hxaVar.n);
                return;
        }
    }
}
