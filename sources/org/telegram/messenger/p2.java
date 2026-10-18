package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f19211a;
    public final FileLoadOperation f19212b;
    public final int f19213c;

    public p2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f19211a = i11;
        this.f19212b = fileLoadOperation;
        this.f19213c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19211a) {
            case 0:
                FileLoadOperation.F(this.f19212b, this.f19213c);
                return;
            case 1:
                FileLoadOperation.j(this.f19212b, this.f19213c);
                return;
            case 2:
                FileLoadOperation.y(this.f19212b, this.f19213c);
                return;
            default:
                FileLoadOperation.o(this.f19212b, this.f19213c);
                return;
        }
    }
}
