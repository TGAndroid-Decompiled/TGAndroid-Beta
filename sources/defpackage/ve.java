package defpackage;
public final class ve implements Runnable {
    public final byte a;
    public final pcc b;
    public final long c;

    public ve(pcc pccVar, long j, byte b) {
        this.a = b;
        this.b = pccVar;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.c;
        pcc pccVar = this.b;
        switch (b) {
            case 0:
                pccVar.a(Long.valueOf(j));
                return;
            default:
                pccVar.a(Long.valueOf(j));
                return;
        }
    }
}
