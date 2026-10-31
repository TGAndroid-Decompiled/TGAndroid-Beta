package org.telegram.messenger.voip;
public final class s0 implements Runnable {
    public final int f18701a;
    public final VoIPService f18702b;

    public s0(VoIPService voIPService, int i10) {
        this.f18701a = i10;
        this.f18702b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f18701a) {
            case 0:
                VoIPService.k0(this.f18702b);
                return;
            case 1:
                VoIPService.L(this.f18702b);
                return;
            default:
                VoIPService.o1(this.f18702b);
                return;
        }
    }
}
