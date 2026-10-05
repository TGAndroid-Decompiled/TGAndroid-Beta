package org.telegram.messenger.voip;
public final class q0 implements Runnable {
    public final int f19605a;
    public final VoIPService f19606b;

    public q0(VoIPService voIPService, int i10) {
        this.f19605a = i10;
        this.f19606b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19605a) {
            case 0:
                this.f19606b.destroyConverting();
                return;
            case 1:
                this.f19606b.lambda$updateConnectionState$82();
                return;
            default:
                this.f19606b.lambda$onConnectionStateChanged$118();
                return;
        }
    }
}
