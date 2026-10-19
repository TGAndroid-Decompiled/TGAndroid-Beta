package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f19214a;
    public final FileLoadOperation f19215b;
    public final int f19216c;

    public p2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f19214a = i11;
        this.f19215b = fileLoadOperation;
        this.f19216c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19214a) {
            case 0:
                FileLoadOperation.F(this.f19215b, this.f19216c);
                return;
            case 1:
                FileLoadOperation.j(this.f19215b, this.f19216c);
                return;
            case 2:
                FileLoadOperation.y(this.f19215b, this.f19216c);
                return;
            default:
                FileLoadOperation.o(this.f19215b, this.f19216c);
                return;
        }
    }
}
