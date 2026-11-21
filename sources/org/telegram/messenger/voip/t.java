package org.telegram.messenger.voip;

import org.telegram.messenger.q10;
public final class t implements q10 {
    public final int f27581a;
    public final VoIPService f27582b;

    public t(VoIPService voIPService, int i7) {
        this.f27581a = i7;
        this.f27582b = voIPService;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f27581a) {
            case 0:
                this.f27582b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f27582b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
