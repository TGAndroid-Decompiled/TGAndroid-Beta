package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;
public final class x0 implements Runnable {
    public final int f18723a;
    public final boolean f18724b;
    public final Object f18725c;
    public final Object d;
    public final Object e;

    public x0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f18723a = i10;
        this.f18725c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18724b = z10;
    }

    @Override
    public final void run() {
        switch (this.f18723a) {
            case 0:
                ((VoIPService.AnonymousClass5) this.f18725c).lambda$onFrame$0((String) this.d, (VideoSink) this.e, this.f18724b);
                return;
            default:
                ((VoIPService) this.f18725c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.e, this.f18724b);
                return;
        }
    }
}
