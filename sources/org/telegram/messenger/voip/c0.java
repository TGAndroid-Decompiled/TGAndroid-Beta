package org.telegram.messenger.voip;

import org.telegram.messenger.vr;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c0 implements RequestDelegate {
    public final int f27106a;
    public final VoIPService f27107b;
    public final vr f27108c;

    public c0(VoIPService voIPService, vr vrVar, int i7) {
        this.f27106a = i7;
        this.f27107b = voIPService;
        this.f27108c = vrVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27106a) {
            case 0:
                this.f27107b.lambda$acceptIncomingCall$103(this.f27108c, tLObject, tL_error);
                return;
            default:
                this.f27107b.lambda$startOutgoingCall$11(this.f27108c, tLObject, tL_error);
                return;
        }
    }
}
