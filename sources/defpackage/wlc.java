package defpackage;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wlc implements RequestDelegate {
    public final byte a;
    public final VoIPService b;
    public final kf7 c;

    public wlc(VoIPService voIPService, kf7 kf7Var, byte b) {
        this.a = b;
        this.b = voIPService;
        this.c = kf7Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        kf7 kf7Var = this.c;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$startOutgoingCall$11(kf7Var, tLObject, tL_error);
                return;
            default:
                voIPService.lambda$acceptIncomingCall$100(kf7Var, tLObject, tL_error);
                return;
        }
    }
}
