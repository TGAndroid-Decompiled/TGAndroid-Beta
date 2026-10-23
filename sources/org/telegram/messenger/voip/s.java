package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class s implements Utilities.Callback2 {
    public final int f19992a;
    public final VoIPService f19993b;

    public s(VoIPService voIPService, int i10) {
        this.f19992a = i10;
        this.f19993b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f19992a) {
            case 0:
                this.f19993b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f19993b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
