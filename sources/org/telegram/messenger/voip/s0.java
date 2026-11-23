package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class s0 implements Runnable {
    public final int f27645a;
    public final boolean f27646b;
    public final Object f27647c;
    public final Object d;
    public final Object f27648e;

    public s0(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.f27645a = i7;
        this.f27647c = obj;
        this.d = obj2;
        this.f27648e = obj3;
        this.f27646b = z10;
    }

    @Override
    public final void run() {
        switch (this.f27645a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f27647c).lambda$onFrame$0((String) this.d, (VideoSink) this.f27648e, this.f27646b);
                return;
            default:
                ((VoIPService) this.f27647c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.f27648e, this.f27646b);
                return;
        }
    }
}
