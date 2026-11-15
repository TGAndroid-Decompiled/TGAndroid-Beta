package org.telegram.messenger;
public final class ft implements Runnable {
    public final int f23547a;
    public final s10 f23548b;
    public final Exception f23549c;

    public ft(s10 s10Var, Exception exc, int i7) {
        this.f23547a = i7;
        this.f23548b = s10Var;
        this.f23549c = exc;
    }

    @Override
    public final void run() {
        switch (this.f23547a) {
            case 0:
                this.f23548b.a(null, this.f23549c.getMessage());
                return;
            default:
                this.f23548b.a(null, this.f23549c.getMessage());
                return;
        }
    }
}
