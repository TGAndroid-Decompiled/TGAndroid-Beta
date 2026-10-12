package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class u0 implements Runnable {
    public final int f19399a;
    public final boolean f19400b;
    public final Object f19401c;
    public final Object d;
    public final Object f19402e;

    public u0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f19399a = i10;
        this.f19401c = obj;
        this.d = obj2;
        this.f19402e = obj3;
        this.f19400b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19399a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f19401c).lambda$onFrame$0((String) this.d, (VideoSink) this.f19402e, this.f19400b);
                return;
            default:
                ((VoIPService) this.f19401c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.f19402e, this.f19400b);
                return;
        }
    }
}
