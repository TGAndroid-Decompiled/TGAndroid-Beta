package org.telegram.messenger.voip;
public final class o0 implements Runnable {
    public final int f27627a;
    public final VoIPService f27628b;

    public o0(VoIPService voIPService, int i7) {
        this.f27627a = i7;
        this.f27628b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f27627a) {
            case 0:
                VoIPService.k0(this.f27628b);
                return;
            case 1:
                VoIPService.L(this.f27628b);
                return;
            default:
                VoIPService.o1(this.f27628b);
                return;
        }
    }
}
