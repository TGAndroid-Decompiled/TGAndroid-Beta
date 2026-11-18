package org.telegram.messenger;
public final class nk implements Runnable {
    public final int f25937a;
    public final boolean[] f25938b;
    public final Runnable[] f25939c;

    public nk(boolean[] zArr, Runnable[] runnableArr, int i7) {
        this.f25937a = i7;
        this.f25938b = zArr;
        this.f25939c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f25937a) {
            case 0:
                this.f25938b[0] = true;
                Runnable runnable = this.f25939c[0];
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f25938b[0] = true;
                Runnable runnable2 = this.f25939c[0];
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
