package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements Runnable {
    public final int f19595a;
    public final Object f19596b;
    public final Object f19597c;
    public final Object d;

    public n(Object obj, Object obj2, Object obj3, int i10) {
        this.f19595a = i10;
        this.f19596b = obj;
        this.f19597c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f19595a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f19596b, (File) this.f19597c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f19596b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f19597c, (String) this.d);
                return;
        }
    }
}
