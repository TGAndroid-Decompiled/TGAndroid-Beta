package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f16098a;
    public final FileLoadOperation f16099b;
    public final int f16100c;

    public q2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f16098a = i11;
        this.f16099b = fileLoadOperation;
        this.f16100c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16098a) {
            case 0:
                FileLoadOperation.y(this.f16099b, this.f16100c);
                return;
            case 1:
                FileLoadOperation.t(this.f16099b, this.f16100c);
                return;
            case 2:
                FileLoadOperation.c(this.f16099b, this.f16100c);
                return;
            default:
                FileLoadOperation.B(this.f16099b, this.f16100c);
                return;
        }
    }
}
