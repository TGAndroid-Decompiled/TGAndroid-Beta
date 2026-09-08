package org.telegram.messenger.voip;
public final class p0 implements Runnable {
    public final int f19431a;
    public final VoIPService f19432b;

    public p0(VoIPService voIPService, int i10) {
        this.f19431a = i10;
        this.f19432b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19431a) {
            case 0:
                this.f19432b.destroyConverting();
                return;
            case 1:
                this.f19432b.lambda$updateConnectionState$82();
                return;
            default:
                this.f19432b.lambda$updateConnectionState$83();
                return;
        }
    }
}
