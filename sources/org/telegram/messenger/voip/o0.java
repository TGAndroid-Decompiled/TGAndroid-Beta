package org.telegram.messenger.voip;
public final class o0 implements Runnable {
    public final int f19980a;
    public final VoIPService f19981b;

    public o0(VoIPService voIPService, int i10) {
        this.f19980a = i10;
        this.f19981b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19980a) {
            case 0:
                this.f19981b.destroyConverting();
                return;
            case 1:
                this.f19981b.lambda$updateConnectionState$82();
                return;
            default:
                this.f19981b.lambda$onConnectionStateChanged$118();
                return;
        }
    }
}
