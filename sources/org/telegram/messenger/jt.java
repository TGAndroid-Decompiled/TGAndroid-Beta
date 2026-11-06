package org.telegram.messenger;
public final class jt implements Runnable {
    public final int f23589a;
    public final v10 f23590b;
    public final Exception f23591c;

    public jt(v10 v10Var, Exception exc, int i7) {
        this.f23589a = i7;
        this.f23590b = v10Var;
        this.f23591c = exc;
    }

    @Override
    public final void run() {
        switch (this.f23589a) {
            case 0:
                this.f23590b.a(null, this.f23591c.getMessage());
                return;
            default:
                this.f23590b.a(null, this.f23591c.getMessage());
                return;
        }
    }
}
