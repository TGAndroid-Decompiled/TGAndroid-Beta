package org.telegram.messenger.voip;
public final class o0 implements Runnable {
    public final int f19975a;
    public final VoIPService f19976b;

    public o0(VoIPService voIPService, int i10) {
        this.f19975a = i10;
        this.f19976b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19975a) {
            case 0:
                VoIPService.k0(this.f19976b);
                return;
            case 1:
                VoIPService.L(this.f19976b);
                return;
            default:
                VoIPService.o1(this.f19976b);
                return;
        }
    }
}
