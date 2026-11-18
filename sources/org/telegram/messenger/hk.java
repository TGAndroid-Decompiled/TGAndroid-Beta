package org.telegram.messenger;
public final class hk implements Runnable {
    public final int f24464a;
    public final boolean[] f24465b;

    public hk(int i7, boolean[] zArr) {
        this.f24464a = i7;
        this.f24465b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f24464a) {
            case 0:
                this.f24465b[0] = true;
                return;
            default:
                this.f24465b[0] = true;
                return;
        }
    }
}
