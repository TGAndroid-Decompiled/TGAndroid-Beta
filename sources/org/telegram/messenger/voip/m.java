package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements Runnable {
    public final int f20436a;
    public final Object f20437b;
    public final Object f20438c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i10) {
        this.f20436a = i10;
        this.f20437b = obj;
        this.f20438c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f20436a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f20437b, (File) this.f20438c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f20437b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f20438c, (String) this.d);
                return;
        }
    }
}
