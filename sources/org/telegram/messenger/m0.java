package org.telegram.messenger;
public final class m0 implements Runnable {
    public final int f19319a;
    public final long f19320b;
    public final long f19321c;
    public final long d;
    public final Object f19322e;

    public m0(long j10, long j11, long j12, org.telegram.ui.d5 d5Var) {
        this.f19319a = 2;
        this.f19320b = j10;
        this.f19321c = j11;
        this.d = j12;
        this.f19322e = d5Var;
    }

    @Override
    public final void run() {
        switch (this.f19319a) {
            case 0:
                ((BotGuardHelper) this.f19322e).lambda$openGuardBotWebApp$0(this.f19320b, this.f19321c, this.d);
                return;
            case 1:
                ((MediaDataController) this.f19322e).lambda$loadMusic$142(this.f19320b, this.f19321c, this.d);
                return;
            default:
                long j10 = this.f19320b;
                long j11 = this.f19321c;
                org.telegram.ui.b7.f35372k0 = Long.valueOf(j10 * j11);
                Long valueOf = Long.valueOf(this.d * j11);
                org.telegram.ui.b7.f35373l0 = valueOf;
                ((org.telegram.ui.d5) this.f19322e).run(org.telegram.ui.b7.f35372k0, valueOf);
                return;
        }
    }

    public m0(BaseController baseController, long j10, long j11, long j12, int i10) {
        this.f19319a = i10;
        this.f19322e = baseController;
        this.f19320b = j10;
        this.f19321c = j11;
        this.d = j12;
    }
}
