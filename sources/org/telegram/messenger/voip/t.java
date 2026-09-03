package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class t implements Utilities.Callback2 {
    public final int f18820a;
    public final VoIPService f18821b;

    public t(VoIPService voIPService, int i10) {
        this.f18820a = i10;
        this.f18821b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f18820a) {
            case 0:
                this.f18821b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f18821b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
