package defpackage;

import org.telegram.messenger.voip.VoIPService;
public final class ilc implements Runnable {
    public final byte a;
    public final VoIPService b;
    public final int c;

    public ilc(VoIPService voIPService, int i, byte b) {
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
                voIPService.lambda$startGroupCall$28(i);
                return;
            case 1:
                voIPService.lambda$onSignalBarCountChanged$119(i);
                return;
            case 2:
                voIPService.lambda$onConnectionStateChanged$116(i);
                return;
            case 3:
                voIPService.lambda$startConferenceGroupCall$39(i);
                return;
            case 4:
                voIPService.lambda$startScreenCapture$60(i);
                return;
            default:
                voIPService.lambda$updateConnectionState$78(i);
                return;
        }
    }
}
