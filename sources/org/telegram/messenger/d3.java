package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d3 implements RequestDelegate {
    public final int f23501a;
    public final y10 f23502b;

    public d3(y10 y10Var, int i7) {
        this.f23501a = i7;
        this.f23502b = y10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.ChannelParticipant channelParticipant;
        switch (this.f23501a) {
            case 0:
                g0.g3(new zf(tLObject, this.f23502b, tL_error));
                return;
            default:
                y10 y10Var = this.f23502b;
                if (y10Var != null) {
                    if (tLObject instanceof TLRPC.TL_channels_channelParticipant) {
                        channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                    } else {
                        channelParticipant = null;
                    }
                    y10Var.a(channelParticipant);
                    return;
                }
                return;
        }
    }
}
