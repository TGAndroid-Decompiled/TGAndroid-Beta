package org.telegram.messenger;
public final class q0 implements Runnable {
    public final int f21000a;
    public final long f21001b;
    public final long f21002c;
    public final long d;
    public final Object e;

    public q0(long j10, long j11, long j12, org.telegram.ui.e5 e5Var) {
        this.f21000a = 2;
        this.f21001b = j10;
        this.f21002c = j11;
        this.d = j12;
        this.e = e5Var;
    }

    @Override
    public final void run() {
        switch (this.f21000a) {
            case 0:
                ((BotGuardHelper) this.e).lambda$openGuardBotWebApp$0(this.f21001b, this.f21002c, this.d);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$loadMusic$142(this.f21001b, this.f21002c, this.d);
                return;
            default:
                long j10 = this.f21001b;
                long j11 = this.f21002c;
                org.telegram.ui.c7.f38187l0 = Long.valueOf(j10 * j11);
                Long valueOf = Long.valueOf(this.d * j11);
                org.telegram.ui.c7.m0 = valueOf;
                ((org.telegram.ui.e5) this.e).run(org.telegram.ui.c7.f38187l0, valueOf);
                return;
        }
    }

    public q0(BaseController baseController, long j10, long j11, long j12, int i10) {
        this.f21000a = i10;
        this.e = baseController;
        this.f21001b = j10;
        this.f21002c = j11;
        this.d = j12;
    }
}
