package org.telegram.messenger;
public final class al implements Runnable {
    public final int f14627a;
    public final boolean[] f14628b;
    public final Runnable[] f14629c;

    public al(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f14627a = i10;
        this.f14628b = zArr;
        this.f14629c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f14627a) {
            case 0:
                this.f14628b[0] = true;
                Runnable runnable = this.f14629c[0];
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f14628b[0] = true;
                Runnable runnable2 = this.f14629c[0];
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
