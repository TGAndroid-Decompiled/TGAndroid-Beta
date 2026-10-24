package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements Runnable {
    public final int f19964a;
    public final Object f19965b;
    public final Object f19966c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i10) {
        this.f19964a = i10;
        this.f19965b = obj;
        this.f19966c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f19964a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f19965b, (File) this.f19966c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f19965b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f19966c, (String) this.d);
                return;
        }
    }
}
