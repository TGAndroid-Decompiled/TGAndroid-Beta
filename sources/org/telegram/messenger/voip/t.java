package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class t implements Utilities.Callback2 {
    public final int f17895a;
    public final VoIPService f17896b;

    public t(VoIPService voIPService, int i10) {
        this.f17895a = i10;
        this.f17896b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f17895a) {
            case 0:
                this.f17896b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f17896b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
