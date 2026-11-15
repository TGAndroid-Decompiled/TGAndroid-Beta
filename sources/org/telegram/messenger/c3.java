package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c3 implements RequestDelegate {
    public final int f22796a;
    public final z10 f22797b;

    public c3(z10 z10Var, int i7) {
        this.f22796a = i7;
        this.f22797b = z10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.ChannelParticipant channelParticipant;
        switch (this.f22796a) {
            case 0:
                g0.h3(new mg(tLObject, this.f22797b, tL_error));
                return;
            default:
                z10 z10Var = this.f22797b;
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
