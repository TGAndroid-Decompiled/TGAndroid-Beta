package org.telegram.messenger;
public final class m0 implements Runnable {
    public final int f18530a;
    public final long f18531b;
    public final long f18532c;
    public final long d;
    public final Object f18533e;

    public m0(long j3, long j10, long j11, org.telegram.ui.c5 c5Var) {
        this.f18530a = 2;
        this.f18531b = j3;
        this.f18532c = j10;
        this.d = j11;
        this.f18533e = c5Var;
    }

    @Override
    public final void run() {
        switch (this.f18530a) {
            case 0:
                ((BotGuardHelper) this.f18533e).lambda$openGuardBotWebApp$0(this.f18531b, this.f18532c, this.d);
                return;
            case 1:
                ((MediaDataController) this.f18533e).lambda$loadMusic$142(this.f18531b, this.f18532c, this.d);
                return;
            default:
                long j3 = this.f18531b;
                long j10 = this.f18532c;
                org.telegram.ui.a7.f34690p0 = Long.valueOf(j3 * j10);
                Long valueOf = Long.valueOf(this.d * j10);
                org.telegram.ui.a7.f34691q0 = valueOf;
                ((org.telegram.ui.c5) this.f18533e).run(org.telegram.ui.a7.f34690p0, valueOf);
                return;
        }
    }

    public m0(BaseController baseController, long j3, long j10, long j11, int i10) {
        this.f18530a = i10;
        this.f18533e = baseController;
        this.f18531b = j3;
        this.f18532c = j10;
        this.d = j11;
    }
}
