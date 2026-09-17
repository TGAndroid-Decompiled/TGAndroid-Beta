package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class t implements Utilities.Callback2 {
    public final int f19461a;
    public final VoIPService f19462b;

    public t(VoIPService voIPService, int i10) {
        this.f19461a = i10;
        this.f19462b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f19461a) {
            case 0:
                this.f19462b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f19462b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
