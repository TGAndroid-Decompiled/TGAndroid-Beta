package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class u implements Utilities.Callback2 {
    public final int f19621a;
    public final VoIPService f19622b;

    public u(VoIPService voIPService, int i10) {
        this.f19621a = i10;
        this.f19622b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f19621a) {
            case 0:
                this.f19622b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f19622b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
