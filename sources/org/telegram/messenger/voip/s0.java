package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class s0 implements Runnable {
    public final int f19911a;
    public final boolean f19912b;
    public final Object f19913c;
    public final Object d;
    public final Object e;

    public s0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f19911a = i10;
        this.f19913c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f19912b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19911a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f19913c).lambda$onFrame$0((String) this.d, (VideoSink) this.e, this.f19912b);
                return;
            default:
                ((VoIPService) this.f19913c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.e, this.f19912b);
                return;
        }
    }
}
