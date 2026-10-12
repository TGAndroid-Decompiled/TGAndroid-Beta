package org.telegram.messenger;
public final class n0 implements Runnable {
    public final int f18332a;
    public final long f18333b;
    public final long f18334c;
    public final long d;
    public final Object f18335e;

    public n0(long j3, long j10, long j11, org.telegram.ui.e5 e5Var) {
        this.f18332a = 2;
        this.f18333b = j3;
        this.f18334c = j10;
        this.d = j11;
        this.f18335e = e5Var;
    }

    @Override
    public final void run() {
        switch (this.f18332a) {
            case 0:
                ((BotGuardHelper) this.f18335e).lambda$openGuardBotWebApp$0(this.f18333b, this.f18334c, this.d);
                return;
            case 1:
                ((MediaDataController) this.f18335e).lambda$loadMusic$142(this.f18333b, this.f18334c, this.d);
                return;
            default:
                long j3 = this.f18333b;
                long j10 = this.f18334c;
                org.telegram.ui.b7.f36077n0 = Long.valueOf(j3 * j10);
                Long valueOf = Long.valueOf(this.d * j10);
                org.telegram.ui.b7.f36078o0 = valueOf;
                ((org.telegram.ui.e5) this.f18335e).run(org.telegram.ui.b7.f36077n0, valueOf);
                return;
        }
    }

    public n0(BaseController baseController, long j3, long j10, long j11, int i10) {
        this.f18332a = i10;
        this.f18335e = baseController;
        this.f18333b = j3;
        this.f18334c = j10;
        this.d = j11;
    }
}
