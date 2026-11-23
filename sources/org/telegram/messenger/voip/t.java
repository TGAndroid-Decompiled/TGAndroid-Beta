package org.telegram.messenger.voip;

import org.telegram.messenger.r10;
public final class t implements r10 {
    public final int f27508a;
    public final VoIPService f27509b;

    public t(VoIPService voIPService, int i7) {
        this.f27508a = i7;
        this.f27509b = voIPService;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f27508a) {
            case 0:
                this.f27509b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f27509b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
