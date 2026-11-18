package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d3 implements RequestDelegate {
    public final int f23484a;
    public final x10 f23485b;

    public d3(x10 x10Var, int i7) {
        this.f23484a = i7;
        this.f23485b = x10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.ChannelParticipant channelParticipant;
        switch (this.f23484a) {
            case 0:
                g0.g3(new yf(tLObject, this.f23485b, tL_error));
                return;
            default:
                x10 x10Var = this.f23485b;
                if (x10Var != null) {
                    if (tLObject instanceof TLRPC.TL_channels_channelParticipant) {
                        channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                    } else {
                        channelParticipant = null;
                    }
                    x10Var.a(channelParticipant);
                    return;
                }
                return;
        }
    }
}
