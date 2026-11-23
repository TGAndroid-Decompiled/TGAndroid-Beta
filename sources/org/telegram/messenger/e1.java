package org.telegram.messenger;
public final class e1 implements Runnable {
    public final int f23751a;
    public final h1 f23752b;

    public e1(h1 h1Var, int i7) {
        this.f23751a = i7;
        this.f23752b = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f23751a) {
            case 0:
                this.f23752b.a(null, false);
                return;
            default:
                this.f23752b.b(true);
                return;
        }
    }
}
