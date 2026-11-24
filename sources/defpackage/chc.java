package defpackage;

import org.telegram.messenger.voip.VoIPService;
public final class chc implements Runnable {
    public final byte a;
    public final VoIPService b;
    public final int c;

    public chc(VoIPService voIPService, int i, byte b) {
        this.a = b;
        this.b = voIPService;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                VoIPService.k1(voIPService, i);
                return;
            case 1:
                VoIPService.t(voIPService, i);
                return;
            case 2:
                VoIPService.B(voIPService, i);
                return;
            case 3:
                VoIPService.C0(voIPService, i);
                return;
            case 4:
                VoIPService.r1(voIPService, i);
                return;
            default:
                VoIPService.Q0(voIPService, i);
                return;
        }
    }
}
