package org.telegram.messenger;
public final class at implements Runnable {
    public final int f21582a;
    public final n10 f21583b;
    public final Exception f21584c;

    public at(n10 n10Var, Exception exc, int i3) {
        this.f21582a = i3;
        this.f21583b = n10Var;
        this.f21584c = exc;
    }

    @Override
    public final void run() {
        switch (this.f21582a) {
            case 0:
                this.f21583b.a(null, this.f21584c.getMessage());
                return;
            default:
                this.f21583b.a(null, this.f21584c.getMessage());
                return;
        }
    }
}
