package org.telegram.messenger;
public final class l0 implements Runnable {
    public final int f16627a;
    public final long f16628b;
    public final long f16629c;
    public final long d;
    public final Object e;

    public l0(long j3, long j10, long j11, org.telegram.ui.b5 b5Var) {
        this.f16627a = 2;
        this.f16628b = j3;
        this.f16629c = j10;
        this.d = j11;
        this.e = b5Var;
    }

    @Override
    public final void run() {
        switch (this.f16627a) {
            case 0:
                ((BotGuardHelper) this.e).lambda$openGuardBotWebApp$0(this.f16628b, this.f16629c, this.d);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$loadMusic$142(this.f16628b, this.f16629c, this.d);
                return;
            default:
                long j3 = this.f16628b;
                long j10 = this.f16629c;
                org.telegram.ui.z6.f40072n0 = Long.valueOf(j3 * j10);
                Long valueOf = Long.valueOf(this.d * j10);
                org.telegram.ui.z6.f40073o0 = valueOf;
                ((org.telegram.ui.b5) this.e).run(org.telegram.ui.z6.f40072n0, valueOf);
                return;
        }
    }

    public l0(BaseController baseController, long j3, long j10, long j11, int i10) {
        this.f16627a = i10;
        this.e = baseController;
        this.f16628b = j3;
        this.f16629c = j10;
        this.d = j11;
    }
}
