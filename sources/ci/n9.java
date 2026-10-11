package ci;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n9 implements Utilities.Callback {
    public final int f5647a;
    public final y9 f5648b;

    public n9(y9 y9Var, int i10) {
        this.f5647a = i10;
        this.f5648b = y9Var;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f5647a) {
            case 0:
                y9 y9Var = this.f5648b;
                fa faVar = y9Var.W;
                faVar.f5095c = (TLRPC.InputPeer) obj;
                HashSet hashSet = faVar.v;
                hashSet.clear();
                if (faVar.K && faVar.G) {
                    faVar.G = false;
                }
                Utilities.Callback callback = faVar.W;
                if (callback != null) {
                    callback.run(faVar.f5095c);
                }
                ia iaVar = faVar.X;
                if (iaVar != null) {
                    iaVar.run(new HashSet(hashSet));
                }
                y9Var.g(true);
                return;
            case 1:
                fa faVar2 = this.f5648b.W;
                i10 = ((org.telegram.ui.ActionBar.e3) faVar2).currentAccount;
                faVar2.h1(new da(5, i10, (ArrayList) obj), new ai.s5(faVar2, 1), false);
                return;
            case 2:
                y9 y9Var2 = this.f5648b;
                fa faVar3 = y9Var2.W;
                HashSet hashSet2 = faVar3.v;
                hashSet2.add(Integer.valueOf(((ai.f9) obj).f1033a));
                y9Var2.g(true);
                ia iaVar2 = faVar3.X;
                if (iaVar2 != null) {
                    iaVar2.run(new HashSet(hashSet2));
                    return;
                }
                return;
            default:
                String str = (String) obj;
                y9 y9Var3 = this.f5648b;
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
