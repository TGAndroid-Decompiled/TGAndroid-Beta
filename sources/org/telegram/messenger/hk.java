package org.telegram.messenger;
public final class hk implements Runnable {
    public final int f24461a;
    public final boolean[] f24462b;

    public hk(int i7, boolean[] zArr) {
        this.f24461a = i7;
        this.f24462b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f24461a) {
            case 0:
                this.f24462b[0] = true;
                return;
            default:
                this.f24462b[0] = true;
                return;
        }
    }
}
