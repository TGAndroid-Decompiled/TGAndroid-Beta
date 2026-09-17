package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f17017a;
    public final FileLoadOperation f17018b;
    public final boolean f17019c;

    public p2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f17017a = i10;
        this.f17018b = fileLoadOperation;
        this.f17019c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17017a) {
            case 0:
                FileLoadOperation.d(this.f17018b, this.f17019c);
                return;
            case 1:
                FileLoadOperation.g(this.f17018b, this.f17019c);
                return;
            case 2:
                FileLoadOperation.n(this.f17018b, this.f17019c);
                return;
            default:
                FileLoadOperation.b(this.f17018b, this.f17019c);
                return;
        }
    }
}
