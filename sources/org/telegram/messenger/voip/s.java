package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class s implements Utilities.Callback2 {
    public final int f19924a;
    public final VoIPService f19925b;

    public s(VoIPService voIPService, int i10) {
        this.f19924a = i10;
        this.f19925b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f19924a) {
            case 0:
                this.f19925b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f19925b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
