package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

public final class VoIPService$$ExternalSyntheticLambda45 implements Runnable {
    public final int $r8$classId;
    public final TLObject f$0;
    public final ArrayList f$1;
    public final ArrayList f$2;
    public final Runnable f$3;

    public VoIPService$$ExternalSyntheticLambda45(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = tLObject;
        this.f$1 = arrayList;
        this.f$2 = arrayList2;
        this.f$3 = runnable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f$0, this.f$1, this.f$2, this.f$3);
                break;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f$0, this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
