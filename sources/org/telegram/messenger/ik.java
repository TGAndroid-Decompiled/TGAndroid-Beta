package org.telegram.messenger;
public final class ik implements Runnable {
    public final int f24409a;
    public final boolean[] f24410b;

    public ik(int i7, boolean[] zArr) {
        this.f24409a = i7;
        this.f24410b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f24409a) {
            case 0:
                this.f24410b[0] = true;
                return;
            default:
                this.f24410b[0] = true;
                return;
        }
    }
}
