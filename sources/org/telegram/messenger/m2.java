package org.telegram.messenger;
public final class m2 implements Runnable {
    public final int f16995a;
    public final FileLoadOperation f16996b;
    public final int f16997c;

    public m2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f16995a = i11;
        this.f16996b = fileLoadOperation;
        this.f16997c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16995a) {
            case 0:
                FileLoadOperation.y(this.f16996b, this.f16997c);
                return;
            case 1:
                FileLoadOperation.t(this.f16996b, this.f16997c);
                return;
            case 2:
                FileLoadOperation.c(this.f16996b, this.f16997c);
                return;
            default:
                FileLoadOperation.B(this.f16996b, this.f16997c);
                return;
        }
    }
}
