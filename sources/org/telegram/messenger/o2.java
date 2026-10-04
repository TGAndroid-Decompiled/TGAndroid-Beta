package org.telegram.messenger;
public final class o2 implements Runnable {
    public final int f18741a;
    public final FileLoadOperation f18742b;

    public o2(FileLoadOperation fileLoadOperation, int i10) {
        this.f18741a = i10;
        this.f18742b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18741a) {
            case 0:
                FileLoadOperation.w(this.f18742b);
                return;
            case 1:
                FileLoadOperation.a(this.f18742b);
                return;
            case 2:
                FileLoadOperation.k(this.f18742b);
                return;
            case 3:
                FileLoadOperation.m(this.f18742b);
                return;
            case 4:
                FileLoadOperation.q(this.f18742b);
                return;
            default:
                FileLoadOperation.j(this.f18742b);
                return;
        }
    }
}
