package org.telegram.messenger;
public final class e1 implements Runnable {
    public final int f22170a;
    public final h1 f22171b;

    public e1(h1 h1Var, int i7) {
        this.f22170a = i7;
        this.f22171b = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f22170a) {
            case 0:
                this.f22171b.a(null, false);
                return;
            default:
                this.f22171b.b(true);
                return;
        }
    }
}
