package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class r implements Utilities.Callback2 {
    public final int f21685a;
    public final VoIPService f21686b;

    public r(VoIPService voIPService, int i10) {
        this.f21685a = i10;
        this.f21686b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f21685a) {
            case 0:
                this.f21686b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f21686b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
