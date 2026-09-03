package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements Runnable {
    public final int f18787a;
    public final Object f18788b;
    public final Object f18789c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i10) {
        this.f18787a = i10;
        this.f18788b = obj;
        this.f18789c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f18787a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f18788b, (File) this.f18789c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f18788b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f18789c, (String) this.d);
                return;
        }
    }
}
