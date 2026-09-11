package org.telegram.messenger;
public final class m2 implements Runnable {
    public final int f18357a;
    public final FileLoadOperation f18358b;
    public final int f18359c;

    public m2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f18357a = i11;
        this.f18358b = fileLoadOperation;
        this.f18359c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18357a) {
            case 0:
                FileLoadOperation.y(this.f18358b, this.f18359c);
                return;
            case 1:
                FileLoadOperation.t(this.f18358b, this.f18359c);
                return;
            case 2:
                FileLoadOperation.c(this.f18358b, this.f18359c);
                return;
            default:
                FileLoadOperation.B(this.f18358b, this.f18359c);
                return;
        }
    }
}
