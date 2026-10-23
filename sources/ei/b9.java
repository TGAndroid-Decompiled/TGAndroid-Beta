package ei;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class b9 implements Utilities.Callback {
    public final int f8802a;
    public final k9 f8803b;

    public b9(k9 k9Var, int i10) {
        this.f8802a = i10;
        this.f8803b = k9Var;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f8802a) {
            case 0:
                k9 k9Var = this.f8803b;
                r9 r9Var = k9Var.W;
                r9Var.f9762c = (TLRPC.InputPeer) obj;
                HashSet hashSet = r9Var.v;
                hashSet.clear();
                if (r9Var.K && r9Var.G) {
                    r9Var.G = false;
                }
                Utilities.Callback callback = r9Var.W;
                if (callback != null) {
                    callback.run(r9Var.f9762c);
                }
                u9 u9Var = r9Var.X;
                if (u9Var != null) {
                    u9Var.run(new HashSet(hashSet));
                }
                k9Var.g(true);
                return;
            case 1:
                r9 r9Var2 = this.f8803b.W;
                i10 = ((org.telegram.ui.ActionBar.h3) r9Var2).currentAccount;
                r9Var2.h1(new p9(5, i10, (ArrayList) obj), new ci.d4(r9Var2, 1), false);
                return;
            case 2:
                k9 k9Var2 = this.f8803b;
                r9 r9Var3 = k9Var2.W;
                HashSet hashSet2 = r9Var3.v;
                hashSet2.add(Integer.valueOf(((ci.a7) obj).f5152a));
                k9Var2.g(true);
                u9 u9Var2 = r9Var3.X;
                if (u9Var2 != null) {
                    u9Var2.run(new HashSet(hashSet2));
                    return;
                }
                return;
            default:
                String str = (String) obj;
                k9 k9Var3 = this.f8803b;
                if (str != null) {
                    k9Var3.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                k9Var3.I = str;
                k9Var3.g(false);
                return;
        }
    }
}
