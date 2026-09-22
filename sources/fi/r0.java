package fi;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class r0 implements Utilities.Callback2 {
    public final int f9165a;
    public final t0 f9166b;

    public r0(t0 t0Var, int i10) {
        this.f9165a = i10;
        this.f9166b = t0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f9165a) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                t0 t0Var = this.f9166b;
                t0Var.f9189q.dismiss();
                t0Var.f9189q = null;
                t0Var.f9190r = 0;
                if (tL_error != null) {
                    t0Var.f9178c.d0(tL_error, false);
                    return;
                }
                s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.close();
                    return;
                }
                return;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                t0 t0Var2 = this.f9166b;
                boolean z10 = false;
                t0Var2.f9185m = false;
                if (peerLinkRequests != null) {
                    ArrayList arrayList = t0Var2.f9182j;
                    if (arrayList == null) {
                        t0Var2.f9182j = new ArrayList(peerLinkRequests.requests);
                    } else {
                        arrayList.addAll(peerLinkRequests.requests);
                    }
                    String str = peerLinkRequests.next_offset;
                    t0Var2.f9183k = str;
                    t0Var2.f9184l = peerLinkRequests.total_count;
                    if (str == null) {
                        z10 = true;
                    }
                    t0Var2.f9186n = z10;
                    t0Var2.a();
                    s0 s0Var2 = t0Var2.h;
                    if (s0Var2 != null) {
                        s0Var2.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                t0 t0Var3 = this.f9166b;
                if (tL_error3 != null) {
                    t0Var3.f9178c.d0(tL_error3, false);
                    return;
                } else {
                    t0Var3.getClass();
                    return;
                }
        }
    }
}
