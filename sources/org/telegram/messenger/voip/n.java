package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements Runnable {
    public final int f19405a;
    public final Object f19406b;
    public final Object f19407c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i10) {
        this.f19405a = i10;
        this.f19406b = obj;
        this.f19407c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f19405a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f19406b, (File) this.f19407c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f19406b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f19407c, (String) this.d);
                return;
        }
    }
}
