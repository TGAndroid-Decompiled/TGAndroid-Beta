package org.telegram.messenger;
public final class h1 implements Runnable {
    public final int f15995a;
    public final k1 f15996b;

    public h1(k1 k1Var, int i10) {
        this.f15995a = i10;
        this.f15996b = k1Var;
    }

    @Override
    public final void run() {
        switch (this.f15995a) {
            case 0:
                this.f15996b.a(null, false);
                return;
            default:
                this.f15996b.b(true);
                return;
        }
    }
}
