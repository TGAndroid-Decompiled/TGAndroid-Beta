package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements Runnable {
    public final int f19883a;
    public final Object f19884b;
    public final Object f19885c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i10) {
        this.f19883a = i10;
        this.f19884b = obj;
        this.f19885c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f19883a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f19884b, (File) this.f19885c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f19884b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f19885c, (String) this.d);
                return;
        }
    }
}
