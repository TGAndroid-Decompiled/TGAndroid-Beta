package org.telegram.messenger;
public final class e1 implements Runnable {
    public final int f22166a;
    public final h1 f22167b;

    public e1(h1 h1Var, int i7) {
        this.f22166a = i7;
        this.f22167b = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f22166a) {
            case 0:
                this.f22167b.a(null, false);
                return;
            default:
                this.f22167b.b(true);
                return;
        }
    }
}
