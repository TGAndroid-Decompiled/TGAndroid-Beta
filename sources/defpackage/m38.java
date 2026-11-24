package defpackage;
public final class m38 implements Runnable {
    public final byte a;
    public final Runnable b;
    public final long c;

    public m38(Runnable runnable, long j, byte b) {
        this.a = b;
        this.b = runnable;
        this.c = j;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                Runnable runnable = this.b;
                gm.r(runnable);
                gm.d3(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.c)));
                return;
            case 1:
                Runnable runnable2 = this.b;
                gm.r(runnable2);
                gm.d3(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.c)));
                return;
            default:
                Runnable runnable3 = this.b;
                gm.r(runnable3);
                gm.d3(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.c)));
                return;
        }
    }
}
