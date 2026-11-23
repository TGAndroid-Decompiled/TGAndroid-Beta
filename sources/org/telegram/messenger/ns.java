package org.telegram.messenger;
public final class ns implements Runnable {
    public final int f25996a;
    public final ys f25997b;
    public final long f25998c;
    public final long d;

    public ns(ys ysVar, long j3, long j10, int i7) {
        this.f25996a = i7;
        this.f25997b = ysVar;
        this.f25998c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f25996a) {
            case 0:
                ys ysVar = this.f25997b;
                ysVar.G = this.f25998c;
                ysVar.H = this.d;
                return;
            default:
                this.f25997b.o(this.f25998c, this.d);
                return;
        }
    }
}
