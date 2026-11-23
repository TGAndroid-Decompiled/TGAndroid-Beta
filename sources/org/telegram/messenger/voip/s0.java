package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class s0 implements Runnable {
    public final int f27540a;
    public final boolean f27541b;
    public final Object f27542c;
    public final Object d;
    public final Object f27543e;

    public s0(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.f27540a = i7;
        this.f27542c = obj;
        this.d = obj2;
        this.f27543e = obj3;
        this.f27541b = z10;
    }

    @Override
    public final void run() {
        switch (this.f27540a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f27542c).lambda$onFrame$0((String) this.d, (VideoSink) this.f27543e, this.f27541b);
                return;
            default:
                ((VoIPService) this.f27542c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.f27543e, this.f27541b);
                return;
        }
    }
}
