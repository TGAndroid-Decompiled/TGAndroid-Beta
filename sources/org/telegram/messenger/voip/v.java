package org.telegram.messenger.voip;

import org.telegram.messenger.j20;
public final class v implements j20 {
    public final int f18712a;
    public final VoIPService f18713b;

    public v(VoIPService voIPService, int i10) {
        this.f18712a = i10;
        this.f18713b = voIPService;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f18712a) {
            case 0:
                this.f18713b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f18713b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
