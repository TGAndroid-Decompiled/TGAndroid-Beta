package org.telegram.messenger;
public final class ik implements Runnable {
    public final int f24706a;
    public final boolean[] f24707b;

    public ik(int i7, boolean[] zArr) {
        this.f24706a = i7;
        this.f24707b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f24706a) {
            case 0:
                this.f24707b[0] = true;
                return;
            default:
                this.f24707b[0] = true;
                return;
        }
    }
}
