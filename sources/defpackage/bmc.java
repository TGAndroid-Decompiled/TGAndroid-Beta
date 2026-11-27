package defpackage;

import org.telegram.messenger.voip.VoIPService;
public final class bmc implements Runnable {
    public final byte a;
    public final VoIPService b;

    public bmc(VoIPService voIPService, byte b) {
        this.a = b;
        this.b = voIPService;
    }

    @Override
    public final void run() {
        byte b = this.a;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                VoIPService.z(voIPService);
                return;
            case 1:
                VoIPService.h(voIPService);
                return;
            case 2:
                VoIPService.e1(voIPService);
                return;
            case 3:
                VoIPService.r1(voIPService);
                return;
            case 4:
                VoIPService.H0(voIPService);
                return;
            default:
                VoIPService.m0(voIPService);
                return;
        }
    }
}
