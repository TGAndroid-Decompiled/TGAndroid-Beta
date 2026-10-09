package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements Runnable {
    public final int f19591a;
    public final Object f19592b;
    public final Object f19593c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i10) {
        this.f19591a = i10;
        this.f19592b = obj;
        this.f19593c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f19591a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f19592b, (File) this.f19593c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f19592b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f19593c, (String) this.d);
                return;
        }
    }
}
