package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements RequestDelegate {
    public final int f21915a;
    public final Object f21916b;
    public final Object f21917c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i9) {
        this.f21915a = i9;
        this.f21916b = obj;
        this.f21917c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21915a) {
            case 0:
                ((VoIPDebugToSend) this.f21916b).lambda$done$3((VoIPDebugToSend.Data) this.f21917c, (TL_phone.saveCallDebug) this.d, tLObject, tL_error);
                return;
            case 1:
                ((GroupCallMessagesController) this.f21916b).lambda$sendCallMessage$5((e) this.f21917c, (GroupCallMessage) this.d, tLObject, tL_error);
                return;
            case 2:
                VoIPService.lambda$startConferenceGroupCall$49((ArrayList) this.f21916b, (ArrayList) this.f21917c, (w) this.d, tLObject, tL_error);
                return;
            case 3:
                ((VoIPService) this.f21916b).lambda$startConferenceGroupCall$45((TL_phone.PhoneCall) this.f21917c, (TL_phone.exportGroupCallInvite) this.d, tLObject, tL_error);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$41((ArrayList) this.f21916b, (ArrayList) this.f21917c, (w) this.d, tLObject, tL_error);
                return;
        }
    }
}
