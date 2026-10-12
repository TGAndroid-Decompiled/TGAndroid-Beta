package org.telegram.messenger;
public final class n0 implements Runnable {
    public final int f18331a;
    public final long f18332b;
    public final long f18333c;
    public final long d;
    public final Object f18334e;

    public n0(long j3, long j10, long j11, org.telegram.ui.e5 e5Var) {
        this.f18331a = 2;
        this.f18332b = j3;
        this.f18333c = j10;
        this.d = j11;
        this.f18334e = e5Var;
    }

    @Override
    public final void run() {
        switch (this.f18331a) {
            case 0:
                ((BotGuardHelper) this.f18334e).lambda$openGuardBotWebApp$0(this.f18332b, this.f18333c, this.d);
                return;
            case 1:
                ((MediaDataController) this.f18334e).lambda$loadMusic$142(this.f18332b, this.f18333c, this.d);
                return;
            default:
                long j3 = this.f18332b;
                long j10 = this.f18333c;
                org.telegram.ui.b7.f36075n0 = Long.valueOf(j3 * j10);
                Long valueOf = Long.valueOf(this.d * j10);
                org.telegram.ui.b7.f36076o0 = valueOf;
                ((org.telegram.ui.e5) this.f18334e).run(org.telegram.ui.b7.f36075n0, valueOf);
                return;
        }
    }

    public n0(BaseController baseController, long j3, long j10, long j11, int i10) {
        this.f18331a = i10;
        this.f18334e = baseController;
        this.f18332b = j3;
        this.f18333c = j10;
        this.d = j11;
    }
}
