package org.telegram.messenger;
public final class o2 implements Runnable {
    public final int f18744a;
    public final FileLoadOperation f18745b;

    public o2(FileLoadOperation fileLoadOperation, int i10) {
        this.f18744a = i10;
        this.f18745b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18744a) {
            case 0:
                FileLoadOperation.w(this.f18745b);
                return;
            case 1:
                FileLoadOperation.a(this.f18745b);
                return;
            case 2:
                FileLoadOperation.k(this.f18745b);
                return;
            case 3:
                FileLoadOperation.m(this.f18745b);
                return;
            case 4:
                FileLoadOperation.q(this.f18745b);
                return;
            default:
                FileLoadOperation.j(this.f18745b);
                return;
        }
    }
}
