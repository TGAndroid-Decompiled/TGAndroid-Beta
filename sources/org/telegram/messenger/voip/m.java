package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements Runnable {
    public final int f26132a;
    public final Object f26133b;
    public final Object f26134c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i7) {
        this.f26132a = i7;
        this.f26133b = obj;
        this.f26134c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f26132a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f26133b, (File) this.f26134c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f26133b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f26134c, (String) this.d);
                return;
        }
    }
}
