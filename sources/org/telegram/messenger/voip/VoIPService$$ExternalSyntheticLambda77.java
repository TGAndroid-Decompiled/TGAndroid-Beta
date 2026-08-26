package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

public final class VoIPService$$ExternalSyntheticLambda77 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public VoIPService$$ExternalSyntheticLambda77(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$41((ArrayList) this.f$0, (ArrayList) this.f$1, (VoIPService$$ExternalSyntheticLambda76) this.f$2, tLObject, tL_error);
                break;
            case 1:
                ((VoIPDebugToSend) this.f$0).lambda$done$3((VoIPDebugToSend.Data) this.f$1, (TL_phone.saveCallDebug) this.f$2, tLObject, tL_error);
                break;
            case 2:
                ((GroupCallMessagesController) this.f$0).lambda$sendCallMessage$5((GroupCallMessagesController$$ExternalSyntheticLambda0) this.f$1, (GroupCallMessage) this.f$2, tLObject, tL_error);
                break;
            case 3:
                VoIPService.lambda$startConferenceGroupCall$49((ArrayList) this.f$0, (ArrayList) this.f$1, (VoIPService$$ExternalSyntheticLambda76) this.f$2, tLObject, tL_error);
                break;
            default:
                ((VoIPService) this.f$0).lambda$startConferenceGroupCall$45((TL_phone.PhoneCall) this.f$1, (TL_phone.exportGroupCallInvite) this.f$2, tLObject, tL_error);
                break;
        }
    }
}
