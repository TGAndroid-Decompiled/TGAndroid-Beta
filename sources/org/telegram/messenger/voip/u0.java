package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class u0 implements Runnable {
    public final int f19620a;
    public final boolean f19621b;
    public final Object f19622c;
    public final Object d;
    public final Object f19623e;

    public u0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f19620a = i10;
        this.f19622c = obj;
        this.d = obj2;
        this.f19623e = obj3;
        this.f19621b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19620a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f19622c).lambda$onFrame$0((String) this.d, (VideoSink) this.f19623e, this.f19621b);
                return;
            default:
                ((VoIPService) this.f19622c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.f19623e, this.f19621b);
                return;
        }
    }
}
