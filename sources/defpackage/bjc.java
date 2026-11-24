package defpackage;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bjc implements Runnable {
    public final byte a;
    public final VoIPService b;
    public final TLObject c;
    public final TLRPC.TL_error d;

    public bjc(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = (byte) 1;
        this.b = voIPService;
        this.c = tLObject;
        this.d = tL_error;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLObject tLObject = this.c;
        TLRPC.TL_error tL_error = this.d;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$acceptIncomingCall$97(tL_error, tLObject);
                return;
            case 1:
                voIPService.lambda$startGroupCheckShortpoll$64(tLObject, tL_error);
                return;
            default:
                voIPService.lambda$processAcceptedCall$22(tL_error, tLObject);
                return;
        }
    }

    public bjc(VoIPService voIPService, TLRPC.TL_error tL_error, TLObject tLObject, byte b) {
        this.a = b;
        this.b = voIPService;
        this.d = tL_error;
        this.c = tLObject;
    }
}
