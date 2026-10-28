package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class l implements Runnable {
    public final int f21649a;
    public final Object f21650b;
    public final Object f21651c;
    public final Object d;

    public l(Object obj, Object obj2, Object obj3, int i10) {
        this.f21649a = i10;
        this.f21650b = obj;
        this.f21651c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f21649a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f21650b, (File) this.f21651c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f21650b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f21651c, (String) this.d);
                return;
        }
    }
}
