package org.telegram.messenger;
public final class l0 implements Runnable {
    public final int f16636a;
    public final long f16637b;
    public final long f16638c;
    public final long d;
    public final Object e;

    public l0(long j3, long j10, long j11, org.telegram.ui.b5 b5Var) {
        this.f16636a = 2;
        this.f16637b = j3;
        this.f16638c = j10;
        this.d = j11;
        this.e = b5Var;
    }

    @Override
    public final void run() {
        switch (this.f16636a) {
            case 0:
                ((BotGuardHelper) this.e).lambda$openGuardBotWebApp$0(this.f16637b, this.f16638c, this.d);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$loadMusic$142(this.f16637b, this.f16638c, this.d);
                return;
            default:
                long j3 = this.f16637b;
                long j10 = this.f16638c;
                org.telegram.ui.a7.f31730o0 = Long.valueOf(j3 * j10);
                Long valueOf = Long.valueOf(this.d * j10);
                org.telegram.ui.a7.f31731p0 = valueOf;
                ((org.telegram.ui.b5) this.e).run(org.telegram.ui.a7.f31730o0, valueOf);
                return;
        }
    }

    public l0(BaseController baseController, long j3, long j10, long j11, int i10) {
        this.f16636a = i10;
        this.e = baseController;
        this.f16637b = j3;
        this.f16638c = j10;
        this.d = j11;
    }
}
