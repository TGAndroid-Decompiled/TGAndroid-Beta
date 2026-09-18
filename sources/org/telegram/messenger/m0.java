package org.telegram.messenger;
public final class m0 implements Runnable {
    public final int f16893a;
    public final long f16894b;
    public final long f16895c;
    public final long d;
    public final Object e;

    public m0(long j3, long j10, long j11, org.telegram.ui.b5 b5Var) {
        this.f16893a = 2;
        this.f16894b = j3;
        this.f16895c = j10;
        this.d = j11;
        this.e = b5Var;
    }

    @Override
    public final void run() {
        switch (this.f16893a) {
            case 0:
                ((BotGuardHelper) this.e).lambda$openGuardBotWebApp$0(this.f16894b, this.f16895c, this.d);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$loadMusic$142(this.f16894b, this.f16895c, this.d);
                return;
            default:
                long j3 = this.f16894b;
                long j10 = this.f16895c;
                org.telegram.ui.z6.f39980o0 = Long.valueOf(j3 * j10);
                Long valueOf = Long.valueOf(this.d * j10);
                org.telegram.ui.z6.f39981p0 = valueOf;
                ((org.telegram.ui.b5) this.e).run(org.telegram.ui.z6.f39980o0, valueOf);
                return;
        }
    }

    public m0(BaseController baseController, long j3, long j10, long j11, int i10) {
        this.f16893a = i10;
        this.e = baseController;
        this.f16894b = j3;
        this.f16895c = j10;
        this.d = j11;
    }
}
