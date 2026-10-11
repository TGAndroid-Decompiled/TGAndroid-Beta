package org.telegram.messenger;
public final class m0 implements Runnable {
    public final int f18473a;
    public final long f18474b;
    public final long f18475c;
    public final long d;
    public final Object f18476e;

    public m0(long j3, long j10, long j11, org.telegram.ui.a5 a5Var) {
        this.f18473a = 2;
        this.f18474b = j3;
        this.f18475c = j10;
        this.d = j11;
        this.f18476e = a5Var;
    }

    @Override
    public final void run() {
        switch (this.f18473a) {
            case 0:
                ((BotGuardHelper) this.f18476e).lambda$openGuardBotWebApp$0(this.f18474b, this.f18475c, this.d);
                return;
            case 1:
                ((MediaDataController) this.f18476e).lambda$loadMusic$142(this.f18474b, this.f18475c, this.d);
                return;
            default:
                long j3 = this.f18474b;
                long j10 = this.f18475c;
                org.telegram.ui.x6.f43971n0 = Long.valueOf(j3 * j10);
                Long valueOf = Long.valueOf(this.d * j10);
                org.telegram.ui.x6.f43972o0 = valueOf;
                ((org.telegram.ui.a5) this.f18476e).run(org.telegram.ui.x6.f43971n0, valueOf);
                return;
        }
    }

    public m0(BaseController baseController, long j3, long j10, long j11, int i10) {
        this.f18473a = i10;
        this.f18476e = baseController;
        this.f18474b = j3;
        this.f18475c = j10;
        this.d = j11;
    }
}
