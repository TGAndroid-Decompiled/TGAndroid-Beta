package org.telegram.messenger.voip;
public final class o0 implements Runnable {
    public final int f27486a;
    public final VoIPService f27487b;

    public o0(VoIPService voIPService, int i7) {
        this.f27486a = i7;
        this.f27487b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f27486a) {
            case 0:
                this.f27487b.destroyConverting();
                return;
            case 1:
                this.f27487b.lambda$updateConnectionState$82();
                return;
            default:
                this.f27487b.lambda$onConnectionStateChanged$118();
                return;
        }
    }
}
