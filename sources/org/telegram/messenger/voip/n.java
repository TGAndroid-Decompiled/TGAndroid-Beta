package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements RequestDelegate {
    public final int f20442a;
    public final Object f20443b;
    public final Object f20444c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i10) {
        this.f20442a = i10;
        this.f20443b = obj;
        this.f20444c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20442a) {
            case 0:
                ((VoIPDebugToSend) this.f20443b).lambda$done$3((VoIPDebugToSend.Data) this.f20444c, (TL_phone.saveCallDebug) this.d, tLObject, tL_error);
                return;
            case 1:
                ((GroupCallMessagesController) this.f20443b).lambda$sendCallMessage$5((e) this.f20444c, (GroupCallMessage) this.d, tLObject, tL_error);
                return;
            case 2:
                VoIPService.lambda$startConferenceGroupCall$49((ArrayList) this.f20443b, (ArrayList) this.f20444c, (y) this.d, tLObject, tL_error);
                return;
            case 3:
                ((VoIPService) this.f20443b).lambda$startConferenceGroupCall$45((TL_phone.PhoneCall) this.f20444c, (TL_phone.exportGroupCallInvite) this.d, tLObject, tL_error);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$41((ArrayList) this.f20443b, (ArrayList) this.f20444c, (y) this.d, tLObject, tL_error);
                return;
        }
    }
}
