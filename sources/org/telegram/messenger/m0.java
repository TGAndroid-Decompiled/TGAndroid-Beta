package org.telegram.messenger;
public final class m0 implements Runnable {
    public final int f20926a;
    public final long f20927b;
    public final long f20928c;
    public final long d;
    public final Object f20929e;

    public m0(long j10, long j11, long j12, org.telegram.ui.a5 a5Var) {
        this.f20926a = 2;
        this.f20927b = j10;
        this.f20928c = j11;
        this.d = j12;
        this.f20929e = a5Var;
    }

    @Override
    public final void run() {
        switch (this.f20926a) {
            case 0:
                ((BotGuardHelper) this.f20929e).lambda$openGuardBotWebApp$0(this.f20927b, this.f20928c, this.d);
                return;
            case 1:
                ((MediaDataController) this.f20929e).lambda$loadMusic$142(this.f20927b, this.f20928c, this.d);
                return;
            default:
                long j10 = this.f20927b;
                long j11 = this.f20928c;
                org.telegram.ui.y6.f44734j0 = Long.valueOf(j10 * j11);
                Long valueOf = Long.valueOf(this.d * j11);
                org.telegram.ui.y6.f44735k0 = valueOf;
                ((org.telegram.ui.a5) this.f20929e).run(org.telegram.ui.y6.f44734j0, valueOf);
                return;
        }
    }

    public m0(BaseController baseController, long j10, long j11, long j12, int i9) {
        this.f20926a = i9;
        this.f20929e = baseController;
        this.f20927b = j10;
        this.f20928c = j11;
        this.d = j12;
    }
}
