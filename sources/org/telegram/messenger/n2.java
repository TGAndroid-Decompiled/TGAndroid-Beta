package org.telegram.messenger;
public final class n2 implements Runnable {
    public final int f17867a;
    public final FileLoadOperation f17868b;
    public final int f17869c;

    public n2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f17867a = i11;
        this.f17868b = fileLoadOperation;
        this.f17869c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17867a) {
            case 0:
                FileLoadOperation.y(this.f17868b, this.f17869c);
                return;
            case 1:
                FileLoadOperation.t(this.f17868b, this.f17869c);
                return;
            case 2:
                FileLoadOperation.c(this.f17868b, this.f17869c);
                return;
            default:
                FileLoadOperation.B(this.f17868b, this.f17869c);
                return;
        }
    }
}
