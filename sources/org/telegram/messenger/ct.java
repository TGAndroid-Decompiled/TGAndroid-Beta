package org.telegram.messenger;
public final class ct implements Runnable {
    public final int f23416a;
    public final q10 f23417b;
    public final Exception f23418c;

    public ct(q10 q10Var, Exception exc, int i7) {
        this.f23416a = i7;
        this.f23417b = q10Var;
        this.f23418c = exc;
    }

    @Override
    public final void run() {
        switch (this.f23416a) {
            case 0:
                this.f23417b.a(null, this.f23418c.getMessage());
                return;
            default:
                this.f23417b.a(null, this.f23418c.getMessage());
                return;
        }
    }
}
