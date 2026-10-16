package org.telegram.messenger.voip;
public final class r0 implements Runnable {
    public final int f18548a;
    public final VoIPService f18549b;

    public r0(VoIPService voIPService, int i10) {
        this.f18548a = i10;
        this.f18549b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f18548a) {
            case 0:
                this.f18549b.destroyConverting();
                return;
            case 1:
                this.f18549b.lambda$updateConnectionState$82();
                return;
            default:
                this.f18549b.lambda$onConnectionStateChanged$118();
                return;
        }
    }
}
