package org.telegram.messenger;
public final class bk implements Runnable {
    public final int f21847a;
    public final boolean[] f21848b;

    public bk(int i3, boolean[] zArr) {
        this.f21847a = i3;
        this.f21848b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f21847a) {
            case 0:
                this.f21848b[0] = true;
                return;
            default:
                this.f21848b[0] = true;
                return;
        }
    }
}
