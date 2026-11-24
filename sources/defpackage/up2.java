package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class up2 implements jac {
    public final byte a;
    public final xp2 b;

    public up2(xp2 xp2Var, byte b) {
        this.a = b;
        this.b = xp2Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        boolean z = false;
        xp2 xp2Var = this.b;
        switch (b) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                xp2Var.q.dismiss();
                xp2Var.q = null;
                xp2Var.r = 0;
                if (tL_error != null) {
                    xp2Var.c.g0(tL_error, false);
                    return;
                }
                wp2 wp2Var = xp2Var.h;
                if (wp2Var != null) {
                    wp2Var.close();
                    return;
                }
                return;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                xp2Var.m = false;
                if (peerLinkRequests != null) {
                    xp2Var.j.addAll(peerLinkRequests.requests);
                    String str = peerLinkRequests.next_offset;
                    xp2Var.k = str;
                    xp2Var.l = peerLinkRequests.total_count;
                    if (str == null) {
                        z = true;
                    }
                    xp2Var.n = z;
                    xp2Var.a();
                    wp2 wp2Var2 = xp2Var.h;
                    if (wp2Var2 != null) {
                        wp2Var2.U();
                        return;
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (tL_error3 != null) {
                    xp2Var.c.g0(tL_error3, false);
                    return;
                }
                return;
        }
    }
}
