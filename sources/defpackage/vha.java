package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vha implements rv9, kj6 {
    public final xha a;

    public vha(xha xhaVar) {
        this.a = xhaVar;
    }

    @Override
    public final boolean C1(int i) {
        return true;
    }

    @Override
    public final zh6 D0() {
        return null;
    }

    @Override
    public final zh6 Z0() {
        return null;
    }

    @Override
    public final boolean a(lj6 lj6Var, boolean z) {
        int intValue = ((Integer) lj6Var.getTag()).intValue();
        xha xhaVar = this.a;
        TLObject E = xhaVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = r47.B1(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return xhaVar.s.G1.g(tL_chatChannelParticipant, true, !z, lj6Var);
        }
        return false;
    }

    @Override
    public final void p(int i) {
        xha xhaVar = this.a;
        xhaVar.f();
        if (i == 1) {
            int i2 = xhaVar.r - 1;
            xhaVar.r = i2;
            if (i2 == 0) {
                int i3 = 0;
                while (true) {
                    eja ejaVar = xhaVar.s;
                    zha[] zhaVarArr = ejaVar.n0;
                    if (i3 < zhaVarArr.length) {
                        zha zhaVar = zhaVarArr[i3];
                        if (zhaVar.F == 7) {
                            if (xhaVar.h == 0) {
                                zhaVar.w.e(false, true);
                            } else {
                                ejaVar.i(zhaVar.h, 0, null);
                            }
                        }
                        i3++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final void X1(ArrayList arrayList) {
    }
}
