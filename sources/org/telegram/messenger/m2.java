package org.telegram.messenger;
public final class m2 implements Runnable {
    public final int f18384a;
    public final FileLoadOperation f18385b;
    public final int f18386c;

    public m2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f18384a = i11;
        this.f18385b = fileLoadOperation;
        this.f18386c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18384a) {
            case 0:
                FileLoadOperation.y(this.f18385b, this.f18386c);
                return;
            case 1:
                FileLoadOperation.t(this.f18385b, this.f18386c);
                return;
            case 2:
                FileLoadOperation.c(this.f18385b, this.f18386c);
                return;
            default:
                FileLoadOperation.B(this.f18385b, this.f18386c);
                return;
        }
    }
}
