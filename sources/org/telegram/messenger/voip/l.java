package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class l implements Runnable {
    public final int f21973a;
    public final Object f21974b;
    public final Object f21975c;
    public final Object d;

    public l(Object obj, Object obj2, Object obj3, int i10) {
        this.f21973a = i10;
        this.f21974b = obj;
        this.f21975c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f21973a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f21974b, (File) this.f21975c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f21974b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f21975c, (String) this.d);
                return;
        }
    }
}
