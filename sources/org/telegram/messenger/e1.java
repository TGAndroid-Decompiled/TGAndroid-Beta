package org.telegram.messenger;
public final class e1 implements Runnable {
    public final int f23219a;
    public final h1 f23220b;

    public e1(h1 h1Var, int i7) {
        this.f23219a = i7;
        this.f23220b = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f23219a) {
            case 0:
                this.f23220b.a(null, false);
                return;
            default:
                this.f23220b.b(true);
                return;
        }
    }
}
