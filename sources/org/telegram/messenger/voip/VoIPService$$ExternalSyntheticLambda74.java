package org.telegram.messenger.voip;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class VoIPService$$ExternalSyntheticLambda74 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;

    public VoIPService$$ExternalSyntheticLambda74(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((VoIPService) this.f$0).lambda$startOutgoingCall$7(tLObject, tL_error);
                break;
            case 1:
                ((VoIPService) this.f$0).lambda$startGroupCall$23(tLObject, tL_error);
                break;
            case 2:
                ((VoIPService) this.f$0).lambda$stopScreenCapture$15(tLObject, tL_error);
                break;
            case 3:
                ((VoIPService) this.f$0).lambda$acceptIncomingCall$102(tLObject, tL_error);
                break;
            case 4:
                ((VoIPService) this.f$0).lambda$hangUp$4(tLObject, tL_error);
                break;
            case 5:
                ((VoIPService) this.f$0).lambda$hangUp$5(tLObject, tL_error);
                break;
            case 6:
                ((VoIPService) this.f$0).lambda$startGroupCheckShortpoll$62(tLObject, tL_error);
                break;
            case 7:
                ((VoIPService) this.f$0).lambda$declineIncomingCall$105(tLObject, tL_error);
                break;
            case 8:
                ((VoIPService) this.f$0).lambda$processAcceptedCall$20(tLObject, tL_error);
                break;
            default:
                VoIPService.lambda$updateServerConfig$107((SharedPreferences) this.f$0, tLObject, tL_error);
                break;
        }
    }
}
