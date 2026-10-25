package ii;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class p0 implements Utilities.Callback2 {
    public final int f14401a;
    public final r0 f14402b;

    public p0(r0 r0Var, int i10) {
        this.f14401a = i10;
        this.f14402b = r0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f14401a) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                r0 r0Var = this.f14402b;
                r0Var.f14426q.dismiss();
                r0Var.f14426q = null;
                r0Var.f14427r = 0;
                if (tL_error != null) {
                    r0Var.f14415c.g0(tL_error, false);
                    return;
                }
                q0 q0Var = r0Var.h;
                if (q0Var != null) {
                    q0Var.close();
                    return;
                }
                return;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                r0 r0Var2 = this.f14402b;
                boolean z10 = false;
                r0Var2.f14422m = false;
                if (peerLinkRequests != null) {
                    ArrayList arrayList = r0Var2.f14419j;
                    if (arrayList == null) {
                        r0Var2.f14419j = new ArrayList(peerLinkRequests.requests);
                    } else {
                        arrayList.addAll(peerLinkRequests.requests);
                    }
                    String str = peerLinkRequests.next_offset;
                    r0Var2.f14420k = str;
                    r0Var2.f14421l = peerLinkRequests.total_count;
                    if (str == null) {
                        z10 = true;
                    }
                    r0Var2.f14423n = z10;
                    r0Var2.a();
                    q0 q0Var2 = r0Var2.h;
                    if (q0Var2 != null) {
                        q0Var2.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                r0 r0Var3 = this.f14402b;
                if (tL_error3 != null) {
                    r0Var3.f14415c.g0(tL_error3, false);
                    return;
                } else {
                    r0Var3.getClass();
                    return;
                }
        }
    }
}
