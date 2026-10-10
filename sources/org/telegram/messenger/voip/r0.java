package org.telegram.messenger.voip;
public final class r0 implements Runnable {
    public final int f19621a;
    public final VoIPService f19622b;

    public r0(VoIPService voIPService, int i10) {
        this.f19621a = i10;
        this.f19622b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19621a) {
            case 0:
                this.f19622b.destroyConverting();
                return;
            case 1:
                this.f19622b.lambda$updateConnectionState$82();
                return;
            default:
                this.f19622b.lambda$onConnectionStateChanged$118();
                return;
        }
    }
}
