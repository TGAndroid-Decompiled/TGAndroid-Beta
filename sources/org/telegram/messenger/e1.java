package org.telegram.messenger;
public final class e1 implements Runnable {
    public final int f23631a;
    public final h1 f23632b;

    public e1(h1 h1Var, int i7) {
        this.f23631a = i7;
        this.f23632b = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f23631a) {
            case 0:
                this.f23632b.a(null, false);
                return;
            default:
                this.f23632b.b(true);
                return;
        }
    }
}
