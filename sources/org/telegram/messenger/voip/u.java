package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class u implements Utilities.Callback2 {
    public final int f19657a;
    public final VoIPService f19658b;

    public u(VoIPService voIPService, int i10) {
        this.f19657a = i10;
        this.f19658b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f19657a) {
            case 0:
                this.f19658b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f19658b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
