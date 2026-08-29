package org.telegram.messenger.voip;
public final class o0 implements Runnable {
    public final int f21991a;
    public final VoIPService f21992b;

    public o0(VoIPService voIPService, int i10) {
        this.f21991a = i10;
        this.f21992b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f21991a) {
            case 0:
                this.f21992b.destroyConverting();
                return;
            case 1:
                this.f21992b.lambda$updateConnectionState$82();
                return;
            default:
                this.f21992b.lambda$updateConnectionState$83();
                return;
        }
    }
}
