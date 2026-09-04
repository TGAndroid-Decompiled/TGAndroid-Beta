package org.telegram.messenger.voip;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v implements RequestDelegate {
    public final int f19428a;
    public final Object f19429b;

    public v(Object obj, int i10) {
        this.f19428a = i10;
        this.f19429b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19428a) {
            case 0:
                ((VoIPService) this.f19429b).lambda$hangUp$4(tLObject, tL_error);
                return;
            case 1:
                ((VoIPService) this.f19429b).lambda$hangUp$5(tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) this.f19429b).lambda$startOutgoingCall$7(tLObject, tL_error);
                return;
            case 3:
                ((VoIPService) this.f19429b).lambda$startGroupCheckShortpoll$62(tLObject, tL_error);
                return;
            case 4:
                ((VoIPService) this.f19429b).lambda$declineIncomingCall$105(tLObject, tL_error);
                return;
            case 5:
                ((VoIPService) this.f19429b).lambda$processAcceptedCall$20(tLObject, tL_error);
                return;
            case 6:
                ((VoIPService) this.f19429b).lambda$startGroupCall$23(tLObject, tL_error);
                return;
            case 7:
                ((VoIPService) this.f19429b).lambda$stopScreenCapture$15(tLObject, tL_error);
                return;
            case 8:
                ((VoIPService) this.f19429b).lambda$acceptIncomingCall$102(tLObject, tL_error);
                return;
            default:
                VoIPService.lambda$updateServerConfig$107((SharedPreferences) this.f19429b, tLObject, tL_error);
                return;
        }
    }
}
