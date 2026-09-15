package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f17008a;
    public final FileLoadOperation f17009b;
    public final boolean f17010c;

    public p2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f17008a = i10;
        this.f17009b = fileLoadOperation;
        this.f17010c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17008a) {
            case 0:
                FileLoadOperation.d(this.f17009b, this.f17010c);
                return;
            case 1:
                FileLoadOperation.g(this.f17009b, this.f17010c);
                return;
            case 2:
                FileLoadOperation.n(this.f17009b, this.f17010c);
                return;
            default:
                FileLoadOperation.b(this.f17009b, this.f17010c);
                return;
        }
    }
}
