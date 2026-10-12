package org.telegram.messenger.voip;
public final class q0 implements Runnable {
    public final int f19385a;
    public final VoIPService f19386b;

    public q0(VoIPService voIPService, int i10) {
        this.f19385a = i10;
        this.f19386b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19385a) {
            case 0:
                this.f19386b.destroyConverting();
                return;
            case 1:
                this.f19386b.lambda$updateConnectionState$82();
                return;
            default:
                this.f19386b.lambda$onConnectionStateChanged$118();
                return;
        }
    }
}
