package li;

import java.util.ArrayList;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class i0 implements q10 {
    public final int f19946a;
    public final k0 f19947b;

    public i0(k0 k0Var, int i7) {
        this.f19946a = i7;
        this.f19947b = k0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f19946a) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                k0 k0Var = this.f19947b;
                k0Var.f19965q.dismiss();
                k0Var.f19965q = null;
                k0Var.f19966r = 0;
                if (tL_error != null) {
                    k0Var.f19953c.g0(tL_error, false);
                    return;
                }
                j0 j0Var = k0Var.h;
                if (j0Var != null) {
                    j0Var.close();
                    return;
                }
                return;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                k0 k0Var2 = this.f19947b;
                boolean z10 = false;
                k0Var2.f19961m = false;
                if (peerLinkRequests != null) {
                    ArrayList arrayList = k0Var2.f19958j;
                    if (arrayList == null) {
                        k0Var2.f19958j = new ArrayList(peerLinkRequests.requests);
                    } else {
                        arrayList.addAll(peerLinkRequests.requests);
                    }
                    String str = peerLinkRequests.next_offset;
                    k0Var2.f19959k = str;
                    k0Var2.f19960l = peerLinkRequests.total_count;
                    if (str == null) {
                        z10 = true;
                    }
                    k0Var2.f19962n = z10;
                    k0Var2.a();
                    j0 j0Var2 = k0Var2.h;
                    if (j0Var2 != null) {
                        j0Var2.F();
                        return;
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                k0 k0Var3 = this.f19947b;
                if (tL_error3 != null) {
                    k0Var3.f19953c.g0(tL_error3, false);
                    return;
                } else {
                    k0Var3.getClass();
                    return;
                }
        }
    }
}
