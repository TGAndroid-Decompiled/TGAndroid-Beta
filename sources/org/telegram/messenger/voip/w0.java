package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class w0 implements Runnable {
    public final int f16799a;
    public final boolean f16800b;
    public final Object f16801c;
    public final Object d;
    public final Object e;

    public w0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f16799a = i10;
        this.f16801c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f16800b = z10;
    }

    @Override
    public final void run() {
        switch (this.f16799a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f16801c).lambda$onFrame$0((String) this.d, (VideoSink) this.e, this.f16800b);
                return;
            default:
                ((VoIPService) this.f16801c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.e, this.f16800b);
                return;
        }
    }
}
