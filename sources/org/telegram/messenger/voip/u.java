package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class u implements Utilities.Callback2 {
    public final int f18558a;
    public final VoIPService f18559b;

    public u(VoIPService voIPService, int i10) {
        this.f18558a = i10;
        this.f18559b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f18558a) {
            case 0:
                this.f18559b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f18559b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
