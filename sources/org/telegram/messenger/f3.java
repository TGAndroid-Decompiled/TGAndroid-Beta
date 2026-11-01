package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f3 implements RequestDelegate {
    public final int f15688a;
    public final r20 f15689b;

    public f3(r20 r20Var, int i10) {
        this.f15688a = i10;
        this.f15689b = r20Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.ChannelParticipant channelParticipant;
        switch (this.f15688a) {
            case 0:
                i0.g3(new ng(tLObject, this.f15689b, tL_error));
                return;
            default:
                r20 r20Var = this.f15689b;
                if (r20Var != null) {
                    if (tLObject instanceof TLRPC.TL_channels_channelParticipant) {
                        channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                    } else {
                        channelParticipant = null;
                    }
                    r20Var.a(channelParticipant);
                    return;
                }
                return;
        }
    }
}
