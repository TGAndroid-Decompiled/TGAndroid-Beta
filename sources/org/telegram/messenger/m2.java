package org.telegram.messenger;
public final class m2 implements Runnable {
    public final int f16979a;
    public final FileLoadOperation f16980b;
    public final int f16981c;

    public m2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f16979a = i11;
        this.f16980b = fileLoadOperation;
        this.f16981c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16979a) {
            case 0:
                FileLoadOperation.y(this.f16980b, this.f16981c);
                return;
            case 1:
                FileLoadOperation.t(this.f16980b, this.f16981c);
                return;
            case 2:
                FileLoadOperation.c(this.f16980b, this.f16981c);
                return;
            default:
                FileLoadOperation.B(this.f16980b, this.f16981c);
                return;
        }
    }
}
