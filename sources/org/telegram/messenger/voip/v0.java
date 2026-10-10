package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class v0 implements Runnable {
    public final int f19636a;
    public final boolean f19637b;
    public final Object f19638c;
    public final Object d;
    public final Object f19639e;

    public v0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f19636a = i10;
        this.f19638c = obj;
        this.d = obj2;
        this.f19639e = obj3;
        this.f19637b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19636a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f19638c).lambda$onFrame$0((String) this.d, (VideoSink) this.f19639e, this.f19637b);
                return;
            default:
                ((VoIPService) this.f19638c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.f19639e, this.f19637b);
                return;
        }
    }
}
