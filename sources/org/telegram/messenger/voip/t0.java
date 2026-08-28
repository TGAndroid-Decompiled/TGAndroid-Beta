package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class t0 implements Runnable {
    public final int f21950a;
    public final boolean f21951b;
    public final Object f21952c;
    public final Object d;
    public final Object f21953e;

    public t0(Object obj, Object obj2, Object obj3, boolean z10, int i9) {
        this.f21950a = i9;
        this.f21952c = obj;
        this.d = obj2;
        this.f21953e = obj3;
        this.f21951b = z10;
    }

    @Override
    public final void run() {
        switch (this.f21950a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f21952c).lambda$onFrame$0((String) this.d, (VideoSink) this.f21953e, this.f21951b);
                return;
            default:
                ((VoIPService) this.f21952c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.f21953e, this.f21951b);
                return;
        }
    }
}
