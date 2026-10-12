package di;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m9 implements Utilities.Callback {
    public final int f7430a;
    public final x9 f7431b;

    public m9(x9 x9Var, int i10) {
        this.f7430a = i10;
        this.f7431b = x9Var;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f7430a) {
            case 0:
                x9 x9Var = this.f7431b;
                ea eaVar = x9Var.W;
                eaVar.f6916c = (TLRPC.InputPeer) obj;
                HashSet hashSet = eaVar.v;
                hashSet.clear();
                if (eaVar.K && eaVar.G) {
                    eaVar.G = false;
                }
                Utilities.Callback callback = eaVar.W;
                if (callback != null) {
                    callback.run(eaVar.f6916c);
                }
                ha haVar = eaVar.X;
                if (haVar != null) {
                    haVar.run(new HashSet(hashSet));
                }
                x9Var.g(true);
                return;
            case 1:
                ea eaVar2 = this.f7431b.W;
                i10 = ((org.telegram.ui.ActionBar.e3) eaVar2).currentAccount;
                eaVar2.h1(new ca(5, i10, (ArrayList) obj), new bi.d5(eaVar2, 1), false);
                return;
            case 2:
                x9 x9Var2 = this.f7431b;
                ea eaVar3 = x9Var2.W;
                HashSet hashSet2 = eaVar3.v;
                hashSet2.add(Integer.valueOf(((bi.p8) obj).f3473a));
                x9Var2.g(true);
                ha haVar2 = eaVar3.X;
                if (haVar2 != null) {
                    haVar2.run(new HashSet(hashSet2));
                    return;
                }
                return;
            default:
                String str = (String) obj;
                x9 x9Var3 = this.f7431b;
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
