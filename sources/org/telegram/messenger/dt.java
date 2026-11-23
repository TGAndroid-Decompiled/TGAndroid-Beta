package org.telegram.messenger;
public final class dt implements Runnable {
    public final int f23575a;
    public final r10 f23576b;
    public final Exception f23577c;

    public dt(r10 r10Var, Exception exc, int i7) {
        this.f23575a = i7;
        this.f23576b = r10Var;
        this.f23577c = exc;
    }

    @Override
    public final void run() {
        switch (this.f23575a) {
            case 0:
                this.f23576b.a(null, this.f23577c.getMessage());
                return;
            default:
                this.f23576b.a(null, this.f23577c.getMessage());
                return;
        }
    }
}
