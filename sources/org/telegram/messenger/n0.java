package org.telegram.messenger;
public final class n0 implements Runnable {
    public final int f19016a;
    public final long f19017b;
    public final long f19018c;
    public final long d;
    public final Object e;

    public n0(long j10, long j11, long j12, org.telegram.ui.g5 g5Var) {
        this.f19016a = 2;
        this.f19017b = j10;
        this.f19018c = j11;
        this.d = j12;
        this.e = g5Var;
    }

    @Override
    public final void run() {
        switch (this.f19016a) {
            case 0:
                ((BotGuardHelper) this.e).lambda$openGuardBotWebApp$0(this.f19017b, this.f19018c, this.d);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$loadMusic$142(this.f19017b, this.f19018c, this.d);
                return;
            default:
                long j10 = this.f19017b;
                long j11 = this.f19018c;
                org.telegram.ui.c7.f35823n0 = Long.valueOf(j10 * j11);
                Long valueOf = Long.valueOf(this.d * j11);
                org.telegram.ui.c7.f35824o0 = valueOf;
                ((org.telegram.ui.g5) this.e).run(org.telegram.ui.c7.f35823n0, valueOf);
                return;
        }
    }

    public n0(BaseController baseController, long j10, long j11, long j12, int i10) {
        this.f19016a = i10;
        this.e = baseController;
        this.f19017b = j10;
        this.f19018c = j11;
        this.d = j12;
    }
}
