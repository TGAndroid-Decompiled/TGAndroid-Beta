package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class s implements Utilities.Callback2 {
    public final int f19903a;
    public final VoIPService f19904b;

    public s(VoIPService voIPService, int i10) {
        this.f19903a = i10;
        this.f19904b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f19903a) {
            case 0:
                this.f19904b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f19904b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
