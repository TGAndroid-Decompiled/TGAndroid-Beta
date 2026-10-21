package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements Runnable {
    public final int f19880a;
    public final Object f19881b;
    public final Object f19882c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i10) {
        this.f19880a = i10;
        this.f19881b = obj;
        this.f19882c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f19880a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f19881b, (File) this.f19882c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f19881b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f19882c, (String) this.d);
                return;
        }
    }
}
