package org.telegram.messenger;
public final class o0 implements Runnable {
    public final int f19093a;
    public final long f19094b;
    public final long f19095c;
    public final long d;
    public final Object e;

    public o0(long j10, long j11, long j12, org.telegram.ui.g5 g5Var) {
        this.f19093a = 2;
        this.f19094b = j10;
        this.f19095c = j11;
        this.d = j12;
        this.e = g5Var;
    }

    @Override
    public final void run() {
        switch (this.f19093a) {
            case 0:
                ((BotGuardHelper) this.e).lambda$openGuardBotWebApp$0(this.f19094b, this.f19095c, this.d);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$loadMusic$142(this.f19094b, this.f19095c, this.d);
                return;
            default:
                long j10 = this.f19094b;
                long j11 = this.f19095c;
                org.telegram.ui.c7.f35834n0 = Long.valueOf(j10 * j11);
                Long valueOf = Long.valueOf(this.d * j11);
                org.telegram.ui.c7.f35835o0 = valueOf;
                ((org.telegram.ui.g5) this.e).run(org.telegram.ui.c7.f35834n0, valueOf);
                return;
        }
    }

    public o0(BaseController baseController, long j10, long j11, long j12, int i10) {
        this.f19093a = i10;
        this.e = baseController;
        this.f19094b = j10;
        this.f19095c = j11;
        this.d = j12;
    }
}
