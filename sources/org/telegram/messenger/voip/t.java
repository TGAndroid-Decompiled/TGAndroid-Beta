package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class t implements Utilities.Callback2 {
    public final int f17979a;
    public final VoIPService f17980b;

    public t(VoIPService voIPService, int i10) {
        this.f17979a = i10;
        this.f17980b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f17979a) {
            case 0:
                this.f17980b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f17980b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
