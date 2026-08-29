package org.telegram.messenger;
public final class l0 implements Runnable {
    public final int f20805a;
    public final long f20806b;
    public final long f20807c;
    public final long d;
    public final Object f20808e;

    public l0(long j10, long j11, long j12, org.telegram.ui.b5 b5Var) {
        this.f20805a = 2;
        this.f20806b = j10;
        this.f20807c = j11;
        this.d = j12;
        this.f20808e = b5Var;
    }

    @Override
    public final void run() {
        switch (this.f20805a) {
            case 0:
                ((BotGuardHelper) this.f20808e).lambda$openGuardBotWebApp$0(this.f20806b, this.f20807c, this.d);
                return;
            case 1:
                ((MediaDataController) this.f20808e).lambda$loadMusic$142(this.f20806b, this.f20807c, this.d);
                return;
            default:
                long j10 = this.f20806b;
                long j11 = this.f20807c;
                org.telegram.ui.x6.f44481j0 = Long.valueOf(j10 * j11);
                Long valueOf = Long.valueOf(this.d * j11);
                org.telegram.ui.x6.f44482k0 = valueOf;
                ((org.telegram.ui.b5) this.f20808e).run(org.telegram.ui.x6.f44481j0, valueOf);
                return;
        }
    }

    public l0(BaseController baseController, long j10, long j11, long j12, int i10) {
        this.f20805a = i10;
        this.f20808e = baseController;
        this.f20806b = j10;
        this.f20807c = j11;
        this.d = j12;
    }
}
