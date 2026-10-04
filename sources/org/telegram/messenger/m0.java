package org.telegram.messenger;
public final class m0 implements Runnable {
    public final int f18529a;
    public final long f18530b;
    public final long f18531c;
    public final long d;
    public final Object f18532e;

    public m0(long j3, long j10, long j11, org.telegram.ui.c5 c5Var) {
        this.f18529a = 2;
        this.f18530b = j3;
        this.f18531c = j10;
        this.d = j11;
        this.f18532e = c5Var;
    }

    @Override
    public final void run() {
        switch (this.f18529a) {
            case 0:
                ((BotGuardHelper) this.f18532e).lambda$openGuardBotWebApp$0(this.f18530b, this.f18531c, this.d);
                return;
            case 1:
                ((MediaDataController) this.f18532e).lambda$loadMusic$142(this.f18530b, this.f18531c, this.d);
                return;
            default:
                long j3 = this.f18530b;
                long j10 = this.f18531c;
                org.telegram.ui.a7.f34676p0 = Long.valueOf(j3 * j10);
                Long valueOf = Long.valueOf(this.d * j10);
                org.telegram.ui.a7.f34677q0 = valueOf;
                ((org.telegram.ui.c5) this.f18532e).run(org.telegram.ui.a7.f34676p0, valueOf);
                return;
        }
    }

    public m0(BaseController baseController, long j3, long j10, long j11, int i10) {
        this.f18529a = i10;
        this.f18532e = baseController;
        this.f18530b = j3;
        this.f18531c = j10;
        this.d = j11;
    }
}
