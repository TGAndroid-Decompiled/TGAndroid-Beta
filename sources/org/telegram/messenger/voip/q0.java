package org.telegram.messenger.voip;
public final class q0 implements Runnable {
    public final int f19608a;
    public final VoIPService f19609b;

    public q0(VoIPService voIPService, int i10) {
        this.f19608a = i10;
        this.f19609b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19608a) {
            case 0:
                VoIPService.k0(this.f19609b);
                return;
            case 1:
                VoIPService.L(this.f19609b);
                return;
            default:
                VoIPService.o1(this.f19609b);
                return;
        }
    }
}
