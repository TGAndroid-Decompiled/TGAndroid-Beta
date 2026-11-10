package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class r0 implements Runnable {
    public final int f26173a;
    public final boolean f26174b;
    public final Object f26175c;
    public final Object d;
    public final Object f26176e;

    public r0(Object obj, Object obj2, Object obj3, boolean z9, int i7) {
        this.f26173a = i7;
        this.f26175c = obj;
        this.d = obj2;
        this.f26176e = obj3;
        this.f26174b = z9;
    }

    @Override
    public final void run() {
        switch (this.f26173a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f26175c).lambda$onFrame$0((String) this.d, (VideoSink) this.f26176e, this.f26174b);
                return;
            default:
                ((VoIPService) this.f26175c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.f26176e, this.f26174b);
                return;
        }
    }
}
