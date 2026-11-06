package org.telegram.messenger;
public final class lk implements Runnable {
    public final int f23893a;
    public final boolean[] f23894b;

    public lk(int i7, boolean[] zArr) {
        this.f23893a = i7;
        this.f23894b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f23893a) {
            case 0:
                this.f23894b[0] = true;
                return;
            default:
                this.f23894b[0] = true;
                return;
        }
    }
}
