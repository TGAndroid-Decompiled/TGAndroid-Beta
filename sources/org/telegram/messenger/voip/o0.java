package org.telegram.messenger.voip;
public final class o0 implements Runnable {
    public final int f19900a;
    public final VoIPService f19901b;

    public o0(VoIPService voIPService, int i10) {
        this.f19900a = i10;
        this.f19901b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19900a) {
            case 0:
                VoIPService.k0(this.f19901b);
                return;
            case 1:
                VoIPService.L(this.f19901b);
                return;
            default:
                VoIPService.o1(this.f19901b);
                return;
        }
    }
}
