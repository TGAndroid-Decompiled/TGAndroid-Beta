package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class jo2 implements i8c {
    public final byte a;
    public final mo2 b;

    public jo2(mo2 mo2Var, byte b) {
        this.a = b;
        this.b = mo2Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        boolean z = false;
        mo2 mo2Var = this.b;
        switch (b) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                mo2Var.q.dismiss();
                mo2Var.q = null;
                mo2Var.r = 0;
                if (tL_error != null) {
                    mo2Var.c.g0(tL_error, false);
                    return;
                }
                lo2 lo2Var = mo2Var.h;
                if (lo2Var != null) {
                    lo2Var.close();
                    return;
                }
                return;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                mo2Var.m = false;
                if (peerLinkRequests != null) {
                    mo2Var.j.addAll(peerLinkRequests.requests);
                    String str = peerLinkRequests.next_offset;
                    mo2Var.k = str;
                    mo2Var.l = peerLinkRequests.total_count;
                    if (str == null) {
                        z = true;
                    }
                    mo2Var.n = z;
                    mo2Var.a();
                    lo2 lo2Var2 = mo2Var.h;
                    if (lo2Var2 != null) {
                        lo2Var2.U0();
                        return;
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (tL_error3 != null) {
                    mo2Var.c.g0(tL_error3, false);
                    return;
                }
                return;
        }
    }
}
