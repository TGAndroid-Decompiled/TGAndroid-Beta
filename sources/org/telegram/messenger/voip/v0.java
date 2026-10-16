package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class v0 implements Runnable {
    public final int f18564a;
    public final boolean f18565b;
    public final Object f18566c;
    public final Object d;
    public final Object e;

    public v0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f18564a = i10;
        this.f18566c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18565b = z10;
    }

    @Override
    public final void run() {
        switch (this.f18564a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f18566c).lambda$onFrame$0((String) this.d, (VideoSink) this.e, this.f18565b);
                return;
            default:
                ((VoIPService) this.f18566c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.e, this.f18565b);
                return;
        }
    }
}
