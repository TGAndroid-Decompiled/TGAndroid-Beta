package defpackage;
public final class eub implements Runnable {
    public final byte a;
    public final pub b;
    public final long c;

    public eub(pub pubVar, long j, byte b) {
        this.a = b;
        this.b = pubVar;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.c;
        pub pubVar = this.b;
        switch (b) {
            case 0:
                pubVar.c.put(j, 0);
                pubVar.getNotificationCenter().k(322, Long.valueOf(j), Boolean.FALSE);
                return;
            default:
                pubVar.n(0, j, false);
                return;
        }
    }
}
