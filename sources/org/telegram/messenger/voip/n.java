package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements Runnable {
    public final int f19588a;
    public final Object f19589b;
    public final Object f19590c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i10) {
        this.f19588a = i10;
        this.f19589b = obj;
        this.f19590c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f19588a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f19589b, (File) this.f19590c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f19589b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f19590c, (String) this.d);
                return;
        }
    }
}
