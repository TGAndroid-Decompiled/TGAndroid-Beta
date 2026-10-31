package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class p implements RequestDelegate {
    public final int f18688a;
    public final Object f18689b;
    public final Object f18690c;
    public final Object d;

    public p(Object obj, Object obj2, Object obj3, int i10) {
        this.f18688a = i10;
        this.f18689b = obj;
        this.f18690c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18688a) {
            case 0:
                ((VoIPDebugToSend) this.f18689b).lambda$done$3((VoIPDebugToSend.Data) this.f18690c, (TL_phone.saveCallDebug) this.d, tLObject, tL_error);
                return;
            case 1:
                ((GroupCallMessagesController) this.f18689b).lambda$sendCallMessage$5((h) this.f18690c, (GroupCallMessage) this.d, tLObject, tL_error);
                return;
            case 2:
                VoIPService.lambda$startConferenceGroupCall$49((ArrayList) this.f18689b, (ArrayList) this.f18690c, (z) this.d, tLObject, tL_error);
                return;
            case 3:
                ((VoIPService) this.f18689b).lambda$startConferenceGroupCall$45((TL_phone.PhoneCall) this.f18690c, (TL_phone.exportGroupCallInvite) this.d, tLObject, tL_error);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$41((ArrayList) this.f18689b, (ArrayList) this.f18690c, (z) this.d, tLObject, tL_error);
                return;
        }
    }
}
