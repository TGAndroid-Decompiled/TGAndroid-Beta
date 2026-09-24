package org.telegram.messenger;
public final class m2 implements Runnable {
    public final int f16959a;
    public final FileLoadOperation f16960b;
    public final int f16961c;

    public m2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f16959a = i11;
        this.f16960b = fileLoadOperation;
        this.f16961c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16959a) {
            case 0:
                FileLoadOperation.y(this.f16960b, this.f16961c);
                return;
            case 1:
                FileLoadOperation.t(this.f16960b, this.f16961c);
                return;
            case 2:
                FileLoadOperation.c(this.f16960b, this.f16961c);
                return;
            default:
                FileLoadOperation.B(this.f16960b, this.f16961c);
                return;
        }
    }
}
