package org.telegram.messenger;
public final class n0 implements Runnable {
    public final int f19067a;
    public final long f19068b;
    public final long f19069c;
    public final long d;
    public final Object e;

    public n0(long j10, long j11, long j12, org.telegram.ui.f5 f5Var) {
        this.f19067a = 2;
        this.f19068b = j10;
        this.f19069c = j11;
        this.d = j12;
        this.e = f5Var;
    }

    @Override
    public final void run() {
        switch (this.f19067a) {
            case 0:
                ((BotGuardHelper) this.e).lambda$openGuardBotWebApp$0(this.f19068b, this.f19069c, this.d);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$loadMusic$142(this.f19068b, this.f19069c, this.d);
                return;
            default:
                long j10 = this.f19068b;
                long j11 = this.f19069c;
                org.telegram.ui.c7.f36231n0 = Long.valueOf(j10 * j11);
                Long valueOf = Long.valueOf(this.d * j11);
                org.telegram.ui.c7.f36232o0 = valueOf;
                ((org.telegram.ui.f5) this.e).run(org.telegram.ui.c7.f36231n0, valueOf);
                return;
        }
    }

    public n0(BaseController baseController, long j10, long j11, long j12, int i10) {
        this.f19067a = i10;
        this.e = baseController;
        this.f19068b = j10;
        this.f19069c = j11;
        this.d = j12;
    }
}
