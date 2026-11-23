package org.telegram.messenger.voip;
public final class o0 implements Runnable {
    public final int f27522a;
    public final VoIPService f27523b;

    public o0(VoIPService voIPService, int i7) {
        this.f27522a = i7;
        this.f27523b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f27522a) {
            case 0:
                VoIPService.k0(this.f27523b);
                return;
            case 1:
                VoIPService.L(this.f27523b);
                return;
            default:
                VoIPService.o1(this.f27523b);
                return;
        }
    }
}
