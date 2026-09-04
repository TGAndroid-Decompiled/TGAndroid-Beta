package org.telegram.messenger;
public final class m2 implements Runnable {
    public final int f18322a;
    public final FileLoadOperation f18323b;
    public final int f18324c;

    public m2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f18322a = i11;
        this.f18323b = fileLoadOperation;
        this.f18324c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18322a) {
            case 0:
                FileLoadOperation.y(this.f18323b, this.f18324c);
                return;
            case 1:
                FileLoadOperation.t(this.f18323b, this.f18324c);
                return;
            case 2:
                FileLoadOperation.c(this.f18323b, this.f18324c);
                return;
            default:
                FileLoadOperation.B(this.f18323b, this.f18324c);
                return;
        }
    }
}
