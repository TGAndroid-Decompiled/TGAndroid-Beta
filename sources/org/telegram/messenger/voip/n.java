package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements Runnable {
    public final int f17868a;
    public final Object f17869b;
    public final Object f17870c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i10) {
        this.f17868a = i10;
        this.f17869b = obj;
        this.f17870c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17868a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f17869b, (File) this.f17870c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f17869b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f17870c, (String) this.d);
                return;
        }
    }
}
