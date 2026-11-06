package org.telegram.messenger;
public final class lk implements Runnable {
    public final int f23900a;
    public final boolean[] f23901b;

    public lk(int i7, boolean[] zArr) {
        this.f23900a = i7;
        this.f23901b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f23900a) {
            case 0:
                this.f23901b[0] = true;
                return;
            default:
                this.f23901b[0] = true;
                return;
        }
    }
}
