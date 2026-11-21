package org.telegram.messenger;
public final class e1 implements Runnable {
    public final int f23656a;
    public final h1 f23657b;

    public e1(h1 h1Var, int i7) {
        this.f23656a = i7;
        this.f23657b = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f23656a) {
            case 0:
                this.f23657b.a(null, false);
                return;
            default:
                this.f23657b.b(true);
                return;
        }
    }
}
