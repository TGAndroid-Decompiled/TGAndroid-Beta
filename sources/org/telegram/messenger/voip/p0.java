package org.telegram.messenger.voip;
public final class p0 implements Runnable {
    public final int f17965a;
    public final VoIPService f17966b;

    public p0(VoIPService voIPService, int i10) {
        this.f17965a = i10;
        this.f17966b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f17965a) {
            case 0:
                this.f17966b.destroyConverting();
                return;
            case 1:
                this.f17966b.lambda$updateConnectionState$82();
                return;
            default:
                this.f17966b.lambda$updateConnectionState$83();
                return;
        }
    }
}
