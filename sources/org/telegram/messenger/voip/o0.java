package org.telegram.messenger.voip;
public final class o0 implements Runnable {
    public final int f27164a;
    public final VoIPService f27165b;

    public o0(VoIPService voIPService, int i7) {
        this.f27164a = i7;
        this.f27165b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f27164a) {
            case 0:
                this.f27165b.destroyConverting();
                return;
            case 1:
                this.f27165b.lambda$updateConnectionState$82();
                return;
            default:
                this.f27165b.lambda$onConnectionStateChanged$118();
                return;
        }
    }
}
