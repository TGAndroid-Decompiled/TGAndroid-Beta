package org.telegram.messenger.voip;
public final class o0 implements Runnable {
    public final int f19891a;
    public final VoIPService f19892b;

    public o0(VoIPService voIPService, int i10) {
        this.f19891a = i10;
        this.f19892b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19891a) {
            case 0:
                this.f19892b.destroyConverting();
                return;
            case 1:
                this.f19892b.lambda$updateConnectionState$82();
                return;
            default:
                this.f19892b.lambda$onConnectionStateChanged$118();
                return;
        }
    }
}
