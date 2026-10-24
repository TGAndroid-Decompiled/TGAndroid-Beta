package org.telegram.messenger.voip;
public final class o0 implements Runnable {
    public final int f19980a;
    public final VoIPService f19981b;

    public o0(VoIPService voIPService, int i10) {
        this.f19980a = i10;
        this.f19981b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19980a) {
            case 0:
                VoIPService.k0(this.f19981b);
                return;
            case 1:
                VoIPService.L(this.f19981b);
                return;
            default:
                VoIPService.o1(this.f19981b);
                return;
        }
    }
}
