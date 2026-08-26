package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;

public final class VoIPService$$ExternalSyntheticLambda138 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final VoIPService f$0;

    public VoIPService$$ExternalSyntheticLambda138(VoIPService voIPService, int i) {
        this.$r8$classId = i;
        this.f$0 = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                break;
            default:
                this.f$0.lambda$switchToSpeaker$91(bool, bool2);
                break;
        }
    }
}
