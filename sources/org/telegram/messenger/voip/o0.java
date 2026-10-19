package org.telegram.messenger.voip;
public final class o0 implements Runnable {
    public final int f19897a;
    public final VoIPService f19898b;

    public o0(VoIPService voIPService, int i10) {
        this.f19897a = i10;
        this.f19898b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19897a) {
            case 0:
                VoIPService.k0(this.f19898b);
                return;
            case 1:
                this.f19898b.lambda$updateConnectionState$82();
                return;
            default:
                VoIPService.o1(this.f19898b);
                return;
        }
    }
}
