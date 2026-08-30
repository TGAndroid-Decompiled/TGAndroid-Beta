package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements Runnable {
    public final int f18805a;
    public final Object f18806b;
    public final Object f18807c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i10) {
        this.f18805a = i10;
        this.f18806b = obj;
        this.f18807c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f18805a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f18806b, (File) this.f18807c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f18806b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f18807c, (String) this.d);
                return;
        }
    }
}
