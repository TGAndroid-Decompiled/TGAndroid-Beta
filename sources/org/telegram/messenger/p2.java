package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f19625a;
    public final FileLoadOperation f19626b;

    public p2(FileLoadOperation fileLoadOperation, int i10) {
        this.f19625a = i10;
        this.f19626b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f19625a) {
            case 0:
                FileLoadOperation.w(this.f19626b);
                return;
            case 1:
                FileLoadOperation.a(this.f19626b);
                return;
            case 2:
                FileLoadOperation.k(this.f19626b);
                return;
            case 3:
                FileLoadOperation.m(this.f19626b);
                return;
            case 4:
                FileLoadOperation.q(this.f19626b);
                return;
            default:
                FileLoadOperation.j(this.f19626b);
                return;
        }
    }
}
