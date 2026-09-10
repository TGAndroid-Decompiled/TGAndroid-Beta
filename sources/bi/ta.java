package bi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ta implements Utilities.Callback {
    public final int f3690a;
    public final kb f3691b;

    public ta(kb kbVar, int i10) {
        this.f3690a = i10;
        this.f3691b = kbVar;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f3690a) {
            case 0:
                kb kbVar = this.f3691b;
                rb rbVar = kbVar.W;
                rbVar.f3617c = (TLRPC.InputPeer) obj;
                HashSet hashSet = rbVar.v;
                hashSet.clear();
                if (rbVar.K && rbVar.G) {
                    rbVar.G = false;
                }
                Utilities.Callback callback = rbVar.W;
                if (callback != null) {
                    callback.run(rbVar.f3617c);
                }
                ub ubVar = rbVar.X;
                if (ubVar != null) {
                    ubVar.run(new HashSet(hashSet));
                }
                kbVar.g(true);
                return;
            case 1:
                rb rbVar2 = this.f3691b.W;
                i10 = ((org.telegram.ui.ActionBar.h3) rbVar2).currentAccount;
                rbVar2.g1(new pb(5, i10, (ArrayList) obj), new ra(rbVar2, 0), false);
                return;
            case 2:
                kb kbVar2 = this.f3691b;
                rb rbVar3 = kbVar2.W;
                HashSet hashSet2 = rbVar3.v;
                hashSet2.add(Integer.valueOf(((zh.b5) obj).f48308a));
                kbVar2.g(true);
                ub ubVar2 = rbVar3.X;
                if (ubVar2 != null) {
                    ubVar2.run(new HashSet(hashSet2));
                    return;
                }
                return;
            default:
                String str = (String) obj;
                kb kbVar3 = this.f3691b;
                if (str != null) {
                    kbVar3.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                kbVar3.I = str;
                kbVar3.g(false);
                return;
        }
    }
}
