package org.telegram.messenger;
public final class ok implements Runnable {
    public final int f26098a;
    public final boolean[] f26099b;
    public final Runnable[] f26100c;

    public ok(boolean[] zArr, Runnable[] runnableArr, int i7) {
        this.f26098a = i7;
        this.f26099b = zArr;
        this.f26100c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f26098a) {
            case 0:
                this.f26099b[0] = true;
                Runnable runnable = this.f26100c[0];
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f26099b[0] = true;
                Runnable runnable2 = this.f26100c[0];
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
