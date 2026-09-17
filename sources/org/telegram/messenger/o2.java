package org.telegram.messenger;
public final class o2 implements Runnable {
    public final int f18591a;
    public final FileLoadOperation f18592b;

    public o2(FileLoadOperation fileLoadOperation, int i10) {
        this.f18591a = i10;
        this.f18592b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18591a) {
            case 0:
                FileLoadOperation.w(this.f18592b);
                return;
            case 1:
                FileLoadOperation.a(this.f18592b);
                return;
            case 2:
                FileLoadOperation.k(this.f18592b);
                return;
            case 3:
                FileLoadOperation.m(this.f18592b);
                return;
            case 4:
                FileLoadOperation.q(this.f18592b);
                return;
            default:
                FileLoadOperation.j(this.f18592b);
                return;
        }
    }
}
