package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class s0 implements Runnable {
    public final int f27577a;
    public final boolean f27578b;
    public final Object f27579c;
    public final Object d;
    public final Object f27580e;

    public s0(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.f27577a = i7;
        this.f27579c = obj;
        this.d = obj2;
        this.f27580e = obj3;
        this.f27578b = z10;
    }

    @Override
    public final void run() {
        switch (this.f27577a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f27579c).lambda$onFrame$0((String) this.d, (VideoSink) this.f27580e, this.f27578b);
                return;
            default:
                ((VoIPService) this.f27579c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.f27580e, this.f27578b);
                return;
        }
    }
}
