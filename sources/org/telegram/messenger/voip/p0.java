package org.telegram.messenger.voip;
public final class p0 implements Runnable {
    public final int f17690a;
    public final VoIPService f17691b;

    public p0(VoIPService voIPService, int i10) {
        this.f17690a = i10;
        this.f17691b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f17690a) {
            case 0:
                this.f17691b.destroyConverting();
                return;
            case 1:
                this.f17691b.lambda$updateConnectionState$82();
                return;
            default:
                this.f17691b.lambda$updateConnectionState$83();
                return;
        }
    }
}
