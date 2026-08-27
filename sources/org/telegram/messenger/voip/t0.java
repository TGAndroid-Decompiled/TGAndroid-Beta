package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;

public final class t0 implements Runnable {

    public final int f21974a;

    public final boolean f21975b;

    public final Object f21976c;
    public final Object d;

    public final Object f21977e;

    public t0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f21974a = i10;
        this.f21976c = obj;
        this.d = obj2;
        this.f21977e = obj3;
        this.f21975b = z10;
    }

    @Override
    public final void run() {
        switch (this.f21974a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f21976c).lambda$onFrame$0((String) this.d, (VideoSink) this.f21977e, this.f21975b);
                break;
            default:
                ((VoIPService) this.f21976c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.f21977e, this.f21975b);
                break;
        }
    }
}
