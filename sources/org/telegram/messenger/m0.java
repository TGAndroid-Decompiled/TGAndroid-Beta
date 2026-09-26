package org.telegram.messenger;
public final class m0 implements Runnable {
    public final int f16969a;
    public final long f16970b;
    public final long f16971c;
    public final long d;
    public final Object e;

    public m0(long j3, long j10, long j11, org.telegram.ui.b5 b5Var) {
        this.f16969a = 2;
        this.f16970b = j3;
        this.f16971c = j10;
        this.d = j11;
        this.e = b5Var;
    }

    @Override
    public final void run() {
        switch (this.f16969a) {
            case 0:
                ((BotGuardHelper) this.e).lambda$openGuardBotWebApp$0(this.f16970b, this.f16971c, this.d);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$loadMusic$142(this.f16970b, this.f16971c, this.d);
                return;
            default:
                long j3 = this.f16970b;
                long j10 = this.f16971c;
                org.telegram.ui.z6.f40343n0 = Long.valueOf(j3 * j10);
                Long valueOf = Long.valueOf(this.d * j10);
                org.telegram.ui.z6.f40344o0 = valueOf;
                ((org.telegram.ui.b5) this.e).run(org.telegram.ui.z6.f40343n0, valueOf);
                return;
        }
    }

    public m0(BaseController baseController, long j3, long j10, long j11, int i10) {
        this.f16969a = i10;
        this.e = baseController;
        this.f16970b = j3;
        this.f16971c = j10;
        this.d = j11;
    }
}
