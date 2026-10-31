package org.telegram.messenger;
public final class ut implements Runnable {
    public final int f18392a;
    public final j20 f18393b;
    public final Exception f18394c;

    public ut(j20 j20Var, Exception exc, int i10) {
        this.f18392a = i10;
        this.f18393b = j20Var;
        this.f18394c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18392a) {
            case 0:
                this.f18393b.a(null, this.f18394c.getMessage());
                return;
            default:
                this.f18393b.a(null, this.f18394c.getMessage());
                return;
        }
    }
}
