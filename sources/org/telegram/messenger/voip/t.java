package org.telegram.messenger.voip;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class t implements RequestDelegate {

    public final int f21972a;

    public final Object f21973b;

    public t(Object obj, int i10) {
        this.f21972a = i10;
        this.f21973b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21972a) {
            case 0:
                ((VoIPService) this.f21973b).lambda$hangUp$4(tLObject, tL_error);
                break;
            case 1:
                ((VoIPService) this.f21973b).lambda$hangUp$5(tLObject, tL_error);
                break;
            case 2:
                ((VoIPService) this.f21973b).lambda$startOutgoingCall$7(tLObject, tL_error);
                break;
            case 3:
                ((VoIPService) this.f21973b).lambda$startGroupCheckShortpoll$62(tLObject, tL_error);
                break;
            case 4:
                ((VoIPService) this.f21973b).lambda$declineIncomingCall$105(tLObject, tL_error);
                break;
            case 5:
                ((VoIPService) this.f21973b).lambda$processAcceptedCall$20(tLObject, tL_error);
                break;
            case 6:
                ((VoIPService) this.f21973b).lambda$startGroupCall$23(tLObject, tL_error);
                break;
            case 7:
                ((VoIPService) this.f21973b).lambda$stopScreenCapture$15(tLObject, tL_error);
                break;
            case 8:
                ((VoIPService) this.f21973b).lambda$acceptIncomingCall$102(tLObject, tL_error);
                break;
            default:
                VoIPService.lambda$updateServerConfig$107((SharedPreferences) this.f21973b, tLObject, tL_error);
                break;
        }
    }
}
