package fi;
public final class y1 implements Runnable {
    public final int f12770a;
    public final Runnable f12771b;
    public final long f12772c;

    public y1(int i7, long j3, Runnable runnable) {
        this.f12770a = i7;
        this.f12771b = runnable;
        this.f12772c = j3;
    }

    @Override
    public final void run() {
        switch (this.f12770a) {
            case 0:
                Runnable runnable = this.f12771b;
                org.telegram.messenger.g0.r(runnable);
                org.telegram.messenger.g0.h3(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f12772c)));
                return;
            case 1:
                Runnable runnable2 = this.f12771b;
                org.telegram.messenger.g0.r(runnable2);
                org.telegram.messenger.g0.h3(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f12772c)));
                return;
            default:
                Runnable runnable3 = this.f12771b;
                org.telegram.messenger.g0.r(runnable3);
                org.telegram.messenger.g0.h3(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f12772c)));
                return;
        }
    }
}
