package org.telegram.messenger;
public final class o2 implements Runnable {
    public final int f18746a;
    public final FileLoadOperation f18747b;

    public o2(FileLoadOperation fileLoadOperation, int i10) {
        this.f18746a = i10;
        this.f18747b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18746a) {
            case 0:
                FileLoadOperation.w(this.f18747b);
                return;
            case 1:
                FileLoadOperation.a(this.f18747b);
                return;
            case 2:
                FileLoadOperation.k(this.f18747b);
                return;
            case 3:
                FileLoadOperation.m(this.f18747b);
                return;
            case 4:
                FileLoadOperation.q(this.f18747b);
                return;
            default:
                FileLoadOperation.j(this.f18747b);
                return;
        }
    }
}
