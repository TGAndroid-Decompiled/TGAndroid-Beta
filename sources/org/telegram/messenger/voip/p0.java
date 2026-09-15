package org.telegram.messenger.voip;
public final class p0 implements Runnable {
    public final int f17695a;
    public final VoIPService f17696b;

    public p0(VoIPService voIPService, int i10) {
        this.f17695a = i10;
        this.f17696b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f17695a) {
            case 0:
                this.f17696b.destroyConverting();
                return;
            case 1:
                this.f17696b.lambda$updateConnectionState$82();
                return;
            default:
                this.f17696b.lambda$updateConnectionState$83();
                return;
        }
    }
}
