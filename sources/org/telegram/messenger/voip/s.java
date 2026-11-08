package org.telegram.messenger.voip;

import org.telegram.messenger.v10;
public final class s implements v10 {
    public final int f26173a;
    public final VoIPService f26174b;

    public s(VoIPService voIPService, int i7) {
        this.f26173a = i7;
        this.f26174b = voIPService;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f26173a) {
            case 0:
                this.f26174b.lambda$switchToSpeaker$91(bool, bool2);
                return;
            default:
                this.f26174b.lambda$toggleSpeakerphoneOrShowRouteSheet$95(bool, bool2);
                return;
        }
    }
}
