package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements RequestDelegate {
    public final int f27158a;
    public final Object f27159b;
    public final Object f27160c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i7) {
        this.f27158a = i7;
        this.f27159b = obj;
        this.f27160c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27158a) {
            case 0:
                ((VoIPDebugToSend) this.f27159b).lambda$done$3((VoIPDebugToSend.Data) this.f27160c, (TL_phone.saveCallDebug) this.d, tLObject, tL_error);
                return;
            case 1:
                VoIPService.lambda$startConferenceGroupCall$49((ArrayList) this.f27159b, (ArrayList) this.f27160c, (x) this.d, tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) this.f27159b).lambda$startConferenceGroupCall$45((TL_phone.PhoneCall) this.f27160c, (TL_phone.exportGroupCallInvite) this.d, tLObject, tL_error);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$41((ArrayList) this.f27159b, (ArrayList) this.f27160c, (x) this.d, tLObject, tL_error);
                return;
        }
    }
}
