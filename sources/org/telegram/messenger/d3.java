package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d3 implements RequestDelegate {
    public final int f23612a;
    public final w10 f23613b;

    public d3(w10 w10Var, int i7) {
        this.f23612a = i7;
        this.f23613b = w10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.ChannelParticipant channelParticipant;
        switch (this.f23612a) {
            case 0:
                g0.g3(new yf(tLObject, this.f23613b, tL_error));
                return;
            default:
                w10 w10Var = this.f23613b;
                if (w10Var != null) {
                    if (tLObject instanceof TLRPC.TL_channels_channelParticipant) {
                        channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                    } else {
                        channelParticipant = null;
                    }
                    w10Var.a(channelParticipant);
                    return;
                }
                return;
        }
    }
}
