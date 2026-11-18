package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class s0 implements Runnable {
    public final int f27551a;
    public final boolean f27552b;
    public final Object f27553c;
    public final Object d;
    public final Object f27554e;

    public s0(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.f27551a = i7;
        this.f27553c = obj;
        this.d = obj2;
        this.f27554e = obj3;
        this.f27552b = z10;
    }

    @Override
    public final void run() {
        switch (this.f27551a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f27553c).lambda$onFrame$0((String) this.d, (VideoSink) this.f27554e, this.f27552b);
                return;
            default:
                ((VoIPService) this.f27553c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.f27554e, this.f27552b);
                return;
        }
    }
}
