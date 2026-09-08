package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements Runnable {
    public final int f19418a;
    public final Object f19419b;
    public final Object f19420c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i10) {
        this.f19418a = i10;
        this.f19419b = obj;
        this.f19420c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f19418a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f19419b, (File) this.f19420c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f19419b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f19420c, (String) this.d);
                return;
        }
    }
}
