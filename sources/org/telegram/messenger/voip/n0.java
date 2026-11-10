package org.telegram.messenger.voip;
public final class n0 implements Runnable {
    public final int f26159a;
    public final VoIPService f26160b;

    public n0(VoIPService voIPService, int i7) {
        this.f26159a = i7;
        this.f26160b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f26159a) {
            case 0:
                this.f26160b.destroyConverting();
                return;
            case 1:
                this.f26160b.lambda$updateConnectionState$82();
                return;
            default:
                this.f26160b.lambda$onConnectionStateChanged$118();
                return;
        }
    }
}
