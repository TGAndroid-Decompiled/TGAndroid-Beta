package org.telegram.messenger;
public final class m0 implements Runnable {
    public final int f19317a;
    public final long f19318b;
    public final long f19319c;
    public final long d;
    public final Object f19320e;

    public m0(long j10, long j11, long j12, org.telegram.ui.d5 d5Var) {
        this.f19317a = 2;
        this.f19318b = j10;
        this.f19319c = j11;
        this.d = j12;
        this.f19320e = d5Var;
    }

    @Override
    public final void run() {
        switch (this.f19317a) {
            case 0:
                ((BotGuardHelper) this.f19320e).lambda$openGuardBotWebApp$0(this.f19318b, this.f19319c, this.d);
                return;
            case 1:
                ((MediaDataController) this.f19320e).lambda$loadMusic$142(this.f19318b, this.f19319c, this.d);
                return;
            default:
                long j10 = this.f19318b;
                long j11 = this.f19319c;
                org.telegram.ui.b7.f35350k0 = Long.valueOf(j10 * j11);
                Long valueOf = Long.valueOf(this.d * j11);
                org.telegram.ui.b7.f35351l0 = valueOf;
                ((org.telegram.ui.d5) this.f19320e).run(org.telegram.ui.b7.f35350k0, valueOf);
                return;
        }
    }

    public m0(BaseController baseController, long j10, long j11, long j12, int i10) {
        this.f19317a = i10;
        this.f19320e = baseController;
        this.f19318b = j10;
        this.f19319c = j11;
        this.d = j12;
    }
}
