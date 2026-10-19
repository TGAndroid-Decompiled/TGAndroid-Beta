package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements Runnable {
    public final int f19886a;
    public final Object f19887b;
    public final Object f19888c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i10) {
        this.f19886a = i10;
        this.f19887b = obj;
        this.f19888c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f19886a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f19887b, (File) this.f19888c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f19887b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f19888c, (String) this.d);
                return;
        }
    }
}
