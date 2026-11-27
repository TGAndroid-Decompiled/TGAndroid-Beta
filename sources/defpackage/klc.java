package defpackage;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class klc implements Runnable {
    public final byte a;
    public final VoIPService b;
    public final TLRPC.TL_error c;

    public klc(VoIPService voIPService, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = voIPService;
        this.c = tL_error;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_error tL_error = this.c;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$startGroupCall$31(tL_error);
                return;
            case 1:
                voIPService.lambda$startScreenCapture$62(tL_error);
                return;
            default:
                voIPService.lambda$startGroupCall$25(tL_error);
                return;
        }
    }
}
