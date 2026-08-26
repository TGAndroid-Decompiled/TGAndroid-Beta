package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.VideoSink;

public final class VoIPService$$ExternalSyntheticLambda64 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final boolean f$3;

    public VoIPService$$ExternalSyntheticLambda64(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((VoIPService) this.f$0).lambda$acknowledgeCall$12((TLObject) this.f$1, (TLRPC.TL_error) this.f$2, this.f$3);
                break;
            default:
                ((VoIPService.AnonymousClass5) this.f$0).lambda$onFrame$0((String) this.f$1, (VideoSink) this.f$2, this.f$3);
                break;
        }
    }
}
