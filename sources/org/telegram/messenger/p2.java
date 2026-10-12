package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f18058a;
    public final FileLoadOperation f18059b;
    public final int f18060c;

    public p2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f18058a = i11;
        this.f18059b = fileLoadOperation;
        this.f18060c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18058a) {
            case 0:
                FileLoadOperation.F(this.f18059b, this.f18060c);
                return;
            case 1:
                FileLoadOperation.j(this.f18059b, this.f18060c);
                return;
            case 2:
                FileLoadOperation.y(this.f18059b, this.f18060c);
                return;
            default:
                FileLoadOperation.o(this.f18059b, this.f18060c);
                return;
        }
    }
}
