package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class t implements Utilities.Callback2 {
    public final int f19420a;
    public final VoIPService f19421b;

    public t(VoIPService voIPService, int i10) {
        this.f19420a = i10;
        this.f19421b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f19420a) {
            case 0:
                this.f19421b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f19421b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
