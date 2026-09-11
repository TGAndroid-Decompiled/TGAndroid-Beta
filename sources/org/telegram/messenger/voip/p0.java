package org.telegram.messenger.voip;
public final class p0 implements Runnable {
    public final int f19418a;
    public final VoIPService f19419b;

    public p0(VoIPService voIPService, int i10) {
        this.f19418a = i10;
        this.f19419b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19418a) {
            case 0:
                this.f19419b.destroyConverting();
                return;
            case 1:
                this.f19419b.lambda$updateConnectionState$82();
                return;
            default:
                this.f19419b.lambda$updateConnectionState$83();
                return;
        }
    }
}
