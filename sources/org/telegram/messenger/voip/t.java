package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class t implements Utilities.Callback2 {
    public final int f20473a;
    public final VoIPService f20474b;

    public t(VoIPService voIPService, int i10) {
        this.f20473a = i10;
        this.f20474b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f20473a) {
            case 0:
                this.f20474b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f20474b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
