package org.telegram.messenger;
public final class n2 implements Runnable {
    public final int f17892a;
    public final FileLoadOperation f17893b;
    public final int f17894c;

    public n2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f17892a = i11;
        this.f17893b = fileLoadOperation;
        this.f17894c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17892a) {
            case 0:
                FileLoadOperation.y(this.f17893b, this.f17894c);
                return;
            case 1:
                FileLoadOperation.t(this.f17893b, this.f17894c);
                return;
            case 2:
                FileLoadOperation.c(this.f17893b, this.f17894c);
                return;
            default:
                FileLoadOperation.B(this.f17893b, this.f17894c);
                return;
        }
    }
}
