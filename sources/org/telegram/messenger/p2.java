package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f16997a;
    public final FileLoadOperation f16998b;
    public final boolean f16999c;

    public p2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f16997a = i10;
        this.f16998b = fileLoadOperation;
        this.f16999c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16997a) {
            case 0:
                FileLoadOperation.d(this.f16998b, this.f16999c);
                return;
            case 1:
                FileLoadOperation.g(this.f16998b, this.f16999c);
                return;
            case 2:
                FileLoadOperation.n(this.f16998b, this.f16999c);
                return;
            default:
                FileLoadOperation.b(this.f16998b, this.f16999c);
                return;
        }
    }
}
