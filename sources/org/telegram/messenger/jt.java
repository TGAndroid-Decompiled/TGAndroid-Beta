package org.telegram.messenger;
public final class jt implements Runnable {
    public final int f23601a;
    public final v10 f23602b;
    public final Exception f23603c;

    public jt(v10 v10Var, Exception exc, int i7) {
        this.f23601a = i7;
        this.f23602b = v10Var;
        this.f23603c = exc;
    }

    @Override
    public final void run() {
        switch (this.f23601a) {
            case 0:
                this.f23602b.a(null, this.f23603c.getMessage());
                return;
            default:
                this.f23602b.a(null, this.f23603c.getMessage());
                return;
        }
    }
}
