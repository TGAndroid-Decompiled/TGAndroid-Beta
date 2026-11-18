package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements Runnable {
    public final int f27522a;
    public final Object f27523b;
    public final Object f27524c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i7) {
        this.f27522a = i7;
        this.f27523b = obj;
        this.f27524c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f27522a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f27523b, (File) this.f27524c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f27523b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f27524c, (String) this.d);
                return;
        }
    }
}
