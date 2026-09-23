package org.telegram.messenger;
public final class l0 implements Runnable {
    public final int f16616a;
    public final long f16617b;
    public final long f16618c;
    public final long d;
    public final Object e;

    public l0(long j3, long j10, long j11, org.telegram.ui.c5 c5Var) {
        this.f16616a = 2;
        this.f16617b = j3;
        this.f16618c = j10;
        this.d = j11;
        this.e = c5Var;
    }

    @Override
    public final void run() {
        switch (this.f16616a) {
            case 0:
                ((BotGuardHelper) this.e).lambda$openGuardBotWebApp$0(this.f16617b, this.f16618c, this.d);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$loadMusic$142(this.f16617b, this.f16618c, this.d);
                return;
            default:
                long j3 = this.f16617b;
                long j10 = this.f16618c;
                org.telegram.ui.z6.f39971n0 = Long.valueOf(j3 * j10);
                Long valueOf = Long.valueOf(this.d * j10);
                org.telegram.ui.z6.f39972o0 = valueOf;
                ((org.telegram.ui.c5) this.e).run(org.telegram.ui.z6.f39971n0, valueOf);
                return;
        }
    }

    public l0(BaseController baseController, long j3, long j10, long j11, int i10) {
        this.f16616a = i10;
        this.e = baseController;
        this.f16617b = j3;
        this.f16618c = j10;
        this.d = j11;
    }
}
