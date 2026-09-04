package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class o implements RequestDelegate {
    public final int f19397a;
    public final Object f19398b;
    public final Object f19399c;
    public final Object d;

    public o(Object obj, Object obj2, Object obj3, int i10) {
        this.f19397a = i10;
        this.f19398b = obj;
        this.f19399c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19397a) {
            case 0:
                ((VoIPDebugToSend) this.f19398b).lambda$done$3((VoIPDebugToSend.Data) this.f19399c, (TL_phone.saveCallDebug) this.d, tLObject, tL_error);
                return;
            case 1:
                ((GroupCallMessagesController) this.f19398b).lambda$sendCallMessage$5((g) this.f19399c, (GroupCallMessage) this.d, tLObject, tL_error);
                return;
            case 2:
                VoIPService.lambda$startConferenceGroupCall$49((ArrayList) this.f19398b, (ArrayList) this.f19399c, (y) this.d, tLObject, tL_error);
                return;
            case 3:
                ((VoIPService) this.f19398b).lambda$startConferenceGroupCall$45((TL_phone.PhoneCall) this.f19399c, (TL_phone.exportGroupCallInvite) this.d, tLObject, tL_error);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$41((ArrayList) this.f19398b, (ArrayList) this.f19399c, (y) this.d, tLObject, tL_error);
                return;
        }
    }
}
