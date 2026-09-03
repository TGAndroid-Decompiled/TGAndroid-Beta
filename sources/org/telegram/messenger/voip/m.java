package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements Runnable {
    public final int f20438a;
    public final Object f20439b;
    public final Object f20440c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i10) {
        this.f20438a = i10;
        this.f20439b = obj;
        this.f20440c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f20438a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f20439b, (File) this.f20440c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f20439b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f20440c, (String) this.d);
                return;
        }
    }
}
