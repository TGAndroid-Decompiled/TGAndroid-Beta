package defpackage;
public final class lg implements Runnable {
    public final byte a;
    public final qac b;
    public final long c;

    public lg(qac qacVar, long j, byte b) {
        this.a = b;
        this.b = qacVar;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.c;
        qac qacVar = this.b;
        switch (b) {
            case 0:
                qacVar.a(Long.valueOf(j));
                return;
            default:
                qacVar.a(Long.valueOf(j));
                return;
        }
    }
}
