package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f18053a;
    public final FileLoadOperation f18054b;

    public p2(FileLoadOperation fileLoadOperation, int i10) {
        this.f18053a = i10;
        this.f18054b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18053a) {
            case 0:
                FileLoadOperation.w(this.f18054b);
                return;
            case 1:
                FileLoadOperation.a(this.f18054b);
                return;
            case 2:
                FileLoadOperation.k(this.f18054b);
                return;
            case 3:
                FileLoadOperation.m(this.f18054b);
                return;
            case 4:
                FileLoadOperation.q(this.f18054b);
                return;
            default:
                FileLoadOperation.j(this.f18054b);
                return;
        }
    }
}
