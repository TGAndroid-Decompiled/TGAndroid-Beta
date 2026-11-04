package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c3 implements RequestDelegate {
    public final int f21936a;
    public final u10 f21937b;

    public c3(u10 u10Var, int i3) {
        this.f21936a = i3;
        this.f21937b = u10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.ChannelParticipant channelParticipant;
        switch (this.f21936a) {
            case 0:
                g0.h3(new fg(tLObject, this.f21937b, tL_error));
                return;
            default:
                u10 u10Var = this.f21937b;
                if (u10Var != null) {
                    if (tLObject instanceof TLRPC.TL_channels_channelParticipant) {
                        channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                    } else {
                        channelParticipant = null;
                    }
                    u10Var.a(channelParticipant);
                    return;
                }
                return;
        }
    }
}
