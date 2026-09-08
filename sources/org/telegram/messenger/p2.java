package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f18673a;
    public final FileLoadOperation f18674b;
    public final boolean f18675c;

    public p2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f18673a = i10;
        this.f18674b = fileLoadOperation;
        this.f18675c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18673a) {
            case 0:
                FileLoadOperation.d(this.f18674b, this.f18675c);
                return;
            case 1:
                FileLoadOperation.g(this.f18674b, this.f18675c);
                return;
            case 2:
                FileLoadOperation.n(this.f18674b, this.f18675c);
                return;
            default:
                FileLoadOperation.b(this.f18674b, this.f18675c);
                return;
        }
    }
}
