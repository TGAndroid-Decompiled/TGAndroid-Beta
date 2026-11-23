package org.telegram.messenger;
public final class ct implements Runnable {
    public final int f23531a;
    public final p10 f23532b;
    public final Exception f23533c;

    public ct(p10 p10Var, Exception exc, int i7) {
        this.f23531a = i7;
        this.f23532b = p10Var;
        this.f23533c = exc;
    }

    @Override
    public final void run() {
        switch (this.f23531a) {
            case 0:
                this.f23532b.a(null, this.f23533c.getMessage());
                return;
            default:
                this.f23532b.a(null, this.f23533c.getMessage());
                return;
        }
    }
}
