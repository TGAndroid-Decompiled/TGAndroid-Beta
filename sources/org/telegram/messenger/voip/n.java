package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements Runnable {
    public final int f17936a;
    public final Object f17937b;
    public final Object f17938c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i10) {
        this.f17936a = i10;
        this.f17937b = obj;
        this.f17938c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17936a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f17937b, (File) this.f17938c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f17937b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f17938c, (String) this.d);
                return;
        }
    }
}
