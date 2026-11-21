package org.telegram.messenger;
public final class ct implements Runnable {
    public final int f23444a;
    public final q10 f23445b;
    public final Exception f23446c;

    public ct(q10 q10Var, Exception exc, int i7) {
        this.f23444a = i7;
        this.f23445b = q10Var;
        this.f23446c = exc;
    }

    @Override
    public final void run() {
        switch (this.f23444a) {
            case 0:
                this.f23445b.a(null, this.f23446c.getMessage());
                return;
            default:
                this.f23445b.a(null, this.f23446c.getMessage());
                return;
        }
    }
}
