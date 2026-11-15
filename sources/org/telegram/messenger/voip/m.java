package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements Runnable {
    public final int f27154a;
    public final Object f27155b;
    public final Object f27156c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i7) {
        this.f27154a = i7;
        this.f27155b = obj;
        this.f27156c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f27154a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f27155b, (File) this.f27156c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f27155b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f27156c, (String) this.d);
                return;
        }
    }
}
