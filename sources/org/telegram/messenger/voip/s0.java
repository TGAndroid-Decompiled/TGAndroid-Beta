package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class s0 implements Runnable {
    public final int f19908a;
    public final boolean f19909b;
    public final Object f19910c;
    public final Object d;
    public final Object e;

    public s0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f19908a = i10;
        this.f19910c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f19909b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19908a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f19910c).lambda$onFrame$0((String) this.d, (VideoSink) this.e, this.f19909b);
                return;
            default:
                ((VoIPService) this.f19910c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.e, this.f19909b);
                return;
        }
    }
}
