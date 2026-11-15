package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class s0 implements Runnable {
    public final int f27183a;
    public final boolean f27184b;
    public final Object f27185c;
    public final Object d;
    public final Object f27186e;

    public s0(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.f27183a = i7;
        this.f27185c = obj;
        this.d = obj2;
        this.f27186e = obj3;
        this.f27184b = z10;
    }

    @Override
    public final void run() {
        switch (this.f27183a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f27185c).lambda$onFrame$0((String) this.d, (VideoSink) this.f27186e, this.f27184b);
                return;
            default:
                ((VoIPService) this.f27185c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.f27186e, this.f27184b);
                return;
        }
    }
}
