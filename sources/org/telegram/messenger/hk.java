package org.telegram.messenger;
public final class hk implements Runnable {
    public final int f24489a;
    public final boolean[] f24490b;

    public hk(int i7, boolean[] zArr) {
        this.f24489a = i7;
        this.f24490b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f24489a) {
            case 0:
                this.f24490b[0] = true;
                return;
            default:
                this.f24490b[0] = true;
                return;
        }
    }
}
