package org.telegram.messenger.voip;
public final class q0 implements Runnable {
    public final int f19644a;
    public final VoIPService f19645b;

    public q0(VoIPService voIPService, int i10) {
        this.f19644a = i10;
        this.f19645b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19644a) {
            case 0:
                VoIPService.k0(this.f19645b);
                return;
            case 1:
                VoIPService.L(this.f19645b);
                return;
            default:
                VoIPService.o1(this.f19645b);
                return;
        }
    }
}
