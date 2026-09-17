package org.telegram.messenger;
public final class o2 implements Runnable {
    public final int f16912a;
    public final FileLoadOperation f16913b;

    public o2(FileLoadOperation fileLoadOperation, int i10) {
        this.f16912a = i10;
        this.f16913b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f16912a) {
            case 0:
                FileLoadOperation.w(this.f16913b);
                return;
            case 1:
                FileLoadOperation.a(this.f16913b);
                return;
            case 2:
                FileLoadOperation.k(this.f16913b);
                return;
            case 3:
                FileLoadOperation.m(this.f16913b);
                return;
            case 4:
                FileLoadOperation.q(this.f16913b);
                return;
            default:
                FileLoadOperation.j(this.f16913b);
                return;
        }
    }
}
