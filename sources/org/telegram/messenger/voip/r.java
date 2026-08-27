package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;

public final class r implements Utilities.Callback2 {

    public final int f21964a;

    public final VoIPService f21965b;

    public r(VoIPService voIPService, int i10) {
        this.f21964a = i10;
        this.f21965b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f21964a) {
            case 0:
                this.f21965b.lambda$switchToSpeaker$91(bool, bool2);
                break;
            default:
                this.f21965b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                break;
        }
    }
}
