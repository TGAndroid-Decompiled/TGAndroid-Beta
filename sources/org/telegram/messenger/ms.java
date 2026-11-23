package org.telegram.messenger;
public final class ms implements Runnable {
    public final int f25928a;
    public final xs f25929b;
    public final long f25930c;
    public final long d;

    public ms(xs xsVar, long j3, long j10, int i7) {
        this.f25928a = i7;
        this.f25929b = xsVar;
        this.f25930c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f25928a) {
            case 0:
                xs xsVar = this.f25929b;
                xsVar.G = this.f25930c;
                xsVar.H = this.d;
                return;
            default:
                this.f25929b.o(this.f25930c, this.d);
                return;
        }
    }
}
