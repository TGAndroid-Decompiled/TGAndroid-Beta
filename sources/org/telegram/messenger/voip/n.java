package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements Runnable {
    public final int f17691a;
    public final Object f17692b;
    public final Object f17693c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i10) {
        this.f17691a = i10;
        this.f17692b = obj;
        this.f17693c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17691a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f17692b, (File) this.f17693c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f17692b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f17693c, (String) this.d);
                return;
        }
    }
}
