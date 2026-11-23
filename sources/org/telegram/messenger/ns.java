package org.telegram.messenger;
public final class ns implements Runnable {
    public final int f26032a;
    public final ys f26033b;
    public final long f26034c;
    public final long d;

    public ns(ys ysVar, long j3, long j10, int i7) {
        this.f26032a = i7;
        this.f26033b = ysVar;
        this.f26034c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f26032a) {
            case 0:
                ys ysVar = this.f26033b;
                ysVar.G = this.f26034c;
                ysVar.H = this.d;
                return;
            default:
                this.f26033b.o(this.f26034c, this.d);
                return;
        }
    }
}
