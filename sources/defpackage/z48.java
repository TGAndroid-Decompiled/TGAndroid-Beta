package defpackage;
public final class z48 implements Runnable {
    public final byte a;
    public final Runnable b;
    public final long c;

    public z48(Runnable runnable, long j, byte b) {
        this.a = b;
        this.b = runnable;
        this.c = j;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                Runnable runnable = this.b;
                hl.r(runnable);
                hl.d3(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.c)));
                return;
            case 1:
                Runnable runnable2 = this.b;
                hl.r(runnable2);
                hl.d3(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.c)));
                return;
            default:
                Runnable runnable3 = this.b;
                hl.r(runnable3);
                hl.d3(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.c)));
                return;
        }
    }
}
