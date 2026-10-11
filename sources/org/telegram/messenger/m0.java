package org.telegram.messenger;
public final class m0 implements Runnable {
    public final int f18509a;
    public final long f18510b;
    public final long f18511c;
    public final long d;
    public final Object f18512e;

    public m0(long j3, long j10, long j11, org.telegram.ui.a5 a5Var) {
        this.f18509a = 2;
        this.f18510b = j3;
        this.f18511c = j10;
        this.d = j11;
        this.f18512e = a5Var;
    }

    @Override
    public final void run() {
        switch (this.f18509a) {
            case 0:
                ((BotGuardHelper) this.f18512e).lambda$openGuardBotWebApp$0(this.f18510b, this.f18511c, this.d);
                return;
            case 1:
                ((MediaDataController) this.f18512e).lambda$loadMusic$142(this.f18510b, this.f18511c, this.d);
                return;
            default:
                long j3 = this.f18510b;
                long j10 = this.f18511c;
                org.telegram.ui.x6.f44005n0 = Long.valueOf(j3 * j10);
                Long valueOf = Long.valueOf(this.d * j10);
                org.telegram.ui.x6.f44006o0 = valueOf;
                ((org.telegram.ui.a5) this.f18512e).run(org.telegram.ui.x6.f44005n0, valueOf);
                return;
        }
    }

    public m0(BaseController baseController, long j3, long j10, long j11, int i10) {
        this.f18509a = i10;
        this.f18512e = baseController;
        this.f18510b = j3;
        this.f18511c = j10;
        this.d = j11;
    }
}
