package org.telegram.messenger;
public final class m2 implements Runnable {
    public final int f16713a;
    public final FileLoadOperation f16714b;
    public final int f16715c;

    public m2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f16713a = i11;
        this.f16714b = fileLoadOperation;
        this.f16715c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16713a) {
            case 0:
                FileLoadOperation.y(this.f16714b, this.f16715c);
                return;
            case 1:
                FileLoadOperation.t(this.f16714b, this.f16715c);
                return;
            case 2:
                FileLoadOperation.c(this.f16714b, this.f16715c);
                return;
            default:
                FileLoadOperation.B(this.f16714b, this.f16715c);
                return;
        }
    }
}
