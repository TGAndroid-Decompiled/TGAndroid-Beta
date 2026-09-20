package org.telegram.messenger;
public final class m2 implements Runnable {
    public final int f16944a;
    public final FileLoadOperation f16945b;
    public final int f16946c;

    public m2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f16944a = i11;
        this.f16945b = fileLoadOperation;
        this.f16946c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16944a) {
            case 0:
                FileLoadOperation.y(this.f16945b, this.f16946c);
                return;
            case 1:
                FileLoadOperation.t(this.f16945b, this.f16946c);
                return;
            case 2:
                FileLoadOperation.c(this.f16945b, this.f16946c);
                return;
            default:
                FileLoadOperation.B(this.f16945b, this.f16946c);
                return;
        }
    }
}
