package di;
public final class e2 implements Runnable {
    public final int f8948a;
    public final Runnable f8949b;
    public final long f8950c;

    public e2(int i7, long j3, Runnable runnable) {
        this.f8948a = i7;
        this.f8949b = runnable;
        this.f8950c = j3;
    }

    @Override
    public final void run() {
        switch (this.f8948a) {
            case 0:
                Runnable runnable = this.f8949b;
                org.telegram.messenger.g0.r(runnable);
                org.telegram.messenger.g0.i3(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f8950c)));
                return;
            case 1:
                Runnable runnable2 = this.f8949b;
                org.telegram.messenger.g0.r(runnable2);
                org.telegram.messenger.g0.i3(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f8950c)));
                return;
            default:
                Runnable runnable3 = this.f8949b;
                org.telegram.messenger.g0.r(runnable3);
                org.telegram.messenger.g0.i3(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f8950c)));
                return;
        }
    }
}
