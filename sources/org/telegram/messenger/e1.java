package org.telegram.messenger;
public final class e1 implements Runnable {
    public final int f23620a;
    public final h1 f23621b;

    public e1(h1 h1Var, int i7) {
        this.f23620a = i7;
        this.f23621b = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f23620a) {
            case 0:
                this.f23621b.a(null, false);
                return;
            default:
                this.f23621b.b(true);
                return;
        }
    }
}
