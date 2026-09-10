package org.telegram.messenger;
public final class s2 implements Runnable {
    public final int f16277a;
    public final FileLoadOperation f16278b;

    public s2(FileLoadOperation fileLoadOperation, int i10) {
        this.f16277a = i10;
        this.f16278b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f16277a) {
            case 0:
                FileLoadOperation.w(this.f16278b);
                return;
            case 1:
                FileLoadOperation.a(this.f16278b);
                return;
            case 2:
                FileLoadOperation.k(this.f16278b);
                return;
            case 3:
                FileLoadOperation.m(this.f16278b);
                return;
            case 4:
                FileLoadOperation.q(this.f16278b);
                return;
            default:
                FileLoadOperation.j(this.f16278b);
                return;
        }
    }
}
