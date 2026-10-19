package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements RequestDelegate {
    public final int f19893a;
    public final Object f19894b;
    public final Object f19895c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i10) {
        this.f19893a = i10;
        this.f19894b = obj;
        this.f19895c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19893a) {
            case 0:
                ((VoIPDebugToSend) this.f19894b).lambda$done$3((VoIPDebugToSend.Data) this.f19895c, (TL_phone.saveCallDebug) this.d, tLObject, tL_error);
                return;
            case 1:
                ((GroupCallMessagesController) this.f19894b).lambda$sendCallMessage$5((f) this.f19895c, (GroupCallMessage) this.d, tLObject, tL_error);
                return;
            case 2:
                VoIPService.lambda$startConferenceGroupCall$49((ArrayList) this.f19894b, (ArrayList) this.f19895c, (w) this.d, tLObject, tL_error);
                return;
            case 3:
                ((VoIPService) this.f19894b).lambda$startConferenceGroupCall$45((TL_phone.PhoneCall) this.f19895c, (TL_phone.exportGroupCallInvite) this.d, tLObject, tL_error);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$41((ArrayList) this.f19894b, (ArrayList) this.f19895c, (w) this.d, tLObject, tL_error);
                return;
        }
    }
}
