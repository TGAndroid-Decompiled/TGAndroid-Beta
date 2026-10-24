package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class s implements Utilities.Callback2 {
    public final int f19987a;
    public final VoIPService f19988b;

    public s(VoIPService voIPService, int i10) {
        this.f19987a = i10;
        this.f19988b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f19987a) {
            case 0:
                this.f19988b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f19988b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
