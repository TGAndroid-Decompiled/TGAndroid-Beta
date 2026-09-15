package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements Runnable {
    public final int f17682a;
    public final Object f17683b;
    public final Object f17684c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i10) {
        this.f17682a = i10;
        this.f17683b = obj;
        this.f17684c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17682a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f17683b, (File) this.f17684c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f17683b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f17684c, (String) this.d);
                return;
        }
    }
}
