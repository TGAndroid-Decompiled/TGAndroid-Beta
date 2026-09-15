package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class t implements Utilities.Callback2 {
    public final int f17709a;
    public final VoIPService f17710b;

    public t(VoIPService voIPService, int i10) {
        this.f17709a = i10;
        this.f17710b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f17709a) {
            case 0:
                this.f17710b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f17710b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
