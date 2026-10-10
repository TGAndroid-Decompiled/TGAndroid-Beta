package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.Callback2 {
    public final int f19634a;
    public final VoIPService f19635b;

    public v(VoIPService voIPService, int i10) {
        this.f19634a = i10;
        this.f19635b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f19634a) {
            case 0:
                this.f19635b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f19635b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
