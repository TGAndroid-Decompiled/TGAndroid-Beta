package org.telegram.messenger;
public final class m2 implements Runnable {
    public final int f16727a;
    public final FileLoadOperation f16728b;
    public final int f16729c;

    public m2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f16727a = i11;
        this.f16728b = fileLoadOperation;
        this.f16729c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16727a) {
            case 0:
                FileLoadOperation.y(this.f16728b, this.f16729c);
                return;
            case 1:
                FileLoadOperation.t(this.f16728b, this.f16729c);
                return;
            case 2:
                FileLoadOperation.c(this.f16728b, this.f16729c);
                return;
            default:
                FileLoadOperation.B(this.f16728b, this.f16729c);
                return;
        }
    }
}
