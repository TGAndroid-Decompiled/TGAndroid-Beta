package org.telegram.messenger.voip;
public final class o0 implements Runnable {
    public final int f27531a;
    public final VoIPService f27532b;

    public o0(VoIPService voIPService, int i7) {
        this.f27531a = i7;
        this.f27532b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f27531a) {
            case 0:
                VoIPService.k0(this.f27532b);
                return;
            case 1:
                VoIPService.L(this.f27532b);
                return;
            default:
                VoIPService.o1(this.f27532b);
                return;
        }
    }
}
