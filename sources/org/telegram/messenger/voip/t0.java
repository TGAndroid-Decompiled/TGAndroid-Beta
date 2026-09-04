package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class t0 implements Runnable {
    public final int f19422a;
    public final boolean f19423b;
    public final Object f19424c;
    public final Object d;
    public final Object f19425e;

    public t0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f19422a = i10;
        this.f19424c = obj;
        this.d = obj2;
        this.f19425e = obj3;
        this.f19423b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19422a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f19424c).lambda$onFrame$0((String) this.d, (VideoSink) this.f19425e, this.f19423b);
                return;
            default:
                ((VoIPService) this.f19424c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.f19425e, this.f19423b);
                return;
        }
    }
}
