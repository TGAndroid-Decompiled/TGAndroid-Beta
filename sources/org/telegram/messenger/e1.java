package org.telegram.messenger;
public final class e1 implements Runnable {
    public final int f22135a;
    public final h1 f22136b;

    public e1(h1 h1Var, int i7) {
        this.f22135a = i7;
        this.f22136b = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f22135a) {
            case 0:
                this.f22136b.a(null, false);
                return;
            default:
                this.f22136b.b(true);
                return;
        }
    }
}
