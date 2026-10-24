package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f19316a;
    public final FileLoadOperation f19317b;
    public final int f19318c;

    public q2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f19316a = i11;
        this.f19317b = fileLoadOperation;
        this.f19318c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19316a) {
            case 0:
                FileLoadOperation.F(this.f19317b, this.f19318c);
                return;
            case 1:
                FileLoadOperation.j(this.f19317b, this.f19318c);
                return;
            case 2:
                FileLoadOperation.y(this.f19317b, this.f19318c);
                return;
            default:
                FileLoadOperation.o(this.f19317b, this.f19318c);
                return;
        }
    }
}
