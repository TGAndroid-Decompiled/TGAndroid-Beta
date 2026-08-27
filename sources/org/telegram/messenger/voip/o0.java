package org.telegram.messenger.voip;

public final class o0 implements Runnable {

    public final int f21954a;

    public final VoIPService f21955b;

    public o0(VoIPService voIPService, int i10) {
        this.f21954a = i10;
        this.f21955b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f21954a) {
            case 0:
                this.f21955b.destroyConverting();
                break;
            case 1:
                this.f21955b.lambda$updateConnectionState$82();
                break;
            default:
                this.f21955b.lambda$updateConnectionState$83();
                break;
        }
    }
}
