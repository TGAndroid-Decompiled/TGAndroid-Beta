package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements RequestDelegate {
    public final int f26152a;
    public final Object f26153b;
    public final Object f26154c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i7) {
        this.f26152a = i7;
        this.f26153b = obj;
        this.f26154c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26152a) {
            case 0:
                ((VoIPDebugToSend) this.f26153b).lambda$done$3((VoIPDebugToSend.Data) this.f26154c, (TL_phone.saveCallDebug) this.d, tLObject, tL_error);
                return;
            case 1:
                ((GroupCallMessagesController) this.f26153b).lambda$sendCallMessage$5((e) this.f26154c, (GroupCallMessage) this.d, tLObject, tL_error);
                return;
            case 2:
                VoIPService.lambda$startConferenceGroupCall$49((ArrayList) this.f26153b, (ArrayList) this.f26154c, (w) this.d, tLObject, tL_error);
                return;
            case 3:
                ((VoIPService) this.f26153b).lambda$startConferenceGroupCall$45((TL_phone.PhoneCall) this.f26154c, (TL_phone.exportGroupCallInvite) this.d, tLObject, tL_error);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$41((ArrayList) this.f26153b, (ArrayList) this.f26154c, (w) this.d, tLObject, tL_error);
                return;
        }
    }
}
