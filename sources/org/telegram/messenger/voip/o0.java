package org.telegram.messenger.voip;
public final class o0 implements Runnable {
    public final int f27559a;
    public final VoIPService f27560b;

    public o0(VoIPService voIPService, int i7) {
        this.f27559a = i7;
        this.f27560b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f27559a) {
            case 0:
                this.f27560b.destroyConverting();
                return;
            case 1:
                this.f27560b.lambda$updateConnectionState$82();
                return;
            default:
                this.f27560b.lambda$onConnectionStateChanged$118();
                return;
        }
    }
}
