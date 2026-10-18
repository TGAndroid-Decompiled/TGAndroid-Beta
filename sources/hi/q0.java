package hi;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class q0 implements Utilities.Callback2 {
    public final int f12210a;
    public final s0 f12211b;

    public q0(s0 s0Var, int i10) {
        this.f12210a = i10;
        this.f12211b = s0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f12210a) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                s0 s0Var = this.f12211b;
                s0Var.f12234q.dismiss();
                s0Var.f12234q = null;
                s0Var.f12235r = 0;
                if (tL_error != null) {
                    s0Var.f12223c.f0(tL_error, false);
                    return;
                }
                r0 r0Var = s0Var.h;
                if (r0Var != null) {
                    r0Var.close();
                    return;
                }
                return;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                s0 s0Var2 = this.f12211b;
                boolean z10 = false;
                s0Var2.f12230m = false;
                if (peerLinkRequests != null) {
                    ArrayList arrayList = s0Var2.f12227j;
                    if (arrayList == null) {
                        s0Var2.f12227j = new ArrayList(peerLinkRequests.requests);
                    } else {
                        arrayList.addAll(peerLinkRequests.requests);
                    }
                    String str = peerLinkRequests.next_offset;
                    s0Var2.f12228k = str;
                    s0Var2.f12229l = peerLinkRequests.total_count;
                    if (str == null) {
                        z10 = true;
                    }
                    s0Var2.f12231n = z10;
                    s0Var2.a();
                    r0 r0Var2 = s0Var2.h;
                    if (r0Var2 != null) {
                        r0Var2.p();
                        return;
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                s0 s0Var3 = this.f12211b;
                if (tL_error3 != null) {
                    s0Var3.f12223c.f0(tL_error3, false);
                    return;
                } else {
                    s0Var3.getClass();
                    return;
                }
        }
    }
}
