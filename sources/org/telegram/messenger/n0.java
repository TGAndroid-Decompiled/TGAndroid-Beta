package org.telegram.messenger;
public final class n0 implements Runnable {
    public final int f19015a;
    public final long f19016b;
    public final long f19017c;
    public final long d;
    public final Object e;

    public n0(long j10, long j11, long j12, org.telegram.ui.g5 g5Var) {
        this.f19015a = 2;
        this.f19016b = j10;
        this.f19017c = j11;
        this.d = j12;
        this.e = g5Var;
    }

    @Override
    public final void run() {
        switch (this.f19015a) {
            case 0:
                ((BotGuardHelper) this.e).lambda$openGuardBotWebApp$0(this.f19016b, this.f19017c, this.d);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$loadMusic$142(this.f19016b, this.f19017c, this.d);
                return;
            default:
                long j10 = this.f19016b;
                long j11 = this.f19017c;
                org.telegram.ui.c7.f35838n0 = Long.valueOf(j10 * j11);
                Long valueOf = Long.valueOf(this.d * j11);
                org.telegram.ui.c7.f35839o0 = valueOf;
                ((org.telegram.ui.g5) this.e).run(org.telegram.ui.c7.f35838n0, valueOf);
                return;
        }
    }

    public n0(BaseController baseController, long j10, long j11, long j12, int i10) {
        this.f19015a = i10;
        this.e = baseController;
        this.f19016b = j10;
        this.f19017c = j11;
        this.d = j12;
    }
}
