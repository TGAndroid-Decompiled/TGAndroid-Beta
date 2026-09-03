package org.telegram.messenger;
public final class n2 implements Runnable {
    public final int f19417a;
    public final FileLoadOperation f19418b;
    public final int f19419c;

    public n2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f19417a = i11;
        this.f19418b = fileLoadOperation;
        this.f19419c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19417a) {
            case 0:
                FileLoadOperation.y(this.f19418b, this.f19419c);
                return;
            case 1:
                FileLoadOperation.t(this.f19418b, this.f19419c);
                return;
            case 2:
                FileLoadOperation.c(this.f19418b, this.f19419c);
                return;
            default:
                FileLoadOperation.B(this.f19418b, this.f19419c);
                return;
        }
    }
}
