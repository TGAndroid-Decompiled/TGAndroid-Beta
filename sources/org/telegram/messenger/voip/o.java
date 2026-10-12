package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class o implements Runnable {
    public final int f18837a;
    public final Object f18838b;
    public final Object f18839c;
    public final Object d;

    public o(Object obj, Object obj2, Object obj3, int i10) {
        this.f18837a = i10;
        this.f18838b = obj;
        this.f18839c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f18837a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f18838b, (File) this.f18839c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f18838b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f18839c, (String) this.d);
                return;
        }
    }
}
