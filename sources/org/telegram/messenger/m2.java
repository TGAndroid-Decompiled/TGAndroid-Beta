package org.telegram.messenger;
public final class m2 implements Runnable {
    public final int f18534a;
    public final FileLoadOperation f18535b;
    public final int f18536c;

    public m2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f18534a = i11;
        this.f18535b = fileLoadOperation;
        this.f18536c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18534a) {
            case 0:
                FileLoadOperation.y(this.f18535b, this.f18536c);
                return;
            case 1:
                FileLoadOperation.t(this.f18535b, this.f18536c);
                return;
            case 2:
                FileLoadOperation.c(this.f18535b, this.f18536c);
                return;
            default:
                FileLoadOperation.B(this.f18535b, this.f18536c);
                return;
        }
    }
}
