package org.telegram.messenger;
public final class m2 implements Runnable {
    public final int f16716a;
    public final FileLoadOperation f16717b;
    public final int f16718c;

    public m2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f16716a = i11;
        this.f16717b = fileLoadOperation;
        this.f16718c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16716a) {
            case 0:
                FileLoadOperation.y(this.f16717b, this.f16718c);
                return;
            case 1:
                FileLoadOperation.t(this.f16717b, this.f16718c);
                return;
            case 2:
                FileLoadOperation.c(this.f16717b, this.f16718c);
                return;
            default:
                FileLoadOperation.B(this.f16717b, this.f16718c);
                return;
        }
    }
}
