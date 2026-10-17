package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f19231a;
    public final FileLoadOperation f19232b;
    public final int f19233c;

    public p2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f19231a = i11;
        this.f19232b = fileLoadOperation;
        this.f19233c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19231a) {
            case 0:
                FileLoadOperation.F(this.f19232b, this.f19233c);
                return;
            case 1:
                FileLoadOperation.j(this.f19232b, this.f19233c);
                return;
            case 2:
                FileLoadOperation.y(this.f19232b, this.f19233c);
                return;
            default:
                FileLoadOperation.o(this.f19232b, this.f19233c);
                return;
        }
    }
}
