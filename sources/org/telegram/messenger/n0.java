package org.telegram.messenger;
public final class n0 implements Runnable {
    public final int f19078a;
    public final long f19079b;
    public final long f19080c;
    public final long d;
    public final Object e;

    public n0(long j10, long j11, long j12, org.telegram.ui.f5 f5Var) {
        this.f19078a = 2;
        this.f19079b = j10;
        this.f19080c = j11;
        this.d = j12;
        this.e = f5Var;
    }

    @Override
    public final void run() {
        switch (this.f19078a) {
            case 0:
                ((BotGuardHelper) this.e).lambda$openGuardBotWebApp$0(this.f19079b, this.f19080c, this.d);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$loadMusic$142(this.f19079b, this.f19080c, this.d);
                return;
            default:
                long j10 = this.f19079b;
                long j11 = this.f19080c;
                org.telegram.ui.c7.f36253n0 = Long.valueOf(j10 * j11);
                Long valueOf = Long.valueOf(this.d * j11);
                org.telegram.ui.c7.f36254o0 = valueOf;
                ((org.telegram.ui.f5) this.e).run(org.telegram.ui.c7.f36253n0, valueOf);
                return;
        }
    }

    public n0(BaseController baseController, long j10, long j11, long j12, int i10) {
        this.f19078a = i10;
        this.e = baseController;
        this.f19079b = j10;
        this.f19080c = j11;
        this.d = j12;
    }
}
