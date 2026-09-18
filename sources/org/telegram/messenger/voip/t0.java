package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class t0 implements Runnable {
    public final int f17897a;
    public final boolean f17898b;
    public final Object f17899c;
    public final Object d;
    public final Object e;

    public t0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f17897a = i10;
        this.f17899c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f17898b = z10;
    }

    @Override
    public final void run() {
        switch (this.f17897a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f17899c).lambda$onFrame$0((String) this.d, (VideoSink) this.e, this.f17898b);
                return;
            default:
                ((VoIPService) this.f17899c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.e, this.f17898b);
                return;
        }
    }
}
