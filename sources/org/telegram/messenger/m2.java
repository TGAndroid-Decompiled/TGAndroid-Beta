package org.telegram.messenger;
public final class m2 implements Runnable {
    public final int f20934a;
    public final FileLoadOperation f20935b;
    public final int f20936c;

    public m2(FileLoadOperation fileLoadOperation, int i9, int i10) {
        this.f20934a = i10;
        this.f20935b = fileLoadOperation;
        this.f20936c = i9;
    }

    @Override
    public final void run() {
        switch (this.f20934a) {
            case 0:
                FileLoadOperation.y(this.f20935b, this.f20936c);
                return;
            case 1:
                FileLoadOperation.t(this.f20935b, this.f20936c);
                return;
            case 2:
                FileLoadOperation.c(this.f20935b, this.f20936c);
                return;
            default:
                FileLoadOperation.B(this.f20935b, this.f20936c);
                return;
        }
    }
}
