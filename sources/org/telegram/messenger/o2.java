package org.telegram.messenger;
public final class o2 implements Runnable {
    public final int f16899a;
    public final FileLoadOperation f16900b;

    public o2(FileLoadOperation fileLoadOperation, int i10) {
        this.f16899a = i10;
        this.f16900b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f16899a) {
            case 0:
                FileLoadOperation.w(this.f16900b);
                return;
            case 1:
                this.f16900b.lambda$start$10();
                return;
            case 2:
                FileLoadOperation.k(this.f16900b);
                return;
            case 3:
                FileLoadOperation.m(this.f16900b);
                return;
            case 4:
                FileLoadOperation.q(this.f16900b);
                return;
            default:
                FileLoadOperation.j(this.f16900b);
                return;
        }
    }
}
