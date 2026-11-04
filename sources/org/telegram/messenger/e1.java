package org.telegram.messenger;
public final class e1 implements Runnable {
    public final int f22285a;
    public final h1 f22286b;

    public e1(h1 h1Var, int i3) {
        this.f22285a = i3;
        this.f22286b = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f22285a) {
            case 0:
                this.f22286b.a(null, false);
                return;
            default:
                this.f22286b.b(true);
                return;
        }
    }
}
