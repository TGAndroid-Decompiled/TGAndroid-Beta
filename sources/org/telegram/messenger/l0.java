package org.telegram.messenger;
public final class l0 implements Runnable {
    public final int f18245a;
    public final long f18246b;
    public final long f18247c;
    public final long d;
    public final Object f18248e;

    public l0(long j3, long j10, long j11, org.telegram.ui.b5 b5Var) {
        this.f18245a = 2;
        this.f18246b = j3;
        this.f18247c = j10;
        this.d = j11;
        this.f18248e = b5Var;
    }

    @Override
    public final void run() {
        switch (this.f18245a) {
            case 0:
                ((BotGuardHelper) this.f18248e).lambda$openGuardBotWebApp$0(this.f18246b, this.f18247c, this.d);
                return;
            case 1:
                ((MediaDataController) this.f18248e).lambda$loadMusic$142(this.f18246b, this.f18247c, this.d);
                return;
            default:
                long j3 = this.f18246b;
                long j10 = this.f18247c;
                org.telegram.ui.z6.f43328n0 = Long.valueOf(j3 * j10);
                Long valueOf = Long.valueOf(this.d * j10);
                org.telegram.ui.z6.f43329o0 = valueOf;
                ((org.telegram.ui.b5) this.f18248e).run(org.telegram.ui.z6.f43328n0, valueOf);
                return;
        }
    }

    public l0(BaseController baseController, long j3, long j10, long j11, int i10) {
        this.f18245a = i10;
        this.f18248e = baseController;
        this.f18246b = j3;
        this.f18247c = j10;
        this.d = j11;
    }
}
