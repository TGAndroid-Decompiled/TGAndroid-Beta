package org.telegram.messenger.voip;
public final class p0 implements Runnable {
    public final int f19896a;
    public final VoIPService f19897b;

    public p0(VoIPService voIPService, int i10) {
        this.f19896a = i10;
        this.f19897b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19896a) {
            case 0:
                this.f19897b.destroyConverting();
                return;
            case 1:
                this.f19897b.lambda$updateConnectionState$82();
                return;
            default:
                this.f19897b.lambda$onConnectionStateChanged$118();
                return;
        }
    }
}
