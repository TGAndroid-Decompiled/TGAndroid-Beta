package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class o implements RequestDelegate {
    public final int f17912a;
    public final Object f17913b;
    public final Object f17914c;
    public final Object d;

    public o(Object obj, Object obj2, Object obj3, int i10) {
        this.f17912a = i10;
        this.f17913b = obj;
        this.f17914c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17912a) {
            case 0:
                ((VoIPDebugToSend) this.f17913b).lambda$done$3((VoIPDebugToSend.Data) this.f17914c, (TL_phone.saveCallDebug) this.d, tLObject, tL_error);
                return;
            case 1:
                ((GroupCallMessagesController) this.f17913b).lambda$sendCallMessage$5((g) this.f17914c, (GroupCallMessage) this.d, tLObject, tL_error);
                return;
            case 2:
                VoIPService.lambda$startConferenceGroupCall$49((ArrayList) this.f17913b, (ArrayList) this.f17914c, (y) this.d, tLObject, tL_error);
                return;
            case 3:
                ((VoIPService) this.f17913b).lambda$startConferenceGroupCall$45((TL_phone.PhoneCall) this.f17914c, (TL_phone.exportGroupCallInvite) this.d, tLObject, tL_error);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$41((ArrayList) this.f17913b, (ArrayList) this.f17914c, (y) this.d, tLObject, tL_error);
                return;
        }
    }
}
