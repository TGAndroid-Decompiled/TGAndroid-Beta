package defpackage;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gjc implements RequestDelegate {
    public final byte a;
    public final VoIPService b;
    public final cf7 c;

    public gjc(VoIPService voIPService, cf7 cf7Var, byte b) {
        this.a = b;
        this.b = voIPService;
        this.c = cf7Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        cf7 cf7Var = this.c;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$acceptIncomingCall$99(cf7Var, tLObject, tL_error);
                return;
            default:
                voIPService.lambda$startOutgoingCall$11(cf7Var, tLObject, tL_error);
                return;
        }
    }
}
