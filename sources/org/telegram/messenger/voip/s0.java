package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class s0 implements Runnable {
    public final int f27182a;
    public final boolean f27183b;
    public final Object f27184c;
    public final Object d;
    public final Object f27185e;

    public s0(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.f27182a = i7;
        this.f27184c = obj;
        this.d = obj2;
        this.f27185e = obj3;
        this.f27183b = z10;
    }

    @Override
    public final void run() {
        switch (this.f27182a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f27184c).lambda$onFrame$0((String) this.d, (VideoSink) this.f27185e, this.f27183b);
                return;
            default:
                ((VoIPService) this.f27184c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.f27185e, this.f27183b);
                return;
        }
    }
}
