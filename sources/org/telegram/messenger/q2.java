package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f19306a;
    public final FileLoadOperation f19307b;
    public final int f19308c;

    public q2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f19306a = i11;
        this.f19307b = fileLoadOperation;
        this.f19308c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19306a) {
            case 0:
                FileLoadOperation.F(this.f19307b, this.f19308c);
                return;
            case 1:
                FileLoadOperation.j(this.f19307b, this.f19308c);
                return;
            case 2:
                FileLoadOperation.y(this.f19307b, this.f19308c);
                return;
            default:
                FileLoadOperation.o(this.f19307b, this.f19308c);
                return;
        }
    }
}
