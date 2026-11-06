package org.telegram.messenger.voip;

import org.telegram.messenger.v10;
public final class s implements v10 {
    public final int f26167a;
    public final VoIPService f26168b;

    public s(VoIPService voIPService, int i7) {
        this.f26167a = i7;
        this.f26168b = voIPService;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f26167a) {
            case 0:
                this.f26168b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f26168b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
