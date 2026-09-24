package org.telegram.messenger;
public final class m0 implements Runnable {
    public final int f16954a;
    public final long f16955b;
    public final long f16956c;
    public final long d;
    public final Object e;

    public m0(long j3, long j10, long j11, org.telegram.ui.b5 b5Var) {
        this.f16954a = 2;
        this.f16955b = j3;
        this.f16956c = j10;
        this.d = j11;
        this.e = b5Var;
    }

    @Override
    public final void run() {
        switch (this.f16954a) {
            case 0:
                ((BotGuardHelper) this.e).lambda$openGuardBotWebApp$0(this.f16955b, this.f16956c, this.d);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$loadMusic$142(this.f16955b, this.f16956c, this.d);
                return;
            default:
                long j3 = this.f16955b;
                long j10 = this.f16956c;
                org.telegram.ui.z6.f40328n0 = Long.valueOf(j3 * j10);
                Long valueOf = Long.valueOf(this.d * j10);
                org.telegram.ui.z6.f40329o0 = valueOf;
                ((org.telegram.ui.b5) this.e).run(org.telegram.ui.z6.f40328n0, valueOf);
                return;
        }
    }

    public m0(BaseController baseController, long j3, long j10, long j11, int i10) {
        this.f16954a = i10;
        this.e = baseController;
        this.f16955b = j3;
        this.f16956c = j10;
        this.d = j11;
    }
}
