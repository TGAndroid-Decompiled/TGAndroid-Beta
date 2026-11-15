package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements Runnable {
    public final int f27153a;
    public final Object f27154b;
    public final Object f27155c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i7) {
        this.f27153a = i7;
        this.f27154b = obj;
        this.f27155c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f27153a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f27154b, (File) this.f27155c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f27154b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f27155c, (String) this.d);
                return;
        }
    }
}
