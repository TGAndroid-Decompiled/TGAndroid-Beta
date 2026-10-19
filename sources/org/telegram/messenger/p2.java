package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f19230a;
    public final FileLoadOperation f19231b;
    public final int f19232c;

    public p2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f19230a = i11;
        this.f19231b = fileLoadOperation;
        this.f19232c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19230a) {
            case 0:
                FileLoadOperation.F(this.f19231b, this.f19232c);
                return;
            case 1:
                FileLoadOperation.j(this.f19231b, this.f19232c);
                return;
            case 2:
                FileLoadOperation.y(this.f19231b, this.f19232c);
                return;
            default:
                FileLoadOperation.o(this.f19231b, this.f19232c);
                return;
        }
    }
}
