package org.telegram.messenger.voip;
public final class p0 implements Runnable {
    public final int f17923a;
    public final VoIPService f17924b;

    public p0(VoIPService voIPService, int i10) {
        this.f17923a = i10;
        this.f17924b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f17923a) {
            case 0:
                this.f17924b.destroyConverting();
                return;
            case 1:
                this.f17924b.lambda$updateConnectionState$82();
                return;
            default:
                this.f17924b.lambda$updateConnectionState$83();
                return;
        }
    }
}
