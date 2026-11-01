package org.telegram.messenger.voip;

import org.telegram.messenger.k20;
public final class v implements k20 {
    public final int f18872a;
    public final VoIPService f18873b;

    public v(VoIPService voIPService, int i10) {
        this.f18872a = i10;
        this.f18873b = voIPService;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f18872a) {
            case 0:
                this.f18873b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f18873b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
