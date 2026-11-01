package org.telegram.messenger;
public final class bl implements Runnable {
    public final int f14982a;
    public final boolean[] f14983b;
    public final Runnable[] f14984c;

    public bl(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f14982a = i10;
        this.f14983b = zArr;
        this.f14984c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f14982a) {
            case 0:
                this.f14983b[0] = true;
                Runnable runnable = this.f14984c[0];
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f14983b[0] = true;
                Runnable runnable2 = this.f14984c[0];
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
