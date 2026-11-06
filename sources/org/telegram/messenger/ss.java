package org.telegram.messenger;
public final class ss implements Runnable {
    public final int f25510a;
    public final dt f25511b;
    public final long f25512c;
    public final long d;

    public ss(dt dtVar, long j3, long j10, int i7) {
        this.f25510a = i7;
        this.f25511b = dtVar;
        this.f25512c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f25510a) {
            case 0:
                dt dtVar = this.f25511b;
                dtVar.F = this.f25512c;
                dtVar.G = this.d;
                return;
            default:
                this.f25511b.o(this.f25512c, this.d);
                return;
        }
    }
}
