package org.telegram.messenger;
public final class e1 implements Runnable {
    public final int f23628a;
    public final h1 f23629b;

    public e1(h1 h1Var, int i7) {
        this.f23628a = i7;
        this.f23629b = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f23628a) {
            case 0:
                this.f23629b.a(null, false);
                return;
            default:
                this.f23629b.b(true);
                return;
        }
    }
}
