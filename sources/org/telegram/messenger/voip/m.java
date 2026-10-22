package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements Runnable {
    public final int f19901a;
    public final Object f19902b;
    public final Object f19903c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i10) {
        this.f19901a = i10;
        this.f19902b = obj;
        this.f19903c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f19901a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f19902b, (File) this.f19903c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f19902b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f19903c, (String) this.d);
                return;
        }
    }
}
