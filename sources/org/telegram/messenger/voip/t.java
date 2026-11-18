package org.telegram.messenger.voip;

import org.telegram.messenger.q10;
public final class t implements q10 {
    public final int f27555a;
    public final VoIPService f27556b;

    public t(VoIPService voIPService, int i7) {
        this.f27555a = i7;
        this.f27556b = voIPService;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f27555a) {
            case 0:
                this.f27556b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f27556b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
