package org.telegram.messenger.voip;

import org.telegram.messenger.v10;
public final class s implements v10 {
    public final int f26159a;
    public final VoIPService f26160b;

    public s(VoIPService voIPService, int i7) {
        this.f26159a = i7;
        this.f26160b = voIPService;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f26159a) {
            case 0:
                this.f26160b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f26160b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
