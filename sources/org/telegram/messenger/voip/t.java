package org.telegram.messenger.voip;

import org.telegram.messenger.p10;
public final class t implements p10 {
    public final int f27649a;
    public final VoIPService f27650b;

    public t(VoIPService voIPService, int i7) {
        this.f27649a = i7;
        this.f27650b = voIPService;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f27649a) {
            case 0:
                this.f27650b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f27650b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
