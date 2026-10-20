package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f19309a;
    public final FileLoadOperation f19310b;
    public final int f19311c;

    public q2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f19309a = i11;
        this.f19310b = fileLoadOperation;
        this.f19311c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19309a) {
            case 0:
                FileLoadOperation.F(this.f19310b, this.f19311c);
                return;
            case 1:
                FileLoadOperation.j(this.f19310b, this.f19311c);
                return;
            case 2:
                FileLoadOperation.y(this.f19310b, this.f19311c);
                return;
            default:
                FileLoadOperation.o(this.f19310b, this.f19311c);
                return;
        }
    }
}
