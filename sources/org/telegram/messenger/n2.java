package org.telegram.messenger;
public final class n2 implements Runnable {
    public final int f19415a;
    public final FileLoadOperation f19416b;
    public final int f19417c;

    public n2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f19415a = i11;
        this.f19416b = fileLoadOperation;
        this.f19417c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19415a) {
            case 0:
                FileLoadOperation.y(this.f19416b, this.f19417c);
                return;
            case 1:
                FileLoadOperation.t(this.f19416b, this.f19417c);
                return;
            case 2:
                FileLoadOperation.c(this.f19416b, this.f19417c);
                return;
            default:
                FileLoadOperation.B(this.f19416b, this.f19417c);
                return;
        }
    }
}
