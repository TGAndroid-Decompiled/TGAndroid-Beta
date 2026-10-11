package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements Runnable {
    public final int f19627a;
    public final Object f19628b;
    public final Object f19629c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i10) {
        this.f19627a = i10;
        this.f19628b = obj;
        this.f19629c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f19627a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f19628b, (File) this.f19629c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f19628b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f19629c, (String) this.d);
                return;
        }
    }
}
