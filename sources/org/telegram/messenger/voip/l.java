package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class l implements Runnable {
    public final int f21661a;
    public final Object f21662b;
    public final Object f21663c;
    public final Object d;

    public l(Object obj, Object obj2, Object obj3, int i10) {
        this.f21661a = i10;
        this.f21662b = obj;
        this.f21663c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f21661a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f21662b, (File) this.f21663c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f21662b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f21663c, (String) this.d);
                return;
        }
    }
}
