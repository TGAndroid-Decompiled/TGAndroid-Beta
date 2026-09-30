package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements Runnable {
    public final int f17952a;
    public final Object f17953b;
    public final Object f17954c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i10) {
        this.f17952a = i10;
        this.f17953b = obj;
        this.f17954c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17952a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f17953b, (File) this.f17954c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f17953b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f17954c, (String) this.d);
                return;
        }
    }
}
