package li;

import java.util.ArrayList;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class h0 implements p10 {
    public final int f20037a;
    public final j0 f20038b;

    public h0(j0 j0Var, int i7) {
        this.f20037a = i7;
        this.f20038b = j0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f20037a) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                j0 j0Var = this.f20038b;
                j0Var.f20056q.dismiss();
                j0Var.f20056q = null;
                j0Var.f20057r = 0;
                if (tL_error != null) {
                    j0Var.f20044c.g0(tL_error, false);
                    return;
                }
                i0 i0Var = j0Var.h;
                if (i0Var != null) {
                    i0Var.close();
                    return;
                }
                return;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                j0 j0Var2 = this.f20038b;
                boolean z10 = false;
                j0Var2.f20052m = false;
                if (peerLinkRequests != null) {
                    ArrayList arrayList = j0Var2.f20049j;
                    if (arrayList == null) {
                        j0Var2.f20049j = new ArrayList(peerLinkRequests.requests);
                    } else {
                        arrayList.addAll(peerLinkRequests.requests);
                    }
                    String str = peerLinkRequests.next_offset;
                    j0Var2.f20050k = str;
                    j0Var2.f20051l = peerLinkRequests.total_count;
                    if (str == null) {
                        z10 = true;
                    }
                    j0Var2.f20053n = z10;
                    j0Var2.a();
                    i0 i0Var2 = j0Var2.h;
                    if (i0Var2 != null) {
                        i0Var2.o();
                        return;
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                j0 j0Var3 = this.f20038b;
                if (tL_error3 != null) {
                    j0Var3.f20044c.g0(tL_error3, false);
                    return;
                } else {
                    j0Var3.getClass();
                    return;
                }
        }
    }
}
