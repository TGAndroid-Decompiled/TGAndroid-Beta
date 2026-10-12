package org.telegram.messenger.voip;
public final class r0 implements Runnable {
    public final int f18854a;
    public final VoIPService f18855b;

    public r0(VoIPService voIPService, int i10) {
        this.f18854a = i10;
        this.f18855b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f18854a) {
            case 0:
                VoIPService.k0(this.f18855b);
                return;
            case 1:
                VoIPService.L(this.f18855b);
                return;
            default:
                VoIPService.o1(this.f18855b);
                return;
        }
    }
}
