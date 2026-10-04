package org.telegram.messenger;
public final class m2 implements Runnable {
    public final int f18531a;
    public final FileLoadOperation f18532b;
    public final int f18533c;

    public m2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f18531a = i11;
        this.f18532b = fileLoadOperation;
        this.f18533c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18531a) {
            case 0:
                FileLoadOperation.y(this.f18532b, this.f18533c);
                return;
            case 1:
                FileLoadOperation.t(this.f18532b, this.f18533c);
                return;
            case 2:
                FileLoadOperation.c(this.f18532b, this.f18533c);
                return;
            default:
                FileLoadOperation.B(this.f18532b, this.f18533c);
                return;
        }
    }
}
