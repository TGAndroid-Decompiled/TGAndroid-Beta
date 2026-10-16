package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f17758a;
    public final FileLoadOperation f17759b;
    public final int f17760c;

    public p2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f17758a = i11;
        this.f17759b = fileLoadOperation;
        this.f17760c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17758a) {
            case 0:
                FileLoadOperation.F(this.f17759b, this.f17760c);
                return;
            case 1:
                FileLoadOperation.j(this.f17759b, this.f17760c);
                return;
            case 2:
                FileLoadOperation.y(this.f17759b, this.f17760c);
                return;
            default:
                FileLoadOperation.o(this.f17759b, this.f17760c);
                return;
        }
    }
}
