package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ei1 implements Runnable {
    public final byte a;
    public final zi1 b;

    public ei1(zi1 zi1Var, byte b) {
        this.a = b;
        this.b = zi1Var;
    }

    @Override
    public final void run() {
        boolean z;
        byte b = this.a;
        boolean z2 = false;
        zi1 zi1Var = this.b;
        switch (b) {
            case 0:
                d01.t(zi1Var.getContext(), k96.M0(2131748212, null));
                return;
            case 1:
                d01.t(zi1Var.getContext(), k96.M0(2131748178, null));
                return;
            case 2:
                q5c q5cVar = zi1Var.X0;
                if (q5cVar != null) {
                    boolean z3 = zi1Var.f0;
                    if (zi1Var.R0 != -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    l5c l5cVar = q5cVar.g3;
                    if (z == zi1Var.a1.a()) {
                        z2 = true;
                    }
                    l5cVar.O(z2);
                    if (z3 && zi1Var.R0 != -1) {
                        zi1Var.a();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                zi1Var.k1 = zi1Var.j1;
                return;
            case 4:
                zi1Var.J0.setLoading(false);
                return;
            case 5:
                zi1Var.Y0.setVisibility(8);
                return;
            case 6:
                zi1Var.Y0.setVisibility(8);
                return;
            default:
                int i = zi1Var.o0;
                gl.r(zi1Var.s1);
                if (zi1Var.j1 != zi1Var.k1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = na7.q1(i).f1(-zi1Var.p0);
                    tL_channels_restrictSponsoredMessages.restricted = zi1Var.j1;
                    ConnectionsManager.getInstance(i).sendRequest(tL_channels_restrictSponsoredMessages, new ii1(zi1Var, (byte) 0));
                    return;
                }
                return;
        }
    }
}
