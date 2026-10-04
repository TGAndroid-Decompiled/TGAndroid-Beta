package org.telegram.messenger.voip;
public final class q0 implements Runnable {
    public final int f19607a;
    public final VoIPService f19608b;

    public q0(VoIPService voIPService, int i10) {
        this.f19607a = i10;
        this.f19608b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19607a) {
            case 0:
                this.f19608b.destroyConverting();
                return;
            case 1:
                this.f19608b.lambda$updateConnectionState$82();
                return;
            default:
                this.f19608b.lambda$onConnectionStateChanged$118();
                return;
        }
    }
}
