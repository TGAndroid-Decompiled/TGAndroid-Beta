package org.telegram.messenger;
public final class dt implements Runnable {
    public final int f23611a;
    public final r10 f23612b;
    public final Exception f23613c;

    public dt(r10 r10Var, Exception exc, int i7) {
        this.f23611a = i7;
        this.f23612b = r10Var;
        this.f23613c = exc;
    }

    @Override
    public final void run() {
        switch (this.f23611a) {
            case 0:
                this.f23612b.a(null, this.f23613c.getMessage());
                return;
            default:
                this.f23612b.a(null, this.f23613c.getMessage());
                return;
        }
    }
}
