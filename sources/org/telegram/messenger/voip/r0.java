package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class r0 implements Runnable {
    public final int f26053a;
    public final boolean f26054b;
    public final Object f26055c;
    public final Object d;
    public final Object f26056e;

    public r0(Object obj, Object obj2, Object obj3, boolean z10, int i3) {
        this.f26053a = i3;
        this.f26055c = obj;
        this.d = obj2;
        this.f26056e = obj3;
        this.f26054b = z10;
    }

    @Override
    public final void run() {
        switch (this.f26053a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f26055c).lambda$onFrame$0((String) this.d, (VideoSink) this.f26056e, this.f26054b);
                return;
            default:
                ((VoIPService) this.f26055c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.f26056e, this.f26054b);
                return;
        }
    }
}
