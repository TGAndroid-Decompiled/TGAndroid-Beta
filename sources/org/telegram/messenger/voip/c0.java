package org.telegram.messenger.voip;

import org.telegram.messenger.vr;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c0 implements RequestDelegate {
    public final int f27107a;
    public final VoIPService f27108b;
    public final vr f27109c;

    public c0(VoIPService voIPService, vr vrVar, int i7) {
        this.f27107a = i7;
        this.f27108b = voIPService;
        this.f27109c = vrVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27107a) {
            case 0:
                this.f27108b.lambda$acceptIncomingCall$103(this.f27109c, tLObject, tL_error);
                return;
            default:
                this.f27108b.lambda$startOutgoingCall$11(this.f27109c, tLObject, tL_error);
                return;
        }
    }
}
