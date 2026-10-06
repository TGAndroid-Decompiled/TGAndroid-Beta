package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f18844a;
    public final FileLoadOperation f18845b;
    public final boolean f18846c;

    public p2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f18844a = i10;
        this.f18845b = fileLoadOperation;
        this.f18846c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18844a) {
            case 0:
                FileLoadOperation.d(this.f18845b, this.f18846c);
                return;
            case 1:
                FileLoadOperation.g(this.f18845b, this.f18846c);
                return;
            case 2:
                FileLoadOperation.n(this.f18845b, this.f18846c);
                return;
            default:
                FileLoadOperation.b(this.f18845b, this.f18846c);
                return;
        }
    }
}
