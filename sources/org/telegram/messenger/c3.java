package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c3 implements RequestDelegate {
    public final int f21781a;
    public final c20 f21782b;

    public c3(c20 c20Var, int i7) {
        this.f21781a = i7;
        this.f21782b = c20Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.ChannelParticipant channelParticipant;
        switch (this.f21781a) {
            case 0:
                g0.h3(new ng(tLObject, this.f21782b, tL_error));
                return;
            default:
                c20 c20Var = this.f21782b;
                if (c20Var != null) {
                    if (tLObject instanceof TLRPC.TL_channels_channelParticipant) {
                        channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                    } else {
                        channelParticipant = null;
                    }
                    c20Var.a(channelParticipant);
                    return;
                }
                return;
        }
    }
}
