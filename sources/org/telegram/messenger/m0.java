package org.telegram.messenger;
public final class m0 implements Runnable {
    public final int f17782a;
    public final long f17783b;
    public final long f17784c;
    public final long d;
    public final Object e;

    public m0(long j10, long j11, long j12, org.telegram.ui.f5 f5Var) {
        this.f17782a = 2;
        this.f17783b = j10;
        this.f17784c = j11;
        this.d = j12;
        this.e = f5Var;
    }

    @Override
    public final void run() {
        switch (this.f17782a) {
            case 0:
                ((BotGuardHelper) this.e).lambda$openGuardBotWebApp$0(this.f17783b, this.f17784c, this.d);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$loadMusic$142(this.f17783b, this.f17784c, this.d);
                return;
            default:
                long j10 = this.f17783b;
                long j11 = this.f17784c;
                org.telegram.ui.d7.f33345k0 = Long.valueOf(j10 * j11);
                Long valueOf = Long.valueOf(this.d * j11);
                org.telegram.ui.d7.f33346l0 = valueOf;
                ((org.telegram.ui.f5) this.e).run(org.telegram.ui.d7.f33345k0, valueOf);
                return;
        }
    }

    public m0(BaseController baseController, long j10, long j11, long j12, int i10) {
        this.f17782a = i10;
        this.e = baseController;
        this.f17783b = j10;
        this.f17784c = j11;
        this.d = j12;
    }
}
