package fi;
public final class a2 implements Runnable {
    public final int f11402a;
    public final Runnable f11403b;
    public final long f11404c;

    public a2(int i7, long j3, Runnable runnable) {
        this.f11402a = i7;
        this.f11403b = runnable;
        this.f11404c = j3;
    }

    @Override
    public final void run() {
        switch (this.f11402a) {
            case 0:
                Runnable runnable = this.f11403b;
                org.telegram.messenger.g0.r(runnable);
                org.telegram.messenger.g0.i3(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f11404c)));
                return;
            case 1:
                Runnable runnable2 = this.f11403b;
                org.telegram.messenger.g0.r(runnable2);
                org.telegram.messenger.g0.i3(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f11404c)));
                return;
            default:
                Runnable runnable3 = this.f11403b;
                org.telegram.messenger.g0.r(runnable3);
                org.telegram.messenger.g0.i3(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f11404c)));
                return;
        }
    }
}
