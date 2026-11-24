package defpackage;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fhc implements RequestDelegate {
    public final byte a;
    public final VoIPService b;
    public final ad7 c;

    public fhc(VoIPService voIPService, ad7 ad7Var, byte b) {
        this.a = b;
        this.b = voIPService;
        this.c = ad7Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        ad7 ad7Var = this.c;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$acceptIncomingCall$99(ad7Var, tLObject, tL_error);
                return;
            default:
                voIPService.lambda$startOutgoingCall$11(ad7Var, tLObject, tL_error);
                return;
        }
    }
}
