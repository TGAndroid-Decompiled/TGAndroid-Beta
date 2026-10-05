package org.telegram.messenger;
public final class m2 implements Runnable {
    public final int f18536a;
    public final FileLoadOperation f18537b;
    public final int f18538c;

    public m2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f18536a = i11;
        this.f18537b = fileLoadOperation;
        this.f18538c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18536a) {
            case 0:
                FileLoadOperation.y(this.f18537b, this.f18538c);
                return;
            case 1:
                FileLoadOperation.t(this.f18537b, this.f18538c);
                return;
            case 2:
                FileLoadOperation.c(this.f18537b, this.f18538c);
                return;
            default:
                FileLoadOperation.B(this.f18537b, this.f18538c);
                return;
        }
    }
}
