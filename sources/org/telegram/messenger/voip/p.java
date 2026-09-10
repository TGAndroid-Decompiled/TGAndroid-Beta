package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class p implements Runnable {
    public final int f16765a;
    public final Object f16766b;
    public final Object f16767c;
    public final Object d;

    public p(Object obj, Object obj2, Object obj3, int i10) {
        this.f16765a = i10;
        this.f16766b = obj;
        this.f16767c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f16765a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f16766b, (File) this.f16767c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f16766b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f16767c, (String) this.d);
                return;
        }
    }
}
