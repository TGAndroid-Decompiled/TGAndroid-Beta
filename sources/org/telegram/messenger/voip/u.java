package org.telegram.messenger.voip;

import org.telegram.messenger.Utilities;
public final class u implements Utilities.Callback2 {
    public final int f19397a;
    public final VoIPService f19398b;

    public u(VoIPService voIPService, int i10) {
        this.f19397a = i10;
        this.f19398b = voIPService;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f19397a) {
            case 0:
                this.f19398b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f19398b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
