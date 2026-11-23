package org.telegram.messenger;
public final class hk implements Runnable {
    public final int f24560a;
    public final boolean[] f24561b;

    public hk(int i7, boolean[] zArr) {
        this.f24560a = i7;
        this.f24561b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f24560a) {
            case 0:
                this.f24561b[0] = true;
                return;
            default:
                this.f24561b[0] = true;
                return;
        }
    }
}
