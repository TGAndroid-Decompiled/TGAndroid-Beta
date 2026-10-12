package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f18632a;
    public final FileLoadOperation f18633b;
    public final int f18634c;

    public q2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f18632a = i11;
        this.f18633b = fileLoadOperation;
        this.f18634c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18632a) {
            case 0:
                FileLoadOperation.F(this.f18633b, this.f18634c);
                return;
            case 1:
                FileLoadOperation.j(this.f18633b, this.f18634c);
                return;
            case 2:
                FileLoadOperation.y(this.f18633b, this.f18634c);
                return;
            default:
                FileLoadOperation.o(this.f18633b, this.f18634c);
                return;
        }
    }
}
