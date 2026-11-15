package org.telegram.messenger;
public final class ft implements Runnable {
    public final int f23545a;
    public final s10 f23546b;
    public final Exception f23547c;

    public ft(s10 s10Var, Exception exc, int i7) {
        this.f23545a = i7;
        this.f23546b = s10Var;
        this.f23547c = exc;
    }

    @Override
    public final void run() {
        switch (this.f23545a) {
            case 0:
                this.f23546b.a(null, this.f23547c.getMessage());
                return;
            default:
                this.f23546b.a(null, this.f23547c.getMessage());
                return;
        }
    }
}
