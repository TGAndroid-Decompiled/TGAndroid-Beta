package org.telegram.messenger.voip;

import org.telegram.messenger.q10;
public final class t implements q10 {
    public final int f27553a;
    public final VoIPService f27554b;

    public t(VoIPService voIPService, int i7) {
        this.f27553a = i7;
        this.f27554b = voIPService;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f27553a) {
            case 0:
                this.f27554b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f27554b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
