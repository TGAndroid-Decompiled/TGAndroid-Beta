package org.telegram.messenger.voip;
public final class o0 implements Runnable {
    public final int f27533a;
    public final VoIPService f27534b;

    public o0(VoIPService voIPService, int i7) {
        this.f27533a = i7;
        this.f27534b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f27533a) {
            case 0:
                this.f27534b.destroyConverting();
                return;
            case 1:
                this.f27534b.lambda$updateConnectionState$82();
                return;
            default:
                this.f27534b.lambda$onConnectionStateChanged$118();
                return;
        }
    }
}
