package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class u0 implements Runnable {
    public final int f19623a;
    public final boolean f19624b;
    public final Object f19625c;
    public final Object d;
    public final Object f19626e;

    public u0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f19623a = i10;
        this.f19625c = obj;
        this.d = obj2;
        this.f19626e = obj3;
        this.f19624b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19623a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f19625c).lambda$onFrame$0((String) this.d, (VideoSink) this.f19626e, this.f19624b);
                return;
            default:
                ((VoIPService) this.f19625c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.f19626e, this.f19624b);
                return;
        }
    }
}
