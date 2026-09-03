package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class u0 implements Runnable {
    public final int f18826a;
    public final boolean f18827b;
    public final Object f18828c;
    public final Object d;
    public final Object e;

    public u0(Object obj, Object obj2, Object obj3, boolean z4, int i10) {
        this.f18826a = i10;
        this.f18828c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18827b = z4;
    }

    @Override
    public final void run() {
        switch (this.f18826a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f18828c).lambda$onFrame$0((String) this.d, (VideoSink) this.e, this.f18827b);
                return;
            default:
                ((VoIPService) this.f18828c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.e, this.f18827b);
                return;
        }
    }
}
