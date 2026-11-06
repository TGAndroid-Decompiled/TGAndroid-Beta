package org.telegram.messenger.voip;
public final class n0 implements Runnable {
    public final int f26141a;
    public final VoIPService f26142b;

    public n0(VoIPService voIPService, int i7) {
        this.f26141a = i7;
        this.f26142b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f26141a) {
            case 0:
                VoIPService.k0(this.f26142b);
                return;
            case 1:
                VoIPService.L(this.f26142b);
                return;
            default:
                VoIPService.o1(this.f26142b);
                return;
        }
    }
}
