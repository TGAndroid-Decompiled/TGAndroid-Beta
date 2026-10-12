package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class u0 implements Runnable {
    public final int f19400a;
    public final boolean f19401b;
    public final Object f19402c;
    public final Object d;
    public final Object f19403e;

    public u0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f19400a = i10;
        this.f19402c = obj;
        this.d = obj2;
        this.f19403e = obj3;
        this.f19401b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19400a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f19402c).lambda$onFrame$0((String) this.d, (VideoSink) this.f19403e, this.f19401b);
                return;
            default:
                ((VoIPService) this.f19402c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.f19403e, this.f19401b);
                return;
        }
    }
}
