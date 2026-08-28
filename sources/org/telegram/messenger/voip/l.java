package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class l implements Runnable {
    public final int f21909a;
    public final Object f21910b;
    public final Object f21911c;
    public final Object d;

    public l(Object obj, Object obj2, Object obj3, int i9) {
        this.f21909a = i9;
        this.f21910b = obj;
        this.f21911c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f21909a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f21910b, (File) this.f21911c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f21910b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f21911c, (String) this.d);
                return;
        }
    }
}
