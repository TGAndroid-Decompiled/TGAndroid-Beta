package org.telegram.messenger;
public final class m2 implements Runnable {
    public final int f18535a;
    public final FileLoadOperation f18536b;
    public final int f18537c;

    public m2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f18535a = i11;
        this.f18536b = fileLoadOperation;
        this.f18537c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18535a) {
            case 0:
                FileLoadOperation.y(this.f18536b, this.f18537c);
                return;
            case 1:
                FileLoadOperation.t(this.f18536b, this.f18537c);
                return;
            case 2:
                FileLoadOperation.c(this.f18536b, this.f18537c);
                return;
            default:
                FileLoadOperation.B(this.f18536b, this.f18537c);
                return;
        }
    }
}
