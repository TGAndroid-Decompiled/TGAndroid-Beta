package org.telegram.messenger.voip;

import java.util.ArrayList;

public final class VoIPService$$ExternalSyntheticLambda76 implements Runnable {
    public final int $r8$classId;
    public final VoIPService f$0;
    public final ArrayList f$1;
    public final ArrayList f$2;
    public final ArrayList f$3;
    public final String f$4;

    public VoIPService$$ExternalSyntheticLambda76(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = voIPService;
        this.f$1 = arrayList;
        this.f$2 = arrayList2;
        this.f$3 = arrayList3;
        this.f$4 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$startConferenceGroupCall$39(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
            default:
                this.f$0.lambda$startConferenceGroupCall$47(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
        }
    }
}
