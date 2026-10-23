package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class s0 implements Runnable {
    public final int f19994a;
    public final boolean f19995b;
    public final Object f19996c;
    public final Object d;
    public final Object e;

    public s0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f19994a = i10;
        this.f19996c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f19995b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19994a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f19996c).lambda$onFrame$0((String) this.d, (VideoSink) this.e, this.f19995b);
                return;
            default:
                ((VoIPService) this.f19996c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.e, this.f19995b);
                return;
        }
    }
}
