package org.telegram.messenger;
public final class kk implements Runnable {
    public final int f23706a;
    public final boolean[] f23707b;

    public kk(int i7, boolean[] zArr) {
        this.f23706a = i7;
        this.f23707b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f23706a) {
            case 0:
                this.f23707b[0] = true;
                return;
            default:
                this.f23707b[0] = true;
                return;
        }
    }
}
