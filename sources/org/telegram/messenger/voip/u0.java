package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class u0 implements Runnable {
    public final int f20477a;
    public final boolean f20478b;
    public final Object f20479c;
    public final Object d;
    public final Object f20480e;

    public u0(Object obj, Object obj2, Object obj3, boolean z4, int i10) {
        this.f20477a = i10;
        this.f20479c = obj;
        this.d = obj2;
        this.f20480e = obj3;
        this.f20478b = z4;
    }

    @Override
    public final void run() {
        switch (this.f20477a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f20479c).lambda$onFrame$0((String) this.d, (VideoSink) this.f20480e, this.f20478b);
                return;
            default:
                ((VoIPService) this.f20479c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.f20480e, this.f20478b);
                return;
        }
    }
}
