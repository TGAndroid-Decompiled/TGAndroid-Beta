package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class u implements Utilities.Callback2 {
    public final int f17964a;
    public final VoIPService f17965b;

    public u(VoIPService voIPService, int i10) {
        this.f17964a = i10;
        this.f17965b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f17964a) {
            case 0:
                this.f17965b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f17965b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
