package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class t0 implements Runnable {
    public final int f19463a;
    public final boolean f19464b;
    public final Object f19465c;
    public final Object d;
    public final Object f19466e;

    public t0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f19463a = i10;
        this.f19465c = obj;
        this.d = obj2;
        this.f19466e = obj3;
        this.f19464b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19463a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f19465c).lambda$onFrame$0((String) this.d, (VideoSink) this.f19466e, this.f19464b);
                return;
            default:
                ((VoIPService) this.f19465c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.f19466e, this.f19464b);
                return;
        }
    }
}
