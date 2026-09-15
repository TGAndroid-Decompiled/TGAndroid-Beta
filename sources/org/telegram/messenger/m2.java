package org.telegram.messenger;
public final class m2 implements Runnable {
    public final int f16718a;
    public final FileLoadOperation f16719b;
    public final int f16720c;

    public m2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.f16718a = i11;
        this.f16719b = fileLoadOperation;
        this.f16720c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16718a) {
            case 0:
                FileLoadOperation.y(this.f16719b, this.f16720c);
                return;
            case 1:
                FileLoadOperation.t(this.f16719b, this.f16720c);
                return;
            case 2:
                FileLoadOperation.c(this.f16719b, this.f16720c);
                return;
            default:
                FileLoadOperation.B(this.f16719b, this.f16720c);
                return;
        }
    }
}
