package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class t0 implements Runnable {
    public final int f17720a;
    public final boolean f17721b;
    public final Object f17722c;
    public final Object d;
    public final Object e;

    public t0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f17720a = i10;
        this.f17722c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f17721b = z10;
    }

    @Override
    public final void run() {
        switch (this.f17720a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f17722c).lambda$onFrame$0((String) this.d, (VideoSink) this.e, this.f17721b);
                return;
            default:
                ((VoIPService) this.f17722c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.e, this.f17721b);
                return;
        }
    }
}
