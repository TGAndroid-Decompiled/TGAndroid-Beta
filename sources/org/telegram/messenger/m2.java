package org.telegram.messenger;
public final class m2 implements Runnable {
    public final int f16968a;
    public final FileLoadOperation f16969b;
    public final int f16970c;

    public m2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f16968a = i11;
        this.f16969b = fileLoadOperation;
        this.f16970c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16968a) {
            case 0:
                FileLoadOperation.y(this.f16969b, this.f16970c);
                return;
            case 1:
                FileLoadOperation.t(this.f16969b, this.f16970c);
                return;
            case 2:
                FileLoadOperation.c(this.f16969b, this.f16970c);
                return;
            default:
                FileLoadOperation.B(this.f16969b, this.f16970c);
                return;
        }
    }
}
