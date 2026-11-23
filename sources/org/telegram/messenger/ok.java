package org.telegram.messenger;
public final class ok implements Runnable {
    public final int f26134a;
    public final boolean[] f26135b;
    public final Runnable[] f26136c;

    public ok(boolean[] zArr, Runnable[] runnableArr, int i7) {
        this.f26134a = i7;
        this.f26135b = zArr;
        this.f26136c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f26134a) {
            case 0:
                this.f26135b[0] = true;
                Runnable runnable = this.f26136c[0];
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f26135b[0] = true;
                Runnable runnable2 = this.f26136c[0];
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
