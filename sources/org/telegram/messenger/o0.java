package org.telegram.messenger;
public final class o0 implements Runnable {
    public final int f19087a;
    public final long f19088b;
    public final long f19089c;
    public final long d;
    public final Object e;

    public o0(long j10, long j11, long j12, org.telegram.ui.g5 g5Var) {
        this.f19087a = 2;
        this.f19088b = j10;
        this.f19089c = j11;
        this.d = j12;
        this.e = g5Var;
    }

    @Override
    public final void run() {
        switch (this.f19087a) {
            case 0:
                ((BotGuardHelper) this.e).lambda$openGuardBotWebApp$0(this.f19088b, this.f19089c, this.d);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$loadMusic$142(this.f19088b, this.f19089c, this.d);
                return;
            default:
                long j10 = this.f19088b;
                long j11 = this.f19089c;
                org.telegram.ui.c7.f35833n0 = Long.valueOf(j10 * j11);
                Long valueOf = Long.valueOf(this.d * j11);
                org.telegram.ui.c7.f35834o0 = valueOf;
                ((org.telegram.ui.g5) this.e).run(org.telegram.ui.c7.f35833n0, valueOf);
                return;
        }
    }

    public o0(BaseController baseController, long j10, long j11, long j12, int i10) {
        this.f19087a = i10;
        this.e = baseController;
        this.f19088b = j10;
        this.f19089c = j11;
        this.d = j12;
    }
}
