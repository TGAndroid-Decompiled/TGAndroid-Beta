package org.telegram.messenger.voip;

import org.telegram.messenger.qr;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements RequestDelegate {
    public final int f25975a;
    public final VoIPService f25976b;
    public final qr f25977c;

    public a0(VoIPService voIPService, qr qrVar, int i3) {
        this.f25975a = i3;
        this.f25976b = voIPService;
        this.f25977c = qrVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25975a) {
            case 0:
                this.f25976b.lambda$acceptIncomingCall$103(this.f25977c, tLObject, tL_error);
                return;
            default:
                this.f25976b.lambda$startOutgoingCall$11(this.f25977c, tLObject, tL_error);
                return;
        }
    }
}
