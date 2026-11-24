package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ega implements au9, hj6 {
    public final gga a;

    public ega(gga ggaVar) {
        this.a = ggaVar;
    }

    @Override
    public final boolean F1(int i) {
        return true;
    }

    @Override
    public final vh6 G0() {
        return null;
    }

    @Override
    public final boolean a(ij6 ij6Var, boolean z) {
        int intValue = ((Integer) ij6Var.getTag()).intValue();
        gga ggaVar = this.a;
        TLObject E = ggaVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = k47.B1(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            return ggaVar.s.G1.g(tL_chatChannelParticipant, true, !z, ij6Var);
        }
        return false;
    }

    @Override
    public final vh6 e1() {
        return null;
    }

    @Override
    public final void o(int i) {
        gga ggaVar = this.a;
        ggaVar.f();
        if (i == 1) {
            int i2 = ggaVar.r - 1;
            ggaVar.r = i2;
            if (i2 == 0) {
                int i3 = 0;
                while (true) {
                    nha nhaVar = ggaVar.s;
                    iga[] igaVarArr = nhaVar.n0;
                    if (i3 < igaVarArr.length) {
                        iga igaVar = igaVarArr[i3];
                        if (igaVar.F == 7) {
                            if (ggaVar.h == 0) {
                                igaVar.w.e(false, true);
                            } else {
                                nhaVar.i(igaVar.h, 0, null);
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
    public final void a2(ArrayList arrayList) {
    }
}
