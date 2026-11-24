package defpackage;

import org.telegram.messenger.voip.VoIPService;
public final class tjc implements jac {
    public final byte a;
    public final VoIPService b;

    public tjc(VoIPService voIPService, byte b) {
        this.a = b;
        this.b = voIPService;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        VoIPService voIPService = this.b;
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (b) {
            case 0:
                voIPService.lambda$switchToSpeaker$87(bool, bool2);
                return;
            default:
                voIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$91(bool, bool2);
                return;
        }
    }
}
