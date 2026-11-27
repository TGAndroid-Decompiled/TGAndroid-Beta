package defpackage;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nlc implements Runnable {
    public final byte a;
    public final VoIPService b;
    public final TLRPC.TL_error c;
    public final TLObject d;

    public nlc(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = (byte) 2;
        this.b = voIPService;
        this.d = tLObject;
        this.c = tL_error;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_error tL_error = this.c;
        TLObject tLObject = this.d;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$acceptIncomingCall$98(tL_error, tLObject);
                return;
            case 1:
                voIPService.lambda$processAcceptedCall$22(tL_error, tLObject);
                return;
            default:
                voIPService.lambda$startGroupCheckShortpoll$64(tLObject, tL_error);
                return;
        }
    }

    public nlc(VoIPService voIPService, TLRPC.TL_error tL_error, TLObject tLObject, byte b) {
        this.a = b;
        this.b = voIPService;
        this.c = tL_error;
        this.d = tLObject;
    }
}
