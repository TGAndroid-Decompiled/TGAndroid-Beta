package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f19343a;
    public final FileLoadOperation f19344b;
    public final int f19345c;

    public q2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f19343a = i11;
        this.f19344b = fileLoadOperation;
        this.f19345c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19343a) {
            case 0:
                FileLoadOperation.F(this.f19344b, this.f19345c);
                return;
            case 1:
                FileLoadOperation.j(this.f19344b, this.f19345c);
                return;
            case 2:
                FileLoadOperation.y(this.f19344b, this.f19345c);
                return;
            default:
                FileLoadOperation.o(this.f19344b, this.f19345c);
                return;
        }
    }
}
