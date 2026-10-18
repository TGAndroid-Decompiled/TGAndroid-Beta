package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f19233a;
    public final FileLoadOperation f19234b;
    public final int f19235c;

    public p2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f19233a = i11;
        this.f19234b = fileLoadOperation;
        this.f19235c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19233a) {
            case 0:
                FileLoadOperation.F(this.f19234b, this.f19235c);
                return;
            case 1:
                FileLoadOperation.j(this.f19234b, this.f19235c);
                return;
            case 2:
                FileLoadOperation.y(this.f19234b, this.f19235c);
                return;
            default:
                FileLoadOperation.o(this.f19234b, this.f19235c);
                return;
        }
    }
}
