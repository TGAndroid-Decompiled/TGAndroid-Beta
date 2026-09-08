package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class t implements Utilities.Callback2 {
    public final int f19447a;
    public final VoIPService f19448b;

    public t(VoIPService voIPService, int i10) {
        this.f19447a = i10;
        this.f19448b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f19447a) {
            case 0:
                this.f19448b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f19448b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
