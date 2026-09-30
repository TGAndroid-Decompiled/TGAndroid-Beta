package org.telegram.messenger;
public final class m0 implements Runnable {
    public final int f16990a;
    public final long f16991b;
    public final long f16992c;
    public final long d;
    public final Object e;

    public m0(long j3, long j10, long j11, org.telegram.ui.b5 b5Var) {
        this.f16990a = 2;
        this.f16991b = j3;
        this.f16992c = j10;
        this.d = j11;
        this.e = b5Var;
    }

    @Override
    public final void run() {
        switch (this.f16990a) {
            case 0:
                ((BotGuardHelper) this.e).lambda$openGuardBotWebApp$0(this.f16991b, this.f16992c, this.d);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$loadMusic$142(this.f16991b, this.f16992c, this.d);
                return;
            default:
                long j3 = this.f16991b;
                long j10 = this.f16992c;
                org.telegram.ui.z6.f40454n0 = Long.valueOf(j3 * j10);
                Long valueOf = Long.valueOf(this.d * j10);
                org.telegram.ui.z6.f40455o0 = valueOf;
                ((org.telegram.ui.b5) this.e).run(org.telegram.ui.z6.f40454n0, valueOf);
                return;
        }
    }

    public m0(BaseController baseController, long j3, long j10, long j11, int i10) {
        this.f16990a = i10;
        this.e = baseController;
        this.f16991b = j3;
        this.f16992c = j10;
        this.d = j11;
    }
}
