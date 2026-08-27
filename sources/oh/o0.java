package oh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

public final class o0 implements Utilities.Callback2 {

    public final int f19542a;

    public final q0 f19543b;

    public o0(q0 q0Var, int i10) {
        this.f19542a = i10;
        this.f19543b = q0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19542a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                q0 q0Var = this.f19543b;
                q0Var.f19561q.dismiss();
                q0Var.f19561q = null;
                q0Var.f19562r = 0;
                if (tL_error == null) {
                    p0 p0Var = q0Var.h;
                    if (p0Var != null) {
                        p0Var.close();
                    }
                } else {
                    q0Var.f19549c.d0(tL_error, false);
                }
                break;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                q0 q0Var2 = this.f19543b;
                q0Var2.f19557m = false;
                if (peerLinkRequests != null) {
                    ArrayList arrayList = q0Var2.f19554j;
                    if (arrayList == null) {
                        q0Var2.f19554j = new ArrayList(peerLinkRequests.requests);
                    } else {
                        arrayList.addAll(peerLinkRequests.requests);
                    }
                    String str = peerLinkRequests.next_offset;
                    q0Var2.f19555k = str;
                    q0Var2.f19556l = peerLinkRequests.total_count;
                    q0Var2.f19558n = str == null;
                    q0Var2.a();
                    p0 p0Var2 = q0Var2.h;
                    if (p0Var2 != null) {
                        p0Var2.i();
                    }
                }
                break;
            default:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                q0 q0Var3 = this.f19543b;
                if (tL_error2 == null) {
                    q0Var3.getClass();
                } else {
                    q0Var3.f19549c.d0(tL_error2, false);
                }
                break;
        }
    }
}
