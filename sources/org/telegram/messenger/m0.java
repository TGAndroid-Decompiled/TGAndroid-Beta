package org.telegram.messenger;
public final class m0 implements Runnable {
    public final int f18471a;
    public final long f18472b;
    public final long f18473c;
    public final long d;
    public final Object f18474e;

    public m0(long j3, long j10, long j11, org.telegram.ui.b5 b5Var) {
        this.f18471a = 2;
        this.f18472b = j3;
        this.f18473c = j10;
        this.d = j11;
        this.f18474e = b5Var;
    }

    @Override
    public final void run() {
        switch (this.f18471a) {
            case 0:
                ((BotGuardHelper) this.f18474e).lambda$openGuardBotWebApp$0(this.f18472b, this.f18473c, this.d);
                return;
            case 1:
                ((MediaDataController) this.f18474e).lambda$loadMusic$142(this.f18472b, this.f18473c, this.d);
                return;
            default:
                long j3 = this.f18472b;
                long j10 = this.f18473c;
                org.telegram.ui.y6.f44245n0 = Long.valueOf(j3 * j10);
                Long valueOf = Long.valueOf(this.d * j10);
                org.telegram.ui.y6.f44246o0 = valueOf;
                ((org.telegram.ui.b5) this.f18474e).run(org.telegram.ui.y6.f44245n0, valueOf);
                return;
        }
    }

    public m0(BaseController baseController, long j3, long j10, long j11, int i10) {
        this.f18471a = i10;
        this.f18474e = baseController;
        this.f18472b = j3;
        this.f18473c = j10;
        this.d = j11;
    }
}
