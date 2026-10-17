package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements RequestDelegate {
    public final int f19885a;
    public final Object f19886b;
    public final Object f19887c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i10) {
        this.f19885a = i10;
        this.f19886b = obj;
        this.f19887c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19885a) {
            case 0:
                ((VoIPDebugToSend) this.f19886b).lambda$done$3((VoIPDebugToSend.Data) this.f19887c, (TL_phone.saveCallDebug) this.d, tLObject, tL_error);
                return;
            case 1:
                ((GroupCallMessagesController) this.f19886b).lambda$sendCallMessage$5((f) this.f19887c, (GroupCallMessage) this.d, tLObject, tL_error);
                return;
            case 2:
                VoIPService.lambda$startConferenceGroupCall$49((ArrayList) this.f19886b, (ArrayList) this.f19887c, (x) this.d, tLObject, tL_error);
                return;
            case 3:
                ((VoIPService) this.f19886b).lambda$startConferenceGroupCall$45((TL_phone.PhoneCall) this.f19887c, (TL_phone.exportGroupCallInvite) this.d, tLObject, tL_error);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$41((ArrayList) this.f19886b, (ArrayList) this.f19887c, (x) this.d, tLObject, tL_error);
                return;
        }
    }
}
