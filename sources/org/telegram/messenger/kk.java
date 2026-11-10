package org.telegram.messenger;
public final class kk implements Runnable {
    public final int f23710a;
    public final boolean[] f23711b;

    public kk(int i7, boolean[] zArr) {
        this.f23710a = i7;
        this.f23711b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f23710a) {
            case 0:
                this.f23711b[0] = true;
                return;
            default:
                this.f23711b[0] = true;
                return;
        }
    }
}
