package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f18075a;
    public final FileLoadOperation f18076b;

    public p2(FileLoadOperation fileLoadOperation, int i10) {
        this.f18075a = i10;
        this.f18076b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18075a) {
            case 0:
                FileLoadOperation.w(this.f18076b);
                return;
            case 1:
                FileLoadOperation.a(this.f18076b);
                return;
            case 2:
                FileLoadOperation.k(this.f18076b);
                return;
            case 3:
                FileLoadOperation.m(this.f18076b);
                return;
            case 4:
                FileLoadOperation.q(this.f18076b);
                return;
            default:
                FileLoadOperation.j(this.f18076b);
                return;
        }
    }
}
