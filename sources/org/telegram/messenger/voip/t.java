package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class t implements Utilities.Callback2 {
    public final int f20471a;
    public final VoIPService f20472b;

    public t(VoIPService voIPService, int i10) {
        this.f20471a = i10;
        this.f20472b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f20471a) {
            case 0:
                this.f20472b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f20472b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
