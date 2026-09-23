package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements Runnable {
    public final int f17666a;
    public final Object f17667b;
    public final Object f17668c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i10) {
        this.f17666a = i10;
        this.f17667b = obj;
        this.f17668c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17666a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f17667b, (File) this.f17668c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f17667b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f17668c, (String) this.d);
                return;
        }
    }
}
