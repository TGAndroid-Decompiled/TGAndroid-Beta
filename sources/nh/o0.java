package nh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class o0 implements Utilities.Callback2 {
    public final int f18693a;
    public final q0 f18694b;

    public o0(q0 q0Var, int i9) {
        this.f18693a = i9;
        this.f18694b = q0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18693a) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                q0 q0Var = this.f18694b;
                q0Var.f18712q.dismiss();
                q0Var.f18712q = null;
                q0Var.f18713r = 0;
                if (tL_error != null) {
                    q0Var.f18700c.d0(tL_error, false);
                    return;
                }
                p0 p0Var = q0Var.h;
                if (p0Var != null) {
                    p0Var.close();
                    return;
                }
                return;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                q0 q0Var2 = this.f18694b;
                boolean z10 = false;
                q0Var2.f18708m = false;
                if (peerLinkRequests != null) {
                    ArrayList arrayList = q0Var2.f18705j;
                    if (arrayList == null) {
                        q0Var2.f18705j = new ArrayList(peerLinkRequests.requests);
                    } else {
                        arrayList.addAll(peerLinkRequests.requests);
                    }
                    String str = peerLinkRequests.next_offset;
                    q0Var2.f18706k = str;
                    q0Var2.f18707l = peerLinkRequests.total_count;
                    if (str == null) {
                        z10 = true;
                    }
                    q0Var2.f18709n = z10;
                    q0Var2.a();
                    p0 p0Var2 = q0Var2.h;
                    if (p0Var2 != null) {
                        p0Var2.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                q0 q0Var3 = this.f18694b;
                if (tL_error3 != null) {
                    q0Var3.f18700c.d0(tL_error3, false);
                    return;
                } else {
                    q0Var3.getClass();
                    return;
                }
        }
    }
}
