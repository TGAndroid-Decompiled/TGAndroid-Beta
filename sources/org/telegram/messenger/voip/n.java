package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements Runnable {
    public final int f17934a;
    public final Object f17935b;
    public final Object f17936c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i10) {
        this.f17934a = i10;
        this.f17935b = obj;
        this.f17936c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17934a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f17935b, (File) this.f17936c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f17935b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f17936c, (String) this.d);
                return;
        }
    }
}
