package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class q implements RequestDelegate {
    public final int f16771a;
    public final Object f16772b;
    public final Object f16773c;
    public final Object d;

    public q(Object obj, Object obj2, Object obj3, int i10) {
        this.f16771a = i10;
        this.f16772b = obj;
        this.f16773c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16771a) {
            case 0:
                ((VoIPDebugToSend) this.f16772b).lambda$done$3((VoIPDebugToSend.Data) this.f16773c, (TL_phone.saveCallDebug) this.d, tLObject, tL_error);
                return;
            case 1:
                ((GroupCallMessagesController) this.f16772b).lambda$sendCallMessage$5((i) this.f16773c, (GroupCallMessage) this.d, tLObject, tL_error);
                return;
            case 2:
                VoIPService.lambda$startConferenceGroupCall$49((ArrayList) this.f16772b, (ArrayList) this.f16773c, (b0) this.d, tLObject, tL_error);
                return;
            case 3:
                ((VoIPService) this.f16772b).lambda$startConferenceGroupCall$45((TL_phone.PhoneCall) this.f16773c, (TL_phone.exportGroupCallInvite) this.d, tLObject, tL_error);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$41((ArrayList) this.f16772b, (ArrayList) this.f16773c, (b0) this.d, tLObject, tL_error);
                return;
        }
    }
}
