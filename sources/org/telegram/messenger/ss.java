package org.telegram.messenger;
public final class ss implements Runnable {
    public final int f25516a;
    public final dt f25517b;
    public final long f25518c;
    public final long d;

    public ss(dt dtVar, long j3, long j10, int i7) {
        this.f25516a = i7;
        this.f25517b = dtVar;
        this.f25518c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f25516a) {
            case 0:
                dt dtVar = this.f25517b;
                dtVar.F = this.f25518c;
                dtVar.G = this.d;
                return;
            default:
                this.f25517b.o(this.f25518c, this.d);
                return;
        }
    }
}
