package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f18839a;
    public final FileLoadOperation f18840b;
    public final boolean f18841c;

    public p2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f18839a = i10;
        this.f18840b = fileLoadOperation;
        this.f18841c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18839a) {
            case 0:
                FileLoadOperation.d(this.f18840b, this.f18841c);
                return;
            case 1:
                FileLoadOperation.g(this.f18840b, this.f18841c);
                return;
            case 2:
                FileLoadOperation.n(this.f18840b, this.f18841c);
                return;
            default:
                FileLoadOperation.b(this.f18840b, this.f18841c);
                return;
        }
    }
}
