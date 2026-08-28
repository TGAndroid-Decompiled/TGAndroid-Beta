package org.telegram.messenger;
public final class o2 implements Runnable {
    public final int f21105a;
    public final FileLoadOperation f21106b;

    public o2(FileLoadOperation fileLoadOperation, int i9) {
        this.f21105a = i9;
        this.f21106b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f21105a) {
            case 0:
                FileLoadOperation.w(this.f21106b);
                return;
            case 1:
                FileLoadOperation.a(this.f21106b);
                return;
            case 2:
                FileLoadOperation.k(this.f21106b);
                return;
            case 3:
                FileLoadOperation.m(this.f21106b);
                return;
            case 4:
                FileLoadOperation.q(this.f21106b);
                return;
            default:
                FileLoadOperation.j(this.f21106b);
                return;
        }
    }
}
