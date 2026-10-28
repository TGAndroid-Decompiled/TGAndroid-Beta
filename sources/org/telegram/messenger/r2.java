package org.telegram.messenger;
public final class r2 implements Runnable {
    public final int f21079a;
    public final FileLoadOperation f21080b;
    public final int f21081c;

    public r2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f21079a = i11;
        this.f21080b = fileLoadOperation;
        this.f21081c = i10;
    }

    @Override
    public final void run() {
        switch (this.f21079a) {
            case 0:
                FileLoadOperation.F(this.f21080b, this.f21081c);
                return;
            case 1:
                FileLoadOperation.j(this.f21080b, this.f21081c);
                return;
            case 2:
                FileLoadOperation.y(this.f21080b, this.f21081c);
                return;
            default:
                FileLoadOperation.o(this.f21080b, this.f21081c);
                return;
        }
    }
}
