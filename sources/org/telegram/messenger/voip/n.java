package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements Runnable {
    public final int f17921a;
    public final Object f17922b;
    public final Object f17923c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i10) {
        this.f17921a = i10;
        this.f17922b = obj;
        this.f17923c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17921a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f17922b, (File) this.f17923c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f17922b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f17923c, (String) this.d);
                return;
        }
    }
}
