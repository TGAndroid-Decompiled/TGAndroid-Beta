package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements Runnable {
    public final int f27616a;
    public final Object f27617b;
    public final Object f27618c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i7) {
        this.f27616a = i7;
        this.f27617b = obj;
        this.f27618c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f27616a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f27617b, (File) this.f27618c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f27617b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f27618c, (String) this.d);
                return;
        }
    }
}
