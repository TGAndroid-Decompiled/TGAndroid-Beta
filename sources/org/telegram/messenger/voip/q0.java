package org.telegram.messenger.voip;
public final class q0 implements Runnable {
    public final int f19600a;
    public final VoIPService f19601b;

    public q0(VoIPService voIPService, int i10) {
        this.f19600a = i10;
        this.f19601b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19600a) {
            case 0:
                this.f19601b.destroyConverting();
                return;
            case 1:
                this.f19601b.lambda$updateConnectionState$82();
                return;
            default:
                this.f19601b.lambda$onConnectionStateChanged$118();
                return;
        }
    }
}
