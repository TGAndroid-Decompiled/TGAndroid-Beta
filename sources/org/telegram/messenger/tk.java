package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f25633a;
    public final boolean[] f25634b;
    public final Runnable[] f25635c;

    public tk(boolean[] zArr, Runnable[] runnableArr, int i7) {
        this.f25633a = i7;
        this.f25634b = zArr;
        this.f25635c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f25633a) {
            case 0:
                this.f25634b[0] = true;
                Runnable runnable = this.f25635c[0];
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f25634b[0] = true;
                Runnable runnable2 = this.f25635c[0];
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
