package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class t implements Utilities.Callback2 {
    public final int f17718a;
    public final VoIPService f17719b;

    public t(VoIPService voIPService, int i10) {
        this.f17718a = i10;
        this.f17719b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f17718a) {
            case 0:
                this.f17719b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f17719b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
