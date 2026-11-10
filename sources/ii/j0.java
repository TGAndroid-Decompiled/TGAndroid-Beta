package ii;

import java.util.ArrayList;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class j0 implements v10 {
    public final int f15550a;
    public final l0 f15551b;

    public j0(l0 l0Var, int i7) {
        this.f15550a = i7;
        this.f15551b = l0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f15550a) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                l0 l0Var = this.f15551b;
                l0Var.f15574q.dismiss();
                l0Var.f15574q = null;
                l0Var.f15575r = 0;
                if (tL_error != null) {
                    l0Var.f15562c.f0(tL_error, false);
                    return;
                }
                k0 k0Var = l0Var.h;
                if (k0Var != null) {
                    k0Var.close();
                    return;
                }
                return;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                l0 l0Var2 = this.f15551b;
                boolean z9 = false;
                l0Var2.f15570m = false;
                if (peerLinkRequests != null) {
                    ArrayList arrayList = l0Var2.f15567j;
                    if (arrayList == null) {
                        l0Var2.f15567j = new ArrayList(peerLinkRequests.requests);
                    } else {
                        arrayList.addAll(peerLinkRequests.requests);
                    }
                    String str = peerLinkRequests.next_offset;
                    l0Var2.f15568k = str;
                    l0Var2.f15569l = peerLinkRequests.total_count;
                    if (str == null) {
                        z9 = true;
                    }
                    l0Var2.f15571n = z9;
                    l0Var2.a();
                    k0 k0Var2 = l0Var2.h;
                    if (k0Var2 != null) {
                        k0Var2.u();
                        return;
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                l0 l0Var3 = this.f15551b;
                if (tL_error3 != null) {
                    l0Var3.f15562c.f0(tL_error3, false);
                    return;
                } else {
                    l0Var3.getClass();
                    return;
                }
        }
    }
}
