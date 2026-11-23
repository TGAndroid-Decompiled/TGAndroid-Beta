package org.telegram.messenger;
public final class ik implements Runnable {
    public final int f24742a;
    public final boolean[] f24743b;

    public ik(int i7, boolean[] zArr) {
        this.f24742a = i7;
        this.f24743b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f24742a) {
            case 0:
                this.f24743b[0] = true;
                return;
            default:
                this.f24743b[0] = true;
                return;
        }
    }
}
