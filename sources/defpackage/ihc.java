package defpackage;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ihc implements RequestDelegate {
    public final byte a;
    public final VoIPService b;

    public ihc(VoIPService voIPService, byte b) {
        this.a = b;
        this.b = voIPService;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$acceptIncomingCall$98(tLObject, tL_error);
                return;
            case 1:
                voIPService.lambda$startOutgoingCall$7(tLObject, tL_error);
                return;
            case 2:
                voIPService.lambda$declineIncomingCall$101(tLObject, tL_error);
                return;
            case 3:
                voIPService.lambda$processAcceptedCall$23(tLObject, tL_error);
                return;
            case 4:
                voIPService.lambda$startGroupCall$26(tLObject, tL_error);
                return;
            case 5:
                voIPService.lambda$stopScreenCapture$15(tLObject, tL_error);
                return;
            case 6:
                voIPService.lambda$hangUp$4(tLObject, tL_error);
                return;
            case 7:
                voIPService.lambda$hangUp$5(tLObject, tL_error);
                return;
            default:
                voIPService.lambda$startGroupCheckShortpoll$65(tLObject, tL_error);
                return;
        }
    }
}
