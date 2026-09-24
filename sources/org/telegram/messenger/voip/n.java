package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements Runnable {
    public final int f17910a;
    public final Object f17911b;
    public final Object f17912c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i10) {
        this.f17910a = i10;
        this.f17911b = obj;
        this.f17912c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17910a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f17911b, (File) this.f17912c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f17911b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f17912c, (String) this.d);
                return;
        }
    }
}
