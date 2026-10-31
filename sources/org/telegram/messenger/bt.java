package org.telegram.messenger;
public final class bt implements Runnable {
    public final int f14823a;
    public final ot f14824b;
    public final long f14825c;
    public final long d;

    public bt(ot otVar, long j10, long j11, int i10) {
        this.f14823a = i10;
        this.f14824b = otVar;
        this.f14825c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f14823a) {
            case 0:
                ot otVar = this.f14824b;
                otVar.F = this.f14825c;
                otVar.G = this.d;
                return;
            default:
                this.f14824b.o(this.f14825c, this.d);
                return;
        }
    }
}
