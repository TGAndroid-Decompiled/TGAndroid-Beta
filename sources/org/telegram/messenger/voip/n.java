package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements Runnable {
    public final int f17919a;
    public final Object f17920b;
    public final Object f17921c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i10) {
        this.f17919a = i10;
        this.f17920b = obj;
        this.f17921c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17919a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f17920b, (File) this.f17921c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f17920b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f17921c, (String) this.d);
                return;
        }
    }
}
