package org.telegram.messenger.voip;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t implements RequestDelegate {
    public final int f19932a;
    public final Object f19933b;

    public t(Object obj, int i10) {
        this.f19932a = i10;
        this.f19933b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19932a) {
            case 0:
                ((VoIPService) this.f19933b).lambda$hangUp$4(tLObject, tL_error);
                return;
            case 1:
                ((VoIPService) this.f19933b).lambda$hangUp$5(tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) this.f19933b).lambda$startOutgoingCall$7(tLObject, tL_error);
                return;
            case 3:
                ((VoIPService) this.f19933b).lambda$startGroupCheckShortpoll$62(tLObject, tL_error);
                return;
            case 4:
                ((VoIPService) this.f19933b).lambda$declineIncomingCall$105(tLObject, tL_error);
                return;
            case 5:
                ((VoIPService) this.f19933b).lambda$processAcceptedCall$20(tLObject, tL_error);
                return;
            case 6:
                ((VoIPService) this.f19933b).lambda$startGroupCall$23(tLObject, tL_error);
                return;
            case 7:
                ((VoIPService) this.f19933b).lambda$stopScreenCapture$15(tLObject, tL_error);
                return;
            case 8:
                ((VoIPService) this.f19933b).lambda$acceptIncomingCall$102(tLObject, tL_error);
                return;
            default:
                VoIPService.lambda$updateServerConfig$107((SharedPreferences) this.f19933b, tLObject, tL_error);
                return;
        }
    }
}
