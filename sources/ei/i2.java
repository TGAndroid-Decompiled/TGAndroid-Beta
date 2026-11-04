package ei;
public final class i2 implements Runnable {
    public final int f10399a;
    public final Runnable f10400b;
    public final long f10401c;

    public i2(int i3, long j10, Runnable runnable) {
        this.f10399a = i3;
        this.f10400b = runnable;
        this.f10401c = j10;
    }

    @Override
    public final void run() {
        switch (this.f10399a) {
            case 0:
                Runnable runnable = this.f10400b;
                org.telegram.messenger.g0.r(runnable);
                org.telegram.messenger.g0.i3(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f10401c)));
                return;
            case 1:
                Runnable runnable2 = this.f10400b;
                org.telegram.messenger.g0.r(runnable2);
                org.telegram.messenger.g0.i3(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f10401c)));
                return;
            default:
                Runnable runnable3 = this.f10400b;
                org.telegram.messenger.g0.r(runnable3);
                org.telegram.messenger.g0.i3(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f10401c)));
                return;
        }
    }
}
