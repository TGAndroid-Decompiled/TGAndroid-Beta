package org.telegram.messenger;
public final class n0 implements Runnable {
    public final int f17908a;
    public final long f17909b;
    public final long f17910c;
    public final long d;
    public final Object e;

    public n0(long j10, long j11, long j12, org.telegram.ui.f5 f5Var) {
        this.f17908a = 2;
        this.f17909b = j10;
        this.f17910c = j11;
        this.d = j12;
        this.e = f5Var;
    }

    @Override
    public final void run() {
        switch (this.f17908a) {
            case 0:
                ((BotGuardHelper) this.e).lambda$openGuardBotWebApp$0(this.f17909b, this.f17910c, this.d);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$loadMusic$142(this.f17909b, this.f17910c, this.d);
                return;
            default:
                long j10 = this.f17909b;
                long j11 = this.f17910c;
                org.telegram.ui.d7.f35159n0 = Long.valueOf(j10 * j11);
                Long valueOf = Long.valueOf(this.d * j11);
                org.telegram.ui.d7.f35160o0 = valueOf;
                ((org.telegram.ui.f5) this.e).run(org.telegram.ui.d7.f35159n0, valueOf);
                return;
        }
    }

    public n0(BaseController baseController, long j10, long j11, long j12, int i10) {
        this.f17908a = i10;
        this.e = baseController;
        this.f17909b = j10;
        this.f17910c = j11;
        this.d = j12;
    }
}
