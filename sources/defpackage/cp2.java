package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class cp2 implements icc {
    public final byte a;
    public final fp2 b;

    public cp2(fp2 fp2Var, byte b) {
        this.a = b;
        this.b = fp2Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        boolean z = false;
        fp2 fp2Var = this.b;
        switch (b) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                fp2Var.q.dismiss();
                fp2Var.q = null;
                fp2Var.r = 0;
                if (tL_error != null) {
                    fp2Var.c.g0(tL_error, false);
                    return;
                }
                ep2 ep2Var = fp2Var.h;
                if (ep2Var != null) {
                    ep2Var.close();
                    return;
                }
                return;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                fp2Var.m = false;
                if (peerLinkRequests != null) {
                    fp2Var.j.addAll(peerLinkRequests.requests);
                    String str = peerLinkRequests.next_offset;
                    fp2Var.k = str;
                    fp2Var.l = peerLinkRequests.total_count;
                    if (str == null) {
                        z = true;
                    }
                    fp2Var.n = z;
                    fp2Var.a();
                    ep2 ep2Var2 = fp2Var.h;
                    if (ep2Var2 != null) {
                        ep2Var2.W();
                        return;
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (tL_error3 != null) {
                    fp2Var.c.g0(tL_error3, false);
                    return;
                }
                return;
        }
    }
}
