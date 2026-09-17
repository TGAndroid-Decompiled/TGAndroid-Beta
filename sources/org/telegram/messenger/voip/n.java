package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements Runnable {
    public final int f19432a;
    public final Object f19433b;
    public final Object f19434c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i10) {
        this.f19432a = i10;
        this.f19433b = obj;
        this.f19434c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f19432a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f19433b, (File) this.f19434c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f19433b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f19434c, (String) this.d);
                return;
        }
    }
}
