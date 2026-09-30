package ci;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n9 implements Utilities.Callback {
    public final int f5217a;
    public final y9 f5218b;

    public n9(y9 y9Var, int i10) {
        this.f5217a = i10;
        this.f5218b = y9Var;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f5217a) {
            case 0:
                y9 y9Var = this.f5218b;
                fa faVar = y9Var.W;
                faVar.f4699c = (TLRPC.InputPeer) obj;
                HashSet hashSet = faVar.v;
                hashSet.clear();
                if (faVar.K && faVar.G) {
                    faVar.G = false;
                }
                Utilities.Callback callback = faVar.W;
                if (callback != null) {
                    callback.run(faVar.f4699c);
                }
                ia iaVar = faVar.X;
                if (iaVar != null) {
                    iaVar.run(new HashSet(hashSet));
                }
                y9Var.g(true);
                return;
            case 1:
                fa faVar2 = this.f5218b.W;
                i10 = ((org.telegram.ui.ActionBar.e3) faVar2).currentAccount;
                faVar2.g1(new da(5, i10, (ArrayList) obj), new ai.r5(faVar2, 1), false);
                return;
            case 2:
                y9 y9Var2 = this.f5218b;
                fa faVar3 = y9Var2.W;
                HashSet hashSet2 = faVar3.v;
                hashSet2.add(Integer.valueOf(((ai.e9) obj).f854a));
                y9Var2.g(true);
                ia iaVar2 = faVar3.X;
                if (iaVar2 != null) {
                    iaVar2.run(new HashSet(hashSet2));
                    return;
                }
                return;
            default:
                String str = (String) obj;
                y9 y9Var3 = this.f5218b;
                if (str != null) {
                    y9Var3.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                y9Var3.I = str;
                y9Var3.g(false);
                return;
        }
    }
}
