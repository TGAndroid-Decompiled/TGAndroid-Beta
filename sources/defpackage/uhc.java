package defpackage;

import org.telegram.messenger.voip.VoIPService;
public final class uhc implements Runnable {
    public final byte a;
    public final VoIPService b;

    public uhc(VoIPService voIPService, byte b) {
        this.a = b;
        this.b = voIPService;
    }

    @Override
    public final void run() {
        byte b = this.a;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$updateConnectionState$78();
                return;
            case 1:
                voIPService.lambda$updateConnectionState$79();
                return;
            case 2:
                voIPService.lambda$onConnectionStateChanged$113();
                return;
            case 3:
                voIPService.lambda$onConnectionStateChanged$114();
                return;
            default:
                voIPService.lambda$playConnectedSound$84();
                return;
        }
    }
}
