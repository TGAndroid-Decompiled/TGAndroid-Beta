package org.telegram.messenger;
public final class jk implements Runnable {
    public final int f23679a;
    public final boolean[] f23680b;
    public final Runnable[] f23681c;

    public jk(boolean[] zArr, Runnable[] runnableArr, int i3) {
        this.f23679a = i3;
        this.f23680b = zArr;
        this.f23681c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f23679a) {
            case 0:
                this.f23680b[0] = true;
                Runnable runnable = this.f23681c[0];
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f23680b[0] = true;
                Runnable runnable2 = this.f23681c[0];
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
