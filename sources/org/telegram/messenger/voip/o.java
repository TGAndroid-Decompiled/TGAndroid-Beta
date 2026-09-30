package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class o implements RequestDelegate {
    public final int f17958a;
    public final Object f17959b;
    public final Object f17960c;
    public final Object d;

    public o(Object obj, Object obj2, Object obj3, int i10) {
        this.f17958a = i10;
        this.f17959b = obj;
        this.f17960c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17958a) {
            case 0:
                ((VoIPDebugToSend) this.f17959b).lambda$done$3((VoIPDebugToSend.Data) this.f17960c, (TL_phone.saveCallDebug) this.d, tLObject, tL_error);
                return;
            case 1:
                ((GroupCallMessagesController) this.f17959b).lambda$sendCallMessage$5((g) this.f17960c, (GroupCallMessage) this.d, tLObject, tL_error);
                return;
            case 2:
                VoIPService.lambda$startConferenceGroupCall$49((ArrayList) this.f17959b, (ArrayList) this.f17960c, (y) this.d, tLObject, tL_error);
                return;
            case 3:
                ((VoIPService) this.f17959b).lambda$startConferenceGroupCall$45((TL_phone.PhoneCall) this.f17960c, (TL_phone.exportGroupCallInvite) this.d, tLObject, tL_error);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$41((ArrayList) this.f17959b, (ArrayList) this.f17960c, (y) this.d, tLObject, tL_error);
                return;
        }
    }
}
