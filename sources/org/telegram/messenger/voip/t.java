package org.telegram.messenger.voip;

import org.telegram.messenger.r10;
public final class t implements r10 {
    public final int f27544a;
    public final VoIPService f27545b;

    public t(VoIPService voIPService, int i7) {
        this.f27544a = i7;
        this.f27545b = voIPService;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f27544a) {
            case 0:
                this.f27545b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f27545b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
