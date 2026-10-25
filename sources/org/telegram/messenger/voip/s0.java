package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class s0 implements Runnable {
    public final int f21691a;
    public final boolean f21692b;
    public final Object f21693c;
    public final Object d;
    public final Object e;

    public s0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f21691a = i10;
        this.f21693c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f21692b = z10;
    }

    @Override
    public final void run() {
        switch (this.f21691a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f21693c).lambda$onFrame$0((String) this.d, (VideoSink) this.e, this.f21692b);
                return;
            default:
                ((VoIPService) this.f21693c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.e, this.f21692b);
                return;
        }
    }
}
