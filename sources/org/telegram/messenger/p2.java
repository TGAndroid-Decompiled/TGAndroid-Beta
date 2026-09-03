package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f19627a;
    public final FileLoadOperation f19628b;

    public p2(FileLoadOperation fileLoadOperation, int i10) {
        this.f19627a = i10;
        this.f19628b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f19627a) {
            case 0:
                FileLoadOperation.w(this.f19628b);
                return;
            case 1:
                FileLoadOperation.a(this.f19628b);
                return;
            case 2:
                FileLoadOperation.k(this.f19628b);
                return;
            case 3:
                FileLoadOperation.m(this.f19628b);
                return;
            case 4:
                FileLoadOperation.q(this.f19628b);
                return;
            default:
                FileLoadOperation.j(this.f19628b);
                return;
        }
    }
}
