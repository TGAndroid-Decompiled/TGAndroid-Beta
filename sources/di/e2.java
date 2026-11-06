package di;
public final class e2 implements Runnable {
    public final int f8955a;
    public final Runnable f8956b;
    public final long f8957c;

    public e2(int i7, long j3, Runnable runnable) {
        this.f8955a = i7;
        this.f8956b = runnable;
        this.f8957c = j3;
    }

    @Override
    public final void run() {
        switch (this.f8955a) {
            case 0:
                Runnable runnable = this.f8956b;
                org.telegram.messenger.g0.r(runnable);
                org.telegram.messenger.g0.i3(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f8957c)));
                return;
            case 1:
                Runnable runnable2 = this.f8956b;
                org.telegram.messenger.g0.r(runnable2);
                org.telegram.messenger.g0.i3(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f8957c)));
                return;
            default:
                Runnable runnable3 = this.f8956b;
                org.telegram.messenger.g0.r(runnable3);
                org.telegram.messenger.g0.i3(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f8957c)));
                return;
        }
    }
}
