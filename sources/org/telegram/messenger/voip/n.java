package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements RequestDelegate {
    public final int f19973a;
    public final Object f19974b;
    public final Object f19975c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i10) {
        this.f19973a = i10;
        this.f19974b = obj;
        this.f19975c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19973a) {
            case 0:
                ((VoIPDebugToSend) this.f19974b).lambda$done$3((VoIPDebugToSend.Data) this.f19975c, (TL_phone.saveCallDebug) this.d, tLObject, tL_error);
                return;
            case 1:
                ((GroupCallMessagesController) this.f19974b).lambda$sendCallMessage$5((f) this.f19975c, (GroupCallMessage) this.d, tLObject, tL_error);
                return;
            case 2:
                VoIPService.lambda$startConferenceGroupCall$49((ArrayList) this.f19974b, (ArrayList) this.f19975c, (w) this.d, tLObject, tL_error);
                return;
            case 3:
                ((VoIPService) this.f19974b).lambda$startConferenceGroupCall$45((TL_phone.PhoneCall) this.f19975c, (TL_phone.exportGroupCallInvite) this.d, tLObject, tL_error);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$41((ArrayList) this.f19974b, (ArrayList) this.f19975c, (w) this.d, tLObject, tL_error);
                return;
        }
    }
}
