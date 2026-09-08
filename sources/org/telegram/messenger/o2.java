package org.telegram.messenger;
public final class o2 implements Runnable {
    public final int f18556a;
    public final FileLoadOperation f18557b;

    public o2(FileLoadOperation fileLoadOperation, int i10) {
        this.f18556a = i10;
        this.f18557b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18556a) {
            case 0:
                FileLoadOperation.w(this.f18557b);
                return;
            case 1:
                FileLoadOperation.a(this.f18557b);
                return;
            case 2:
                FileLoadOperation.k(this.f18557b);
                return;
            case 3:
                FileLoadOperation.m(this.f18557b);
                return;
            case 4:
                FileLoadOperation.q(this.f18557b);
                return;
            default:
                FileLoadOperation.j(this.f18557b);
                return;
        }
    }
}
