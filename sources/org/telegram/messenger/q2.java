package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f18186a;
    public final FileLoadOperation f18187b;
    public final boolean f18188c;

    public q2(FileLoadOperation fileLoadOperation, boolean z4, int i10) {
        this.f18186a = i10;
        this.f18187b = fileLoadOperation;
        this.f18188c = z4;
    }

    @Override
    public final void run() {
        switch (this.f18186a) {
            case 0:
                FileLoadOperation.d(this.f18187b, this.f18188c);
                return;
            case 1:
                FileLoadOperation.g(this.f18187b, this.f18188c);
                return;
            case 2:
                FileLoadOperation.n(this.f18187b, this.f18188c);
                return;
            default:
                FileLoadOperation.b(this.f18187b, this.f18188c);
                return;
        }
    }
}
