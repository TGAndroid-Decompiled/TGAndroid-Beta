package org.telegram.messenger;
public final class n0 implements Runnable {
    public final int f19019a;
    public final long f19020b;
    public final long f19021c;
    public final long d;
    public final Object e;

    public n0(long j10, long j11, long j12, org.telegram.ui.g5 g5Var) {
        this.f19019a = 2;
        this.f19020b = j10;
        this.f19021c = j11;
        this.d = j12;
        this.e = g5Var;
    }

    @Override
    public final void run() {
        switch (this.f19019a) {
            case 0:
                ((BotGuardHelper) this.e).lambda$openGuardBotWebApp$0(this.f19020b, this.f19021c, this.d);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$loadMusic$142(this.f19020b, this.f19021c, this.d);
                return;
            default:
                long j10 = this.f19020b;
                long j11 = this.f19021c;
                org.telegram.ui.c7.f35851n0 = Long.valueOf(j10 * j11);
                Long valueOf = Long.valueOf(this.d * j11);
                org.telegram.ui.c7.f35852o0 = valueOf;
                ((org.telegram.ui.g5) this.e).run(org.telegram.ui.c7.f35851n0, valueOf);
                return;
        }
    }

    public n0(BaseController baseController, long j10, long j11, long j12, int i10) {
        this.f19019a = i10;
        this.e = baseController;
        this.f19020b = j10;
        this.f19021c = j11;
        this.d = j12;
    }
}
