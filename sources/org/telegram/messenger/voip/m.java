package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements RequestDelegate {
    public final int f26031a;
    public final Object f26032b;
    public final Object f26033c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i3) {
        this.f26031a = i3;
        this.f26032b = obj;
        this.f26033c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26031a) {
            case 0:
                ((VoIPDebugToSend) this.f26032b).lambda$done$3((VoIPDebugToSend.Data) this.f26033c, (TL_phone.saveCallDebug) this.d, tLObject, tL_error);
                return;
            case 1:
                ((GroupCallMessagesController) this.f26032b).lambda$sendCallMessage$5((e) this.f26033c, (GroupCallMessage) this.d, tLObject, tL_error);
                return;
            case 2:
                VoIPService.lambda$startConferenceGroupCall$49((ArrayList) this.f26032b, (ArrayList) this.f26033c, (v) this.d, tLObject, tL_error);
                return;
            case 3:
                ((VoIPService) this.f26032b).lambda$startConferenceGroupCall$45((TL_phone.PhoneCall) this.f26033c, (TL_phone.exportGroupCallInvite) this.d, tLObject, tL_error);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$41((ArrayList) this.f26032b, (ArrayList) this.f26033c, (v) this.d, tLObject, tL_error);
                return;
        }
    }
}
