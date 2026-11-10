package org.telegram.messenger;
public final class jt implements Runnable {
    public final int f23605a;
    public final v10 f23606b;
    public final Exception f23607c;

    public jt(v10 v10Var, Exception exc, int i7) {
        this.f23605a = i7;
        this.f23606b = v10Var;
        this.f23607c = exc;
    }

    @Override
    public final void run() {
        switch (this.f23605a) {
            case 0:
                this.f23606b.a(null, this.f23607c.getMessage());
                return;
            default:
                this.f23606b.a(null, this.f23607c.getMessage());
                return;
        }
    }
}
