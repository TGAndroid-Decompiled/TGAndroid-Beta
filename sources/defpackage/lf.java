package defpackage;
public final class lf implements Runnable {
    public final byte a;
    public final p8c b;
    public final long c;

    public lf(p8c p8cVar, long j, byte b) {
        this.a = b;
        this.b = p8cVar;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.c;
        p8c p8cVar = this.b;
        switch (b) {
            case 0:
                p8cVar.a(Long.valueOf(j));
                return;
            default:
                p8cVar.a(Long.valueOf(j));
                return;
        }
    }
}
