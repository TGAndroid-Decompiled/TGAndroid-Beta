package org.telegram.messenger.voip;
public final class p0 implements Runnable {
    public final int f17934a;
    public final VoIPService f17935b;

    public p0(VoIPService voIPService, int i10) {
        this.f17934a = i10;
        this.f17935b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f17934a) {
            case 0:
                this.f17935b.destroyConverting();
                return;
            case 1:
                this.f17935b.lambda$updateConnectionState$82();
                return;
            default:
                this.f17935b.lambda$updateConnectionState$83();
                return;
        }
    }
}
