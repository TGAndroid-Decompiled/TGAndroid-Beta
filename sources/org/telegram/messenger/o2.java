package org.telegram.messenger;
public final class o2 implements Runnable {
    public final int f18529a;
    public final FileLoadOperation f18530b;

    public o2(FileLoadOperation fileLoadOperation, int i10) {
        this.f18529a = i10;
        this.f18530b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18529a) {
            case 0:
                FileLoadOperation.w(this.f18530b);
                return;
            case 1:
                FileLoadOperation.a(this.f18530b);
                return;
            case 2:
                FileLoadOperation.k(this.f18530b);
                return;
            case 3:
                FileLoadOperation.m(this.f18530b);
                return;
            case 4:
                FileLoadOperation.q(this.f18530b);
                return;
            default:
                FileLoadOperation.j(this.f18530b);
                return;
        }
    }
}
