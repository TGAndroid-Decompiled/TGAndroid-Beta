package org.telegram.messenger.voip;
public final class p0 implements Runnable {
    public final int f19404a;
    public final VoIPService f19405b;

    public p0(VoIPService voIPService, int i10) {
        this.f19404a = i10;
        this.f19405b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19404a) {
            case 0:
                this.f19405b.destroyConverting();
                return;
            case 1:
                this.f19405b.lambda$updateConnectionState$82();
                return;
            default:
                this.f19405b.lambda$updateConnectionState$83();
                return;
        }
    }
}
