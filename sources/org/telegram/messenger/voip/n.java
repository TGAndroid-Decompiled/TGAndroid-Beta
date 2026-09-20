package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements Runnable {
    public final int f17906a;
    public final Object f17907b;
    public final Object f17908c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i10) {
        this.f17906a = i10;
        this.f17907b = obj;
        this.f17908c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17906a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f17907b, (File) this.f17908c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f17907b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f17908c, (String) this.d);
                return;
        }
    }
}
