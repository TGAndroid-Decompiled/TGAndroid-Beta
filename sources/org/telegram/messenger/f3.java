package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f3 implements RequestDelegate {
    public final int f15504a;
    public final q20 f15505b;

    public f3(q20 q20Var, int i10) {
        this.f15504a = i10;
        this.f15505b = q20Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.ChannelParticipant channelParticipant;
        switch (this.f15504a) {
            case 0:
                i0.g3(new mg(tLObject, this.f15505b, tL_error));
                return;
            default:
                q20 q20Var = this.f15505b;
                if (q20Var != null) {
                    if (tLObject instanceof TLRPC.TL_channels_channelParticipant) {
                        channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                    } else {
                        channelParticipant = null;
                    }
                    q20Var.a(channelParticipant);
                    return;
                }
                return;
        }
    }
}
