package org.telegram.messenger.voip;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u implements RequestDelegate {
    public final int f22018a;
    public final Object f22019b;

    public u(Object obj, int i10) {
        this.f22018a = i10;
        this.f22019b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f22018a) {
            case 0:
                ((VoIPService) this.f22019b).lambda$hangUp$4(tLObject, tL_error);
                return;
            case 1:
                ((VoIPService) this.f22019b).lambda$hangUp$5(tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) this.f22019b).lambda$startOutgoingCall$7(tLObject, tL_error);
                return;
            case 3:
                ((VoIPService) this.f22019b).lambda$startGroupCheckShortpoll$62(tLObject, tL_error);
                return;
            case 4:
                ((VoIPService) this.f22019b).lambda$declineIncomingCall$105(tLObject, tL_error);
                return;
            case 5:
                ((VoIPService) this.f22019b).lambda$processAcceptedCall$20(tLObject, tL_error);
                return;
            case 6:
                ((VoIPService) this.f22019b).lambda$startGroupCall$23(tLObject, tL_error);
                return;
            case 7:
                ((VoIPService) this.f22019b).lambda$stopScreenCapture$15(tLObject, tL_error);
                return;
            case 8:
                ((VoIPService) this.f22019b).lambda$acceptIncomingCall$102(tLObject, tL_error);
                return;
            default:
                VoIPService.lambda$updateServerConfig$107((SharedPreferences) this.f22019b, tLObject, tL_error);
                return;
        }
    }
}
