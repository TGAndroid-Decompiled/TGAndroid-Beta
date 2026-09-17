package org.telegram.messenger;
public final class l0 implements Runnable {
    public final int f18265a;
    public final long f18266b;
    public final long f18267c;
    public final long d;
    public final Object f18268e;

    public l0(long j3, long j10, long j11, org.telegram.ui.b5 b5Var) {
        this.f18265a = 2;
        this.f18266b = j3;
        this.f18267c = j10;
        this.d = j11;
        this.f18268e = b5Var;
    }

    @Override
    public final void run() {
        switch (this.f18265a) {
            case 0:
                ((BotGuardHelper) this.f18268e).lambda$openGuardBotWebApp$0(this.f18266b, this.f18267c, this.d);
                return;
            case 1:
                ((MediaDataController) this.f18268e).lambda$loadMusic$142(this.f18266b, this.f18267c, this.d);
                return;
            default:
                long j3 = this.f18266b;
                long j10 = this.f18267c;
                org.telegram.ui.z6.f43329n0 = Long.valueOf(j3 * j10);
                Long valueOf = Long.valueOf(this.d * j10);
                org.telegram.ui.z6.f43330o0 = valueOf;
                ((org.telegram.ui.b5) this.f18268e).run(org.telegram.ui.z6.f43329n0, valueOf);
                return;
        }
    }

    public l0(BaseController baseController, long j3, long j10, long j11, int i10) {
        this.f18265a = i10;
        this.f18268e = baseController;
        this.f18266b = j3;
        this.f18267c = j10;
        this.d = j11;
    }
}
