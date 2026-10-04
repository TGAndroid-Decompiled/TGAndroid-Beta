package org.telegram.messenger;
public final class m0 implements Runnable {
    public final int f18528a;
    public final long f18529b;
    public final long f18530c;
    public final long d;
    public final Object f18531e;

    public m0(long j3, long j10, long j11, org.telegram.ui.c5 c5Var) {
        this.f18528a = 2;
        this.f18529b = j3;
        this.f18530c = j10;
        this.d = j11;
        this.f18531e = c5Var;
    }

    @Override
    public final void run() {
        switch (this.f18528a) {
            case 0:
                ((BotGuardHelper) this.f18531e).lambda$openGuardBotWebApp$0(this.f18529b, this.f18530c, this.d);
                return;
            case 1:
                ((MediaDataController) this.f18531e).lambda$loadMusic$142(this.f18529b, this.f18530c, this.d);
                return;
            default:
                long j3 = this.f18529b;
                long j10 = this.f18530c;
                org.telegram.ui.a7.f34675p0 = Long.valueOf(j3 * j10);
                Long valueOf = Long.valueOf(this.d * j10);
                org.telegram.ui.a7.f34676q0 = valueOf;
                ((org.telegram.ui.c5) this.f18531e).run(org.telegram.ui.a7.f34675p0, valueOf);
                return;
        }
    }

    public m0(BaseController baseController, long j3, long j10, long j11, int i10) {
        this.f18528a = i10;
        this.f18531e = baseController;
        this.f18529b = j3;
        this.f18530c = j10;
        this.d = j11;
    }
}
