package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class o implements Runnable {
    public final int f18682a;
    public final Object f18683b;
    public final Object f18684c;
    public final Object d;

    public o(Object obj, Object obj2, Object obj3, int i10) {
        this.f18682a = i10;
        this.f18683b = obj;
        this.f18684c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f18682a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f18683b, (File) this.f18684c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f18683b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f18684c, (String) this.d);
                return;
        }
    }
}
