package org.telegram.messenger.voip;
public final class o0 implements Runnable {
    public final int f19915a;
    public final VoIPService f19916b;

    public o0(VoIPService voIPService, int i10) {
        this.f19915a = i10;
        this.f19916b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19915a) {
            case 0:
                VoIPService.k0(this.f19916b);
                return;
            case 1:
                VoIPService.L(this.f19916b);
                return;
            default:
                VoIPService.o1(this.f19916b);
                return;
        }
    }
}
