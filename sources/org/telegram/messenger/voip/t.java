package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class t implements Utilities.Callback2 {
    public final int f17948a;
    public final VoIPService f17949b;

    public t(VoIPService voIPService, int i10) {
        this.f17948a = i10;
        this.f17949b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f17948a) {
            case 0:
                this.f17949b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f17949b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
