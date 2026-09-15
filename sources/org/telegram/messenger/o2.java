package org.telegram.messenger;
public final class o2 implements Runnable {
    public final int f16903a;
    public final FileLoadOperation f16904b;

    public o2(FileLoadOperation fileLoadOperation, int i10) {
        this.f16903a = i10;
        this.f16904b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f16903a) {
            case 0:
                FileLoadOperation.w(this.f16904b);
                return;
            case 1:
                FileLoadOperation.a(this.f16904b);
                return;
            case 2:
                FileLoadOperation.k(this.f16904b);
                return;
            case 3:
                FileLoadOperation.m(this.f16904b);
                return;
            case 4:
                FileLoadOperation.q(this.f16904b);
                return;
            default:
                FileLoadOperation.j(this.f16904b);
                return;
        }
    }
}
