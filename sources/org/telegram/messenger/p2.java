package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f17271a;
    public final FileLoadOperation f17272b;
    public final boolean f17273c;

    public p2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f17271a = i10;
        this.f17272b = fileLoadOperation;
        this.f17273c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17271a) {
            case 0:
                FileLoadOperation.d(this.f17272b, this.f17273c);
                return;
            case 1:
                FileLoadOperation.g(this.f17272b, this.f17273c);
                return;
            case 2:
                FileLoadOperation.n(this.f17272b, this.f17273c);
                return;
            default:
                FileLoadOperation.b(this.f17272b, this.f17273c);
                return;
        }
    }
}
