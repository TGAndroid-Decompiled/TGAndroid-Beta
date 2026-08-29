package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class s implements Utilities.Callback2 {
    public final int f22008a;
    public final VoIPService f22009b;

    public s(VoIPService voIPService, int i10) {
        this.f22008a = i10;
        this.f22009b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f22008a) {
            case 0:
                this.f22009b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f22009b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
