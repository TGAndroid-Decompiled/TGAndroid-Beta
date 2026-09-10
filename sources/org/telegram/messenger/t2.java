package org.telegram.messenger;
public final class t2 implements Runnable {
    public final int f16368a;
    public final FileLoadOperation f16369b;
    public final boolean f16370c;

    public t2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f16368a = i10;
        this.f16369b = fileLoadOperation;
        this.f16370c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16368a) {
            case 0:
                FileLoadOperation.d(this.f16369b, this.f16370c);
                return;
            case 1:
                FileLoadOperation.g(this.f16369b, this.f16370c);
                return;
            case 2:
                FileLoadOperation.n(this.f16369b, this.f16370c);
                return;
            default:
                FileLoadOperation.b(this.f16369b, this.f16370c);
                return;
        }
    }
}
