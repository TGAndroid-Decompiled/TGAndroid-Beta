package org.telegram.messenger.voip;
public final class o0 implements Runnable {
    public final int f27165a;
    public final VoIPService f27166b;

    public o0(VoIPService voIPService, int i7) {
        this.f27165a = i7;
        this.f27166b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f27165a) {
            case 0:
                VoIPService.k0(this.f27166b);
                return;
            case 1:
                this.f27166b.lambda$updateConnectionState$82();
                return;
            default:
                VoIPService.o1(this.f27166b);
                return;
        }
    }
}
