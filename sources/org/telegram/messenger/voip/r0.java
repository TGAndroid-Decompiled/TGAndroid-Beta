package org.telegram.messenger.voip;
public final class r0 implements Runnable {
    public final int f19617a;
    public final VoIPService f19618b;

    public r0(VoIPService voIPService, int i10) {
        this.f19617a = i10;
        this.f19618b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19617a) {
            case 0:
                this.f19618b.destroyConverting();
                return;
            case 1:
                this.f19618b.lambda$updateConnectionState$82();
                return;
            default:
                this.f19618b.lambda$onConnectionStateChanged$118();
                return;
        }
    }
}
