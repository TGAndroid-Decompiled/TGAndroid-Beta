package org.telegram.messenger.voip;

import java.util.HashSet;

public final class VoIPService$$ExternalSyntheticLambda85 implements Runnable {
    public final int $r8$classId;
    public final VoIPService f$0;
    public final HashSet f$1;
    public final String f$2;

    public VoIPService$$ExternalSyntheticLambda85(VoIPService voIPService, HashSet hashSet, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = voIPService;
        this.f$1 = hashSet;
        this.f$2 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$startConferenceGroupCall$50(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$startConferenceGroupCall$42(this.f$1, this.f$2);
                break;
        }
    }
}
