package org.telegram.messenger;
public final class e1 implements Runnable {
    public final int f22142a;
    public final h1 f22143b;

    public e1(h1 h1Var, int i7) {
        this.f22142a = i7;
        this.f22143b = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f22142a) {
            case 0:
                this.f22143b.a(null, false);
                return;
            default:
                this.f22143b.b(true);
                return;
        }
    }
}
