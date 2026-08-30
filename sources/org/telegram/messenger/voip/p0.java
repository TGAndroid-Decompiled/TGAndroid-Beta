package org.telegram.messenger.voip;
public final class p0 implements Runnable {
    public final int f18823a;
    public final VoIPService f18824b;

    public p0(VoIPService voIPService, int i10) {
        this.f18823a = i10;
        this.f18824b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f18823a) {
            case 0:
                this.f18824b.destroyConverting();
                return;
            case 1:
                this.f18824b.lambda$updateConnectionState$82();
                return;
            default:
                this.f18824b.lambda$updateConnectionState$83();
                return;
        }
    }
}
