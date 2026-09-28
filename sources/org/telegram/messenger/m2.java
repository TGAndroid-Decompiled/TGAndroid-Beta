package org.telegram.messenger;
public final class m2 implements Runnable {
    public final int f16978a;
    public final FileLoadOperation f16979b;
    public final int f16980c;

    public m2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f16978a = i11;
        this.f16979b = fileLoadOperation;
        this.f16980c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16978a) {
            case 0:
                FileLoadOperation.y(this.f16979b, this.f16980c);
                return;
            case 1:
                FileLoadOperation.t(this.f16979b, this.f16980c);
                return;
            case 2:
                FileLoadOperation.c(this.f16979b, this.f16980c);
                return;
            default:
                FileLoadOperation.B(this.f16979b, this.f16980c);
                return;
        }
    }
}
