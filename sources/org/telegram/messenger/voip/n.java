package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements Runnable {
    public final int f19391a;
    public final Object f19392b;
    public final Object f19393c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i10) {
        this.f19391a = i10;
        this.f19392b = obj;
        this.f19393c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f19391a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f19392b, (File) this.f19393c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f19392b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f19393c, (String) this.d);
                return;
        }
    }
}
