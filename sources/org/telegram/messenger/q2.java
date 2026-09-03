package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f18160a;
    public final FileLoadOperation f18161b;
    public final boolean f18162c;

    public q2(FileLoadOperation fileLoadOperation, boolean z4, int i10) {
        this.f18160a = i10;
        this.f18161b = fileLoadOperation;
        this.f18162c = z4;
    }

    @Override
    public final void run() {
        switch (this.f18160a) {
            case 0:
                FileLoadOperation.d(this.f18161b, this.f18162c);
                return;
            case 1:
                FileLoadOperation.g(this.f18161b, this.f18162c);
                return;
            case 2:
                FileLoadOperation.n(this.f18161b, this.f18162c);
                return;
            default:
                FileLoadOperation.b(this.f18161b, this.f18162c);
                return;
        }
    }
}
