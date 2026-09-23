package org.telegram.messenger.voip;
public final class p0 implements Runnable {
    public final int f17679a;
    public final VoIPService f17680b;

    public p0(VoIPService voIPService, int i10) {
        this.f17679a = i10;
        this.f17680b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f17679a) {
            case 0:
                this.f17680b.destroyConverting();
                return;
            case 1:
                this.f17680b.lambda$updateConnectionState$82();
                return;
            default:
                this.f17680b.lambda$updateConnectionState$83();
                return;
        }
    }
}
