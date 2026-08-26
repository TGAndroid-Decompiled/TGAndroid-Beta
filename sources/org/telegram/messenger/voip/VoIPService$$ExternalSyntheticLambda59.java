package org.telegram.messenger.voip;

import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

public final class VoIPService$$ExternalSyntheticLambda59 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public VoIPService$$ExternalSyntheticLambda59(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((VoIPService) this.f$0).lambda$startConferenceGroupCall$53((TLRPC.TL_error) this.f$1, (String) this.f$2);
                break;
            default:
                ((VoIPDebugToSend) this.f$0).lambda$done$1((File) this.f$1, (TL_phone.saveCallDebug) this.f$2);
                break;
        }
    }
}
