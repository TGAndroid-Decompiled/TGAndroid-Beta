package org.telegram.messenger;
public final class o2 implements Runnable {
    public final int f16910a;
    public final FileLoadOperation f16911b;

    public o2(FileLoadOperation fileLoadOperation, int i10) {
        this.f16910a = i10;
        this.f16911b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f16910a) {
            case 0:
                FileLoadOperation.w(this.f16911b);
                return;
            case 1:
                FileLoadOperation.a(this.f16911b);
                return;
            case 2:
                FileLoadOperation.k(this.f16911b);
                return;
            case 3:
                FileLoadOperation.m(this.f16911b);
                return;
            case 4:
                FileLoadOperation.q(this.f16911b);
                return;
            default:
                FileLoadOperation.j(this.f16911b);
                return;
        }
    }
}
