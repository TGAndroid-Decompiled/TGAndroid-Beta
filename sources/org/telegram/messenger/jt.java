package org.telegram.messenger;
public final class jt implements Runnable {
    public final int f23582a;
    public final v10 f23583b;
    public final Exception f23584c;

    public jt(v10 v10Var, Exception exc, int i7) {
        this.f23582a = i7;
        this.f23583b = v10Var;
        this.f23584c = exc;
    }

    @Override
    public final void run() {
        switch (this.f23582a) {
            case 0:
                this.f23583b.a(null, this.f23584c.getMessage());
                return;
            default:
                this.f23583b.a(null, this.f23584c.getMessage());
                return;
        }
    }
}
