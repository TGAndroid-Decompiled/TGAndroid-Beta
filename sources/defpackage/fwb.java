package defpackage;
public final class fwb implements Runnable {
    public final byte a;
    public final qwb b;
    public final long c;

    public fwb(qwb qwbVar, long j, byte b) {
        this.a = b;
        this.b = qwbVar;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.c;
        qwb qwbVar = this.b;
        switch (b) {
            case 0:
                qwbVar.c.put(j, 0);
                qwbVar.getNotificationCenter().k(324, Long.valueOf(j), Boolean.FALSE);
                return;
            default:
                qwbVar.n(0, j, false);
                return;
        }
    }
}
