package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements Runnable {
    public final int f19879a;
    public final Object f19880b;
    public final Object f19881c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i10) {
        this.f19879a = i10;
        this.f19880b = obj;
        this.f19881c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f19879a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f19880b, (File) this.f19881c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f19880b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f19881c, (String) this.d);
                return;
        }
    }
}
