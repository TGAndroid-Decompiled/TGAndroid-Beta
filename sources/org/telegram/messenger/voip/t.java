package org.telegram.messenger.voip;

import org.telegram.messenger.s10;
public final class t implements s10 {
    public final int f27187a;
    public final VoIPService f27188b;

    public t(VoIPService voIPService, int i7) {
        this.f27187a = i7;
        this.f27188b = voIPService;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f27187a) {
            case 0:
                this.f27188b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f27188b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
