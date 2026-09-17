package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class t0 implements Runnable {
    public final int f19436a;
    public final boolean f19437b;
    public final Object f19438c;
    public final Object d;
    public final Object f19439e;

    public t0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f19436a = i10;
        this.f19438c = obj;
        this.d = obj2;
        this.f19439e = obj3;
        this.f19437b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19436a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f19438c).lambda$onFrame$0((String) this.d, (VideoSink) this.f19439e, this.f19437b);
                return;
            default:
                ((VoIPService) this.f19438c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.f19439e, this.f19437b);
                return;
        }
    }
}
