package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class r0 implements Runnable {
    public final int f26163a;
    public final boolean f26164b;
    public final Object f26165c;
    public final Object d;
    public final Object f26166e;

    public r0(Object obj, Object obj2, Object obj3, boolean z9, int i7) {
        this.f26163a = i7;
        this.f26165c = obj;
        this.d = obj2;
        this.f26166e = obj3;
        this.f26164b = z9;
    }

    @Override
    public final void run() {
        switch (this.f26163a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f26165c).lambda$onFrame$0((String) this.d, (VideoSink) this.f26166e, this.f26164b);
                return;
            default:
                ((VoIPService) this.f26165c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.f26166e, this.f26164b);
                return;
        }
    }
}
