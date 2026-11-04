package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class l implements Runnable {
    public final int f26025a;
    public final Object f26026b;
    public final Object f26027c;
    public final Object d;

    public l(Object obj, Object obj2, Object obj3, int i3) {
        this.f26025a = i3;
        this.f26026b = obj;
        this.f26027c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f26025a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f26026b, (File) this.f26027c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f26026b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f26027c, (String) this.d);
                return;
        }
    }
}
