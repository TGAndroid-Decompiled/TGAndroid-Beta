package org.telegram.messenger.voip;
public final class n0 implements Runnable {
    public final int f26149a;
    public final VoIPService f26150b;

    public n0(VoIPService voIPService, int i7) {
        this.f26149a = i7;
        this.f26150b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f26149a) {
            case 0:
                VoIPService.k0(this.f26150b);
                return;
            case 1:
                VoIPService.L(this.f26150b);
                return;
            default:
                VoIPService.o1(this.f26150b);
                return;
        }
    }
}
