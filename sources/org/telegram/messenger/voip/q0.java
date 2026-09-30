package org.telegram.messenger.voip;
public final class q0 implements Runnable {
    public final int f17952a;
    public final VoIPService f17953b;

    public q0(VoIPService voIPService, int i10) {
        this.f17952a = i10;
        this.f17953b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f17952a) {
            case 0:
                this.f17953b.destroyConverting();
                return;
            case 1:
                this.f17953b.lambda$updateConnectionState$82();
                return;
            default:
                this.f17953b.lambda$onConnectionStateChanged$118();
                return;
        }
    }
}
