package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class s0 implements Runnable {
    public final int f27504a;
    public final boolean f27505b;
    public final Object f27506c;
    public final Object d;
    public final Object f27507e;

    public s0(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.f27504a = i7;
        this.f27506c = obj;
        this.d = obj2;
        this.f27507e = obj3;
        this.f27505b = z10;
    }

    @Override
    public final void run() {
        switch (this.f27504a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f27506c).lambda$onFrame$0((String) this.d, (VideoSink) this.f27507e, this.f27505b);
                return;
            default:
                ((VoIPService) this.f27506c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.f27507e, this.f27505b);
                return;
        }
    }
}
