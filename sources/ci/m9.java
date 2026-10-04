package ci;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m9 implements Utilities.Callback {
    public final int f5579a;
    public final x9 f5580b;

    public m9(x9 x9Var, int i10) {
        this.f5579a = i10;
        this.f5580b = x9Var;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f5579a) {
            case 0:
                x9 x9Var = this.f5580b;
                ea eaVar = x9Var.W;
                eaVar.f5050c = (TLRPC.InputPeer) obj;
                HashSet hashSet = eaVar.v;
                hashSet.clear();
                if (eaVar.K && eaVar.G) {
                    eaVar.G = false;
                }
                Utilities.Callback callback = eaVar.W;
                if (callback != null) {
                    callback.run(eaVar.f5050c);
                }
                ha haVar = eaVar.X;
                if (haVar != null) {
                    haVar.run(new HashSet(hashSet));
                }
                x9Var.g(true);
                return;
            case 1:
                ea eaVar2 = this.f5580b.W;
                i10 = ((org.telegram.ui.ActionBar.f3) eaVar2).currentAccount;
                eaVar2.g1(new ca(5, i10, (ArrayList) obj), new ai.r5(eaVar2, 1), false);
                return;
            case 2:
                x9 x9Var2 = this.f5580b;
                ea eaVar3 = x9Var2.W;
                HashSet hashSet2 = eaVar3.v;
                hashSet2.add(Integer.valueOf(((ai.e9) obj).f922a));
                x9Var2.g(true);
                ha haVar2 = eaVar3.X;
                if (haVar2 != null) {
                    haVar2.run(new HashSet(hashSet2));
                    return;
                }
                return;
            default:
                String str = (String) obj;
                x9 x9Var3 = this.f5580b;
                if (str != null) {
                    x9Var3.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                x9Var3.I = str;
                x9Var3.g(false);
                return;
        }
    }
}
