package org.telegram.messenger;
public final class h1 implements Runnable {
    public final int f15812a;
    public final k1 f15813b;

    public h1(k1 k1Var, int i10) {
        this.f15812a = i10;
        this.f15813b = k1Var;
    }

    @Override
    public final void run() {
        switch (this.f15812a) {
            case 0:
                this.f15813b.a(null, false);
                return;
            default:
                this.f15813b.b(true);
                return;
        }
    }
}
