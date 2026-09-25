package org.telegram.messenger;
public final class m2 implements Runnable {
    public final int f16974a;
    public final FileLoadOperation f16975b;
    public final int f16976c;

    public m2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f16974a = i11;
        this.f16975b = fileLoadOperation;
        this.f16976c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16974a) {
            case 0:
                FileLoadOperation.y(this.f16975b, this.f16976c);
                return;
            case 1:
                FileLoadOperation.t(this.f16975b, this.f16976c);
                return;
            case 2:
                FileLoadOperation.c(this.f16975b, this.f16976c);
                return;
            default:
                FileLoadOperation.B(this.f16975b, this.f16976c);
                return;
        }
    }
}
