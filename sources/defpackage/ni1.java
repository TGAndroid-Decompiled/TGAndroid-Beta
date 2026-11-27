package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ni1 implements Runnable {
    public final byte a;
    public final ij1 b;

    public ni1(ij1 ij1Var, byte b) {
        this.a = b;
        this.b = ij1Var;
    }

    @Override
    public final void run() {
        boolean z;
        byte b = this.a;
        boolean z2 = false;
        ij1 ij1Var = this.b;
        switch (b) {
            case 0:
                m01.u(ij1Var.getContext(), ob6.M0(2131748158, null));
                return;
            case 1:
                m01.u(ij1Var.getContext(), ob6.M0(2131748124, null));
                return;
            case 2:
                q9c q9cVar = ij1Var.X0;
                if (q9cVar != null) {
                    boolean z3 = ij1Var.f0;
                    if (ij1Var.R0 != -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    l9c l9cVar = q9cVar.g3;
                    if (z == ij1Var.a1.a()) {
                        z2 = true;
                    }
                    l9cVar.O(z2);
                    if (z3 && ij1Var.R0 != -1) {
                        ij1Var.a();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ij1Var.k1 = ij1Var.j1;
                return;
            case 4:
                ij1Var.J0.setLoading(false);
                return;
            case 5:
                ij1Var.Y0.setVisibility(8);
                return;
            case 6:
                ij1Var.Y0.setVisibility(8);
                return;
            default:
                int i = ij1Var.o0;
                hl.r(ij1Var.s1);
                if (ij1Var.j1 != ij1Var.k1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = uc7.s1(i).h1(-ij1Var.p0);
                    tL_channels_restrictSponsoredMessages.restricted = ij1Var.j1;
                    ConnectionsManager.getInstance(i).sendRequest(tL_channels_restrictSponsoredMessages, new ri1(ij1Var, (byte) 0));
                    return;
                }
                return;
        }
    }
}
