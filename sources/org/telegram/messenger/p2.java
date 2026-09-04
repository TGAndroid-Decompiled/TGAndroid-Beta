package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f18646a;
    public final FileLoadOperation f18647b;
    public final boolean f18648c;

    public p2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f18646a = i10;
        this.f18647b = fileLoadOperation;
        this.f18648c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18646a) {
            case 0:
                FileLoadOperation.d(this.f18647b, this.f18648c);
                return;
            case 1:
                FileLoadOperation.g(this.f18647b, this.f18648c);
                return;
            case 2:
                FileLoadOperation.n(this.f18647b, this.f18648c);
                return;
            default:
                FileLoadOperation.b(this.f18647b, this.f18648c);
                return;
        }
    }
}
