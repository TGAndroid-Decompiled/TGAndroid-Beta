package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements Runnable {
    public final int f27548a;
    public final Object f27549b;
    public final Object f27550c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i7) {
        this.f27548a = i7;
        this.f27549b = obj;
        this.f27550c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f27548a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f27549b, (File) this.f27550c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f27549b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f27550c, (String) this.d);
                return;
        }
    }
}
