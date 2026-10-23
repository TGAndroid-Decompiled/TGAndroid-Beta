package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class s implements Utilities.Callback2 {
    public final int f19927a;
    public final VoIPService f19928b;

    public s(VoIPService voIPService, int i10) {
        this.f19927a = i10;
        this.f19928b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f19927a) {
            case 0:
                this.f19928b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f19928b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
