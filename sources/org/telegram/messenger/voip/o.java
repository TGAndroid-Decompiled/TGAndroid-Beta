package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class o implements Runnable {
    public final int f18842a;
    public final Object f18843b;
    public final Object f18844c;
    public final Object d;

    public o(Object obj, Object obj2, Object obj3, int i10) {
        this.f18842a = i10;
        this.f18843b = obj;
        this.f18844c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f18842a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f18843b, (File) this.f18844c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f18843b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f18844c, (String) this.d);
                return;
        }
    }
}
