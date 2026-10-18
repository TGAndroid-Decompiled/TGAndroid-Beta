package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements Runnable {
    public final int f19890a;
    public final Object f19891b;
    public final Object f19892c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i10) {
        this.f19890a = i10;
        this.f19891b = obj;
        this.f19892c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f19890a) {
            case 0:
                VoIPDebugToSend.c((VoIPDebugToSend) this.f19891b, (File) this.f19892c, (TL_phone.saveCallDebug) this.d);
                return;
            default:
                ((VoIPService) this.f19891b).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f19892c, (String) this.d);
                return;
        }
    }
}
