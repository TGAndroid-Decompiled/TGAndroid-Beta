package org.telegram.messenger.voip;

import org.telegram.messenger.n10;
public final class r implements n10 {
    public final int f26051a;
    public final VoIPService f26052b;

    public r(VoIPService voIPService, int i3) {
        this.f26051a = i3;
        this.f26052b = voIPService;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f26051a) {
            case 0:
                this.f26052b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f26052b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
