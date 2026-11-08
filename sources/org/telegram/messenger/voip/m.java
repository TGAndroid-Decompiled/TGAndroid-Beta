package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements Runnable {
    public final int f26146a;
    public final Object f26147b;
    public final Object f26148c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i7) {
        this.f26146a = i7;
        this.f26147b = obj;
        this.f26148c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f26146a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f26147b, (File) this.f26148c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f26147b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f26148c, (String) this.d);
                return;
        }
    }
}
