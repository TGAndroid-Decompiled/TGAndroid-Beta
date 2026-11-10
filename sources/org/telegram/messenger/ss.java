package org.telegram.messenger;
public final class ss implements Runnable {
    public final int f25520a;
    public final dt f25521b;
    public final long f25522c;
    public final long d;

    public ss(dt dtVar, long j3, long j10, int i7) {
        this.f25520a = i7;
        this.f25521b = dtVar;
        this.f25522c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f25520a) {
            case 0:
                dt dtVar = this.f25521b;
                dtVar.F = this.f25522c;
                dtVar.G = this.d;
                return;
            default:
                this.f25521b.o(this.f25522c, this.d);
                return;
        }
    }
}
