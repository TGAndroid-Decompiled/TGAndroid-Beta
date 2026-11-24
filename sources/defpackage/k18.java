package defpackage;
public final class k18 implements Runnable {
    public final byte a;
    public final Runnable b;
    public final long c;

    public k18(Runnable runnable, long j, byte b) {
        this.a = b;
        this.b = runnable;
        this.c = j;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                Runnable runnable = this.b;
                gl.r(runnable);
                gl.d3(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.c)));
                return;
            case 1:
                Runnable runnable2 = this.b;
                gl.r(runnable2);
                gl.d3(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.c)));
                return;
            default:
                Runnable runnable3 = this.b;
                gl.r(runnable3);
                gl.d3(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.c)));
                return;
        }
    }
}
