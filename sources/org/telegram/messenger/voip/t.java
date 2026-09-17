package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class t implements Utilities.Callback2 {
    public final int f19434a;
    public final VoIPService f19435b;

    public t(VoIPService voIPService, int i10) {
        this.f19434a = i10;
        this.f19435b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f19434a) {
            case 0:
                this.f19435b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f19435b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
