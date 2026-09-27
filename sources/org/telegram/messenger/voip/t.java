package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class t implements Utilities.Callback2 {
    public final int f17946a;
    public final VoIPService f17947b;

    public t(VoIPService voIPService, int i10) {
        this.f17946a = i10;
        this.f17947b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f17946a) {
            case 0:
                this.f17947b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f17947b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
