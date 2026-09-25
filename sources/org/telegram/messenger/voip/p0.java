package org.telegram.messenger.voip;
public final class p0 implements Runnable {
    public final int f17938a;
    public final VoIPService f17939b;

    public p0(VoIPService voIPService, int i10) {
        this.f17938a = i10;
        this.f17939b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f17938a) {
            case 0:
                this.f17939b.destroyConverting();
                return;
            case 1:
                this.f17939b.lambda$updateConnectionState$82();
                return;
            default:
                this.f17939b.lambda$updateConnectionState$83();
                return;
        }
    }
}
