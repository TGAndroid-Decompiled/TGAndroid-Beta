package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements Runnable {
    public final int f27475a;
    public final Object f27476b;
    public final Object f27477c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i7) {
        this.f27475a = i7;
        this.f27476b = obj;
        this.f27477c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f27475a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f27476b, (File) this.f27477c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f27476b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f27477c, (String) this.d);
                return;
        }
    }
}
