package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements Runnable {
    public final int f19589a;
    public final Object f19590b;
    public final Object f19591c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i10) {
        this.f19589a = i10;
        this.f19590b = obj;
        this.f19591c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f19589a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f19590b, (File) this.f19591c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f19590b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f19591c, (String) this.d);
                return;
        }
    }
}
