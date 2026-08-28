package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class r implements Utilities.Callback2 {
    public final int f21940a;
    public final VoIPService f21941b;

    public r(VoIPService voIPService, int i9) {
        this.f21940a = i9;
        this.f21941b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f21940a) {
            case 0:
                this.f21941b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f21941b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
