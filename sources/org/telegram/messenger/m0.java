package org.telegram.messenger;
public final class m0 implements Runnable {
    public final int f18525a;
    public final long f18526b;
    public final long f18527c;
    public final long d;
    public final Object f18528e;

    public m0(long j3, long j10, long j11, org.telegram.ui.c5 c5Var) {
        this.f18525a = 2;
        this.f18526b = j3;
        this.f18527c = j10;
        this.d = j11;
        this.f18528e = c5Var;
    }

    @Override
    public final void run() {
        switch (this.f18525a) {
            case 0:
                ((BotGuardHelper) this.f18528e).lambda$openGuardBotWebApp$0(this.f18526b, this.f18527c, this.d);
                return;
            case 1:
                ((MediaDataController) this.f18528e).lambda$loadMusic$142(this.f18526b, this.f18527c, this.d);
                return;
            default:
                long j3 = this.f18526b;
                long j10 = this.f18527c;
                org.telegram.ui.a7.f34682p0 = Long.valueOf(j3 * j10);
                Long valueOf = Long.valueOf(this.d * j10);
                org.telegram.ui.a7.f34683q0 = valueOf;
                ((org.telegram.ui.c5) this.f18528e).run(org.telegram.ui.a7.f34682p0, valueOf);
                return;
        }
    }

    public m0(BaseController baseController, long j3, long j10, long j11, int i10) {
        this.f18525a = i10;
        this.f18528e = baseController;
        this.f18526b = j3;
        this.f18527c = j10;
        this.d = j11;
    }
}
