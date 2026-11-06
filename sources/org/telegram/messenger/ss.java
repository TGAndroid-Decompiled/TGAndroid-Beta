package org.telegram.messenger;
public final class ss implements Runnable {
    public final int f25502a;
    public final dt f25503b;
    public final long f25504c;
    public final long d;

    public ss(dt dtVar, long j3, long j10, int i7) {
        this.f25502a = i7;
        this.f25503b = dtVar;
        this.f25504c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f25502a) {
            case 0:
                dt dtVar = this.f25503b;
                dtVar.F = this.f25504c;
                dtVar.G = this.d;
                return;
            default:
                this.f25503b.o(this.f25504c, this.d);
                return;
        }
    }
}
