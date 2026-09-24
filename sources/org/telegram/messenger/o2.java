package org.telegram.messenger;
public final class o2 implements Runnable {
    public final int f17146a;
    public final FileLoadOperation f17147b;

    public o2(FileLoadOperation fileLoadOperation, int i10) {
        this.f17146a = i10;
        this.f17147b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17146a) {
            case 0:
                FileLoadOperation.w(this.f17147b);
                return;
            case 1:
                FileLoadOperation.a(this.f17147b);
                return;
            case 2:
                FileLoadOperation.k(this.f17147b);
                return;
            case 3:
                FileLoadOperation.m(this.f17147b);
                return;
            case 4:
                FileLoadOperation.q(this.f17147b);
                return;
            default:
                FileLoadOperation.j(this.f17147b);
                return;
        }
    }
}
