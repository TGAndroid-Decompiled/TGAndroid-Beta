package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f19747a;
    public final FileLoadOperation f19748b;
    public final boolean f19749c;

    public q2(FileLoadOperation fileLoadOperation, boolean z4, int i10) {
        this.f19747a = i10;
        this.f19748b = fileLoadOperation;
        this.f19749c = z4;
    }

    @Override
    public final void run() {
        switch (this.f19747a) {
            case 0:
                FileLoadOperation.d(this.f19748b, this.f19749c);
                return;
            case 1:
                FileLoadOperation.g(this.f19748b, this.f19749c);
                return;
            case 2:
                FileLoadOperation.n(this.f19748b, this.f19749c);
                return;
            default:
                FileLoadOperation.b(this.f19748b, this.f19749c);
                return;
        }
    }
}
