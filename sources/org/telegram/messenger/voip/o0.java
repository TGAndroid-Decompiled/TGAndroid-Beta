package org.telegram.messenger.voip;
public final class o0 implements Runnable {
    public final int f27522a;
    public final VoIPService f27523b;

    public o0(VoIPService voIPService, int i7) {
        this.f27522a = i7;
        this.f27523b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f27522a) {
            case 0:
                this.f27523b.destroyConverting();
                return;
            case 1:
                this.f27523b.lambda$updateConnectionState$82();
                return;
            default:
                this.f27523b.lambda$onConnectionStateChanged$118();
                return;
        }
    }
}
