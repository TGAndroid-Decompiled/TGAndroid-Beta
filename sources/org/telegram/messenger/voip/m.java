package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements RequestDelegate {
    public final int f21979a;
    public final Object f21980b;
    public final Object f21981c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i10) {
        this.f21979a = i10;
        this.f21980b = obj;
        this.f21981c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21979a) {
            case 0:
                ((VoIPDebugToSend) this.f21980b).lambda$done$3((VoIPDebugToSend.Data) this.f21981c, (TL_phone.saveCallDebug) this.d, tLObject, tL_error);
                return;
            case 1:
                ((GroupCallMessagesController) this.f21980b).lambda$sendCallMessage$5((e) this.f21981c, (GroupCallMessage) this.d, tLObject, tL_error);
                return;
            case 2:
                VoIPService.lambda$startConferenceGroupCall$49((ArrayList) this.f21980b, (ArrayList) this.f21981c, (x) this.d, tLObject, tL_error);
                return;
            case 3:
                ((VoIPService) this.f21980b).lambda$startConferenceGroupCall$45((TL_phone.PhoneCall) this.f21981c, (TL_phone.exportGroupCallInvite) this.d, tLObject, tL_error);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$41((ArrayList) this.f21980b, (ArrayList) this.f21981c, (x) this.d, tLObject, tL_error);
                return;
        }
    }
}
