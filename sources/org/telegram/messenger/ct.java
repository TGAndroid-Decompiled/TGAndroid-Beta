package org.telegram.messenger;
public final class ct implements Runnable {
    public final int f23419a;
    public final q10 f23420b;
    public final Exception f23421c;

    public ct(q10 q10Var, Exception exc, int i7) {
        this.f23419a = i7;
        this.f23420b = q10Var;
        this.f23421c = exc;
    }

    @Override
    public final void run() {
        switch (this.f23419a) {
            case 0:
                this.f23420b.a(null, this.f23421c.getMessage());
                return;
            default:
                this.f23420b.a(null, this.f23421c.getMessage());
                return;
        }
    }
}
