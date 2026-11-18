package org.telegram.messenger;
public final class ms implements Runnable {
    public final int f25835a;
    public final xs f25836b;
    public final long f25837c;
    public final long d;

    public ms(xs xsVar, long j3, long j10, int i7) {
        this.f25835a = i7;
        this.f25836b = xsVar;
        this.f25837c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f25835a) {
            case 0:
                xs xsVar = this.f25836b;
                xsVar.G = this.f25837c;
                xsVar.H = this.d;
                return;
            default:
                this.f25836b.o(this.f25837c, this.d);
                return;
        }
    }
}
