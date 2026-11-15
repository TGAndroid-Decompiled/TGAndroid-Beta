package org.telegram.messenger;
public final class ps implements Runnable {
    public final int f25970a;
    public final at f25971b;
    public final long f25972c;
    public final long d;

    public ps(at atVar, long j3, long j10, int i7) {
        this.f25970a = i7;
        this.f25971b = atVar;
        this.f25972c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f25970a) {
            case 0:
                at atVar = this.f25971b;
                atVar.G = this.f25972c;
                atVar.H = this.d;
                return;
            default:
                this.f25971b.o(this.f25972c, this.d);
                return;
        }
    }
}
