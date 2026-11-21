package org.telegram.messenger;
public final class ms implements Runnable {
    public final int f25861a;
    public final xs f25862b;
    public final long f25863c;
    public final long d;

    public ms(xs xsVar, long j3, long j10, int i7) {
        this.f25861a = i7;
        this.f25862b = xsVar;
        this.f25863c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f25861a) {
            case 0:
                xs xsVar = this.f25862b;
                xsVar.G = this.f25863c;
                xsVar.H = this.d;
                return;
            default:
                this.f25862b.o(this.f25863c, this.d);
                return;
        }
    }
}
