package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class u0 implements Runnable {
    public final int f19622a;
    public final boolean f19623b;
    public final Object f19624c;
    public final Object d;
    public final Object f19625e;

    public u0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f19622a = i10;
        this.f19624c = obj;
        this.d = obj2;
        this.f19625e = obj3;
        this.f19623b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19622a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f19624c).lambda$onFrame$0((String) this.d, (VideoSink) this.f19625e, this.f19623b);
                return;
            default:
                ((VoIPService) this.f19624c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.f19625e, this.f19623b);
                return;
        }
    }
}
