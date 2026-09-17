package org.telegram.messenger.voip;
public final class p0 implements Runnable {
    public final int f19445a;
    public final VoIPService f19446b;

    public p0(VoIPService voIPService, int i10) {
        this.f19445a = i10;
        this.f19446b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19445a) {
            case 0:
                this.f19446b.destroyConverting();
                return;
            case 1:
                this.f19446b.lambda$updateConnectionState$82();
                return;
            default:
                this.f19446b.lambda$updateConnectionState$83();
                return;
        }
    }
}
