package org.telegram.messenger;
public final class o0 implements Runnable {
    public final int f19098a;
    public final long f19099b;
    public final long f19100c;
    public final long d;
    public final Object e;

    public o0(long j10, long j11, long j12, org.telegram.ui.g5 g5Var) {
        this.f19098a = 2;
        this.f19099b = j10;
        this.f19100c = j11;
        this.d = j12;
        this.e = g5Var;
    }

    @Override
    public final void run() {
        switch (this.f19098a) {
            case 0:
                ((BotGuardHelper) this.e).lambda$openGuardBotWebApp$0(this.f19099b, this.f19100c, this.d);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$loadMusic$142(this.f19099b, this.f19100c, this.d);
                return;
            default:
                long j10 = this.f19099b;
                long j11 = this.f19100c;
                org.telegram.ui.c7.f35829n0 = Long.valueOf(j10 * j11);
                Long valueOf = Long.valueOf(this.d * j11);
                org.telegram.ui.c7.f35830o0 = valueOf;
                ((org.telegram.ui.g5) this.e).run(org.telegram.ui.c7.f35829n0, valueOf);
                return;
        }
    }

    public o0(BaseController baseController, long j10, long j11, long j12, int i10) {
        this.f19098a = i10;
        this.e = baseController;
        this.f19099b = j10;
        this.f19100c = j11;
        this.d = j12;
    }
}
