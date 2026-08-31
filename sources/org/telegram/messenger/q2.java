package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f19745a;
    public final FileLoadOperation f19746b;
    public final boolean f19747c;

    public q2(FileLoadOperation fileLoadOperation, boolean z4, int i10) {
        this.f19745a = i10;
        this.f19746b = fileLoadOperation;
        this.f19747c = z4;
    }

    @Override
    public final void run() {
        switch (this.f19745a) {
            case 0:
                FileLoadOperation.d(this.f19746b, this.f19747c);
                return;
            case 1:
                FileLoadOperation.g(this.f19746b, this.f19747c);
                return;
            case 2:
                FileLoadOperation.n(this.f19746b, this.f19747c);
                return;
            default:
                FileLoadOperation.b(this.f19746b, this.f19747c);
                return;
        }
    }
}
