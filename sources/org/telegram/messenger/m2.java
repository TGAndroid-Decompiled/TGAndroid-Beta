package org.telegram.messenger;
public final class m2 implements Runnable {
    public final int f20906a;
    public final FileLoadOperation f20907b;
    public final int f20908c;

    public m2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f20906a = i11;
        this.f20907b = fileLoadOperation;
        this.f20908c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20906a) {
            case 0:
                FileLoadOperation.y(this.f20907b, this.f20908c);
                return;
            case 1:
                FileLoadOperation.t(this.f20907b, this.f20908c);
                return;
            case 2:
                FileLoadOperation.c(this.f20907b, this.f20908c);
                return;
            default:
                FileLoadOperation.B(this.f20907b, this.f20908c);
                return;
        }
    }
}
