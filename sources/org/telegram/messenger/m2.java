package org.telegram.messenger;
public final class m2 implements Runnable {
    public final int f18349a;
    public final FileLoadOperation f18350b;
    public final int f18351c;

    public m2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f18349a = i11;
        this.f18350b = fileLoadOperation;
        this.f18351c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18349a) {
            case 0:
                FileLoadOperation.y(this.f18350b, this.f18351c);
                return;
            case 1:
                FileLoadOperation.t(this.f18350b, this.f18351c);
                return;
            case 2:
                FileLoadOperation.c(this.f18350b, this.f18351c);
                return;
            default:
                FileLoadOperation.B(this.f18350b, this.f18351c);
                return;
        }
    }
}
