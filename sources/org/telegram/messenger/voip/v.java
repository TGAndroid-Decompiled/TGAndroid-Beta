package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.Callback2 {
    public final int f18866a;
    public final VoIPService f18867b;

    public v(VoIPService voIPService, int i10) {
        this.f18866a = i10;
        this.f18867b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f18866a) {
            case 0:
                this.f18867b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f18867b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
