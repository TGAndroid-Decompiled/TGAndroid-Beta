package org.telegram.messenger;
public final class m2 implements Runnable {
    public final int f16899a;
    public final FileLoadOperation f16900b;
    public final int f16901c;

    public m2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f16899a = i11;
        this.f16900b = fileLoadOperation;
        this.f16901c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16899a) {
            case 0:
                FileLoadOperation.y(this.f16900b, this.f16901c);
                return;
            case 1:
                FileLoadOperation.t(this.f16900b, this.f16901c);
                return;
            case 2:
                FileLoadOperation.c(this.f16900b, this.f16901c);
                return;
            default:
                FileLoadOperation.B(this.f16900b, this.f16901c);
                return;
        }
    }
}
