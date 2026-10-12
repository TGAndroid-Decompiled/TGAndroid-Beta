package org.telegram.messenger.voip;
public final class q0 implements Runnable {
    public final int f19384a;
    public final VoIPService f19385b;

    public q0(VoIPService voIPService, int i10) {
        this.f19384a = i10;
        this.f19385b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19384a) {
            case 0:
                this.f19385b.destroyConverting();
                return;
            case 1:
                this.f19385b.lambda$updateConnectionState$82();
                return;
            default:
                this.f19385b.lambda$onConnectionStateChanged$118();
                return;
        }
    }
}
