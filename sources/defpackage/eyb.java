package defpackage;
public final class eyb implements Runnable {
    public final byte a;
    public final qyb b;
    public final long c;

    public eyb(qyb qybVar, long j, byte b) {
        this.a = b;
        this.b = qybVar;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.c;
        qyb qybVar = this.b;
        switch (b) {
            case 0:
                qybVar.c.put(j, 0);
                qybVar.getNotificationCenter().k(323, Long.valueOf(j), Boolean.FALSE);
                return;
            default:
                qybVar.n(0, j, false);
                return;
        }
    }
}
