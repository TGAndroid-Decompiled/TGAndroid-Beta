package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements Runnable {
    public final int f26140a;
    public final Object f26141b;
    public final Object f26142c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i7) {
        this.f26140a = i7;
        this.f26141b = obj;
        this.f26142c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f26140a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f26141b, (File) this.f26142c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f26141b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f26142c, (String) this.d);
                return;
        }
    }
}
