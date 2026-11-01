package org.telegram.messenger;
public final class wk implements Runnable {
    public final int f19064a;
    public final boolean[] f19065b;

    public wk(int i10, boolean[] zArr) {
        this.f19064a = i10;
        this.f19065b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19064a) {
            case 0:
                this.f19065b[0] = true;
                return;
            default:
                this.f19065b[0] = true;
                return;
        }
    }
}
