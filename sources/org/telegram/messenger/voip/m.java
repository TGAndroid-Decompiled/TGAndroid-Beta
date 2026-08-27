package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

public final class m implements RequestDelegate {

    public final int f21939a;

    public final Object f21940b;

    public final Object f21941c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i10) {
        this.f21939a = i10;
        this.f21940b = obj;
        this.f21941c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21939a) {
            case 0:
                ((VoIPDebugToSend) this.f21940b).lambda$done$3((VoIPDebugToSend.Data) this.f21941c, (TL_phone.saveCallDebug) this.d, tLObject, tL_error);
                break;
            case 1:
                ((GroupCallMessagesController) this.f21940b).lambda$sendCallMessage$5((e) this.f21941c, (GroupCallMessage) this.d, tLObject, tL_error);
                break;
            case 2:
                VoIPService.lambda$startConferenceGroupCall$49((ArrayList) this.f21940b, (ArrayList) this.f21941c, (w) this.d, tLObject, tL_error);
                break;
            case 3:
                ((VoIPService) this.f21940b).lambda$startConferenceGroupCall$45((TL_phone.PhoneCall) this.f21941c, (TL_phone.exportGroupCallInvite) this.d, tLObject, tL_error);
                break;
            default:
                VoIPService.lambda$startConferenceGroupCall$41((ArrayList) this.f21940b, (ArrayList) this.f21941c, (w) this.d, tLObject, tL_error);
                break;
        }
    }
}
