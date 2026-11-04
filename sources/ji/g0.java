package ji;

import java.util.ArrayList;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class g0 implements n10 {
    public final int f16308a;
    public final i0 f16309b;

    public g0(i0 i0Var, int i3) {
        this.f16308a = i3;
        this.f16309b = i0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f16308a) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                i0 i0Var = this.f16309b;
                i0Var.f16327q.dismiss();
                i0Var.f16327q = null;
                i0Var.f16328r = 0;
                if (tL_error != null) {
                    i0Var.f16315c.f0(tL_error, false);
                    return;
                }
                h0 h0Var = i0Var.h;
                if (h0Var != null) {
                    h0Var.close();
                    return;
                }
                return;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                i0 i0Var2 = this.f16309b;
                boolean z10 = false;
                i0Var2.f16323m = false;
                if (peerLinkRequests != null) {
                    ArrayList arrayList = i0Var2.f16320j;
                    if (arrayList == null) {
                        i0Var2.f16320j = new ArrayList(peerLinkRequests.requests);
                    } else {
                        arrayList.addAll(peerLinkRequests.requests);
                    }
                    String str = peerLinkRequests.next_offset;
                    i0Var2.f16321k = str;
                    i0Var2.f16322l = peerLinkRequests.total_count;
                    if (str == null) {
                        z10 = true;
                    }
                    i0Var2.f16324n = z10;
                    i0Var2.a();
                    h0 h0Var2 = i0Var2.h;
                    if (h0Var2 != null) {
                        h0Var2.H0();
                        return;
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                i0 i0Var3 = this.f16309b;
                if (tL_error3 != null) {
                    i0Var3.f16315c.f0(tL_error3, false);
                    return;
                } else {
                    i0Var3.getClass();
                    return;
                }
        }
    }
}
