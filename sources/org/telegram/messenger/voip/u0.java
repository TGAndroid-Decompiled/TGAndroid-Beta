package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class u0 implements Runnable {
    public final int f19615a;
    public final boolean f19616b;
    public final Object f19617c;
    public final Object d;
    public final Object f19618e;

    public u0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f19615a = i10;
        this.f19617c = obj;
        this.d = obj2;
        this.f19618e = obj3;
        this.f19616b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19615a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f19617c).lambda$onFrame$0((String) this.d, (VideoSink) this.f19618e, this.f19616b);
                return;
            default:
                ((VoIPService) this.f19617c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.f19618e, this.f19616b);
                return;
        }
    }
}
