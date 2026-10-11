package org.telegram.messenger;
public final class m2 implements Runnable {
    public final int f18515a;
    public final FileLoadOperation f18516b;
    public final int f18517c;

    public m2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f18515a = i11;
        this.f18516b = fileLoadOperation;
        this.f18517c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18515a) {
            case 0:
                FileLoadOperation.F(this.f18516b, this.f18517c);
                return;
            case 1:
                FileLoadOperation.j(this.f18516b, this.f18517c);
                return;
            case 2:
                FileLoadOperation.y(this.f18516b, this.f18517c);
                return;
            default:
                FileLoadOperation.o(this.f18516b, this.f18517c);
                return;
        }
    }
}
