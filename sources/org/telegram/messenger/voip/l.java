package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

public final class l implements Runnable {

    public final int f21933a;

    public final Object f21934b;

    public final Object f21935c;
    public final Object d;

    public l(Object obj, Object obj2, Object obj3, int i10) {
        this.f21933a = i10;
        this.f21934b = obj;
        this.f21935c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f21933a) {
            case 0:
                ((VoIPDebugToSend) this.f21934b).lambda$done$1((File) this.f21935c, (TL_phone.saveCallDebug) this.d);
                break;
            default:
                ((VoIPService) this.f21934b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f21935c, (String) this.d);
                break;
        }
    }
}
