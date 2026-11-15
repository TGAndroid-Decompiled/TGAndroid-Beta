package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c3 implements RequestDelegate {
    public final int f22800a;
    public final z10 f22801b;

    public c3(z10 z10Var, int i7) {
        this.f22800a = i7;
        this.f22801b = z10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.ChannelParticipant channelParticipant;
        switch (this.f22800a) {
            case 0:
                g0.h3(new mg(tLObject, this.f22801b, tL_error));
                return;
            default:
                z10 z10Var = this.f22801b;
                if (z10Var != null) {
                    if (tLObject instanceof TLRPC.TL_channels_channelParticipant) {
                        channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                    } else {
                        channelParticipant = null;
                    }
                    z10Var.a(channelParticipant);
                    return;
                }
                return;
        }
    }
}
