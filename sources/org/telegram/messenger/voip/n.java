package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements Runnable {
    public final int f17925a;
    public final Object f17926b;
    public final Object f17927c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i10) {
        this.f17925a = i10;
        this.f17926b = obj;
        this.f17927c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17925a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f17926b, (File) this.f17927c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f17926b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f17927c, (String) this.d);
                return;
        }
    }
}
