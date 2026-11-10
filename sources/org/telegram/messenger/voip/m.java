package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements Runnable {
    public final int f26150a;
    public final Object f26151b;
    public final Object f26152c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i7) {
        this.f26150a = i7;
        this.f26151b = obj;
        this.f26152c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f26150a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f26151b, (File) this.f26152c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f26151b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f26152c, (String) this.d);
                return;
        }
    }
}
