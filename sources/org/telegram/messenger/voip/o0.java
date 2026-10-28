package org.telegram.messenger.voip;
public final class o0 implements Runnable {
    public final int f21663a;
    public final VoIPService f21664b;

    public o0(VoIPService voIPService, int i10) {
        this.f21663a = i10;
        this.f21664b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f21663a) {
            case 0:
                VoIPService.k0(this.f21664b);
                return;
            case 1:
                VoIPService.L(this.f21664b);
                return;
            default:
                VoIPService.o1(this.f21664b);
                return;
        }
    }
}
