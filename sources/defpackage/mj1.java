package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class mj1 implements Runnable {
    public final byte a;
    public final ik1 b;

    public mj1(ik1 ik1Var, byte b) {
        this.a = b;
        this.b = ik1Var;
    }

    @Override
    public final void run() {
        boolean z;
        byte b = this.a;
        boolean z2 = false;
        ik1 ik1Var = this.b;
        switch (b) {
            case 0:
                l11.u(ik1Var.getContext(), jb6.M0(2131748161, null));
                return;
            case 1:
                l11.u(ik1Var.getContext(), jb6.M0(2131748127, null));
                return;
            case 2:
                q7c q7cVar = ik1Var.X0;
                if (q7cVar != null) {
                    boolean z3 = ik1Var.f0;
                    if (ik1Var.R0 != -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    l7c l7cVar = q7cVar.g3;
                    if (z == ik1Var.a1.a()) {
                        z2 = true;
                    }
                    l7cVar.O(z2);
                    if (z3 && ik1Var.R0 != -1) {
                        ik1Var.a();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ik1Var.k1 = ik1Var.j1;
                return;
            case 4:
                ik1Var.J0.setLoading(false);
                return;
            case 5:
                ik1Var.Y0.setVisibility(8);
                return;
            case 6:
                ik1Var.Y0.setVisibility(8);
                return;
            default:
                int i = ik1Var.o0;
                gm.r(ik1Var.s1);
                if (ik1Var.j1 != ik1Var.k1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = oc7.r1(i).g1(-ik1Var.p0);
                    tL_channels_restrictSponsoredMessages.restricted = ik1Var.j1;
                    ConnectionsManager.getInstance(i).sendRequest(tL_channels_restrictSponsoredMessages, new qj1(ik1Var, (byte) 0));
                    return;
                }
                return;
        }
    }
}
