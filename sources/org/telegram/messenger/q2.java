package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f19273a;
    public final FileLoadOperation f19274b;
    public final int f19275c;

    public q2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f19273a = i11;
        this.f19274b = fileLoadOperation;
        this.f19275c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19273a) {
            case 0:
                FileLoadOperation.F(this.f19274b, this.f19275c);
                return;
            case 1:
                FileLoadOperation.j(this.f19274b, this.f19275c);
                return;
            case 2:
                FileLoadOperation.y(this.f19274b, this.f19275c);
                return;
            default:
                FileLoadOperation.o(this.f19274b, this.f19275c);
                return;
        }
    }
}
