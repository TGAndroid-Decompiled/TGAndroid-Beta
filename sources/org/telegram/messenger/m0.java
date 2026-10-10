package org.telegram.messenger;
public final class m0 implements Runnable {
    public final int f18475a;
    public final long f18476b;
    public final long f18477c;
    public final long d;
    public final Object f18478e;

    public m0(long j3, long j10, long j11, org.telegram.ui.b5 b5Var) {
        this.f18475a = 2;
        this.f18476b = j3;
        this.f18477c = j10;
        this.d = j11;
        this.f18478e = b5Var;
    }

    @Override
    public final void run() {
        switch (this.f18475a) {
            case 0:
                ((BotGuardHelper) this.f18478e).lambda$openGuardBotWebApp$0(this.f18476b, this.f18477c, this.d);
                return;
            case 1:
                ((MediaDataController) this.f18478e).lambda$loadMusic$142(this.f18476b, this.f18477c, this.d);
                return;
            default:
                long j3 = this.f18476b;
                long j10 = this.f18477c;
                org.telegram.ui.y6.f44289n0 = Long.valueOf(j3 * j10);
                Long valueOf = Long.valueOf(this.d * j10);
                org.telegram.ui.y6.f44290o0 = valueOf;
                ((org.telegram.ui.b5) this.f18478e).run(org.telegram.ui.y6.f44289n0, valueOf);
                return;
        }
    }

    public m0(BaseController baseController, long j3, long j10, long j11, int i10) {
        this.f18475a = i10;
        this.f18478e = baseController;
        this.f18476b = j3;
        this.f18477c = j10;
        this.d = j11;
    }
}
