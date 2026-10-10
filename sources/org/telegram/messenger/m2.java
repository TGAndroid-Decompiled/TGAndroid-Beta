package org.telegram.messenger;
public final class m2 implements Runnable {
    public final int f18481a;
    public final FileLoadOperation f18482b;
    public final int f18483c;

    public m2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f18481a = i11;
        this.f18482b = fileLoadOperation;
        this.f18483c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18481a) {
            case 0:
                FileLoadOperation.F(this.f18482b, this.f18483c);
                return;
            case 1:
                FileLoadOperation.j(this.f18482b, this.f18483c);
                return;
            case 2:
                FileLoadOperation.y(this.f18482b, this.f18483c);
                return;
            default:
                FileLoadOperation.o(this.f18482b, this.f18483c);
                return;
        }
    }
}
