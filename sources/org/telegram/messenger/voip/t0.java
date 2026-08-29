package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class t0 implements Runnable {
    public final int f22014a;
    public final boolean f22015b;
    public final Object f22016c;
    public final Object d;
    public final Object f22017e;

    public t0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f22014a = i10;
        this.f22016c = obj;
        this.d = obj2;
        this.f22017e = obj3;
        this.f22015b = z10;
    }

    @Override
    public final void run() {
        switch (this.f22014a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f22016c).lambda$onFrame$0((String) this.d, (VideoSink) this.f22017e, this.f22015b);
                return;
            default:
                ((VoIPService) this.f22016c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.f22017e, this.f22015b);
                return;
        }
    }
}
