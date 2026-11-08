package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class r0 implements Runnable {
    public final int f26169a;
    public final boolean f26170b;
    public final Object f26171c;
    public final Object d;
    public final Object f26172e;

    public r0(Object obj, Object obj2, Object obj3, boolean z9, int i7) {
        this.f26169a = i7;
        this.f26171c = obj;
        this.d = obj2;
        this.f26172e = obj3;
        this.f26170b = z9;
    }

    @Override
    public final void run() {
        switch (this.f26169a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f26171c).lambda$onFrame$0((String) this.d, (VideoSink) this.f26172e, this.f26170b);
                return;
            default:
                ((VoIPService) this.f26171c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.f26172e, this.f26170b);
                return;
        }
    }
}
