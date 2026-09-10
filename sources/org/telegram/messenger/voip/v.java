package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.Callback2 {
    public final int f16793a;
    public final VoIPService f16794b;

    public v(VoIPService voIPService, int i10) {
        this.f16793a = i10;
        this.f16794b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f16793a) {
            case 0:
                this.f16794b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f16794b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
