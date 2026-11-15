package org.telegram.messenger;
public final class e1 implements Runnable {
    public final int f23226a;
    public final h1 f23227b;

    public e1(h1 h1Var, int i7) {
        this.f23226a = i7;
        this.f23227b = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f23226a) {
            case 0:
                this.f23227b.a(null, false);
                return;
            default:
                this.f23227b.b(true);
                return;
        }
    }
}
