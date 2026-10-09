package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class v0 implements Runnable {
    public final int f19632a;
    public final boolean f19633b;
    public final Object f19634c;
    public final Object d;
    public final Object f19635e;

    public v0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f19632a = i10;
        this.f19634c = obj;
        this.d = obj2;
        this.f19635e = obj3;
        this.f19633b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19632a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f19634c).lambda$onFrame$0((String) this.d, (VideoSink) this.f19635e, this.f19633b);
                return;
            default:
                ((VoIPService) this.f19634c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.f19635e, this.f19633b);
                return;
        }
    }
}
