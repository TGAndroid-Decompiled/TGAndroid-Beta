package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class t0 implements Runnable {
    public final int f19449a;
    public final boolean f19450b;
    public final Object f19451c;
    public final Object d;
    public final Object f19452e;

    public t0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f19449a = i10;
        this.f19451c = obj;
        this.d = obj2;
        this.f19452e = obj3;
        this.f19450b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19449a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f19451c).lambda$onFrame$0((String) this.d, (VideoSink) this.f19452e, this.f19450b);
                return;
            default:
                ((VoIPService) this.f19451c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.f19452e, this.f19450b);
                return;
        }
    }
}
