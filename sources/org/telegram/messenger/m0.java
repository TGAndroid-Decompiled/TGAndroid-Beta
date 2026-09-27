package org.telegram.messenger;
public final class m0 implements Runnable {
    public final int f16963a;
    public final long f16964b;
    public final long f16965c;
    public final long d;
    public final Object e;

    public m0(long j3, long j10, long j11, org.telegram.ui.d5 d5Var) {
        this.f16963a = 2;
        this.f16964b = j3;
        this.f16965c = j10;
        this.d = j11;
        this.e = d5Var;
    }

    @Override
    public final void run() {
        switch (this.f16963a) {
            case 0:
                ((BotGuardHelper) this.e).lambda$openGuardBotWebApp$0(this.f16964b, this.f16965c, this.d);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$loadMusic$142(this.f16964b, this.f16965c, this.d);
                return;
            default:
                long j3 = this.f16964b;
                long j10 = this.f16965c;
                org.telegram.ui.b7.f32253o0 = Long.valueOf(j3 * j10);
                Long valueOf = Long.valueOf(this.d * j10);
                org.telegram.ui.b7.f32254p0 = valueOf;
                ((org.telegram.ui.d5) this.e).run(org.telegram.ui.b7.f32253o0, valueOf);
                return;
        }
    }

    public m0(BaseController baseController, long j3, long j10, long j11, int i10) {
        this.f16963a = i10;
        this.e = baseController;
        this.f16964b = j3;
        this.f16965c = j10;
        this.d = j11;
    }
}
