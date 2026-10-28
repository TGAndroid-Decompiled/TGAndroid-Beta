package fi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class x8 implements Utilities.Callback {
    public final int f11961a;
    public final g9 f11962b;

    public x8(g9 g9Var, int i10) {
        this.f11961a = i10;
        this.f11962b = g9Var;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f11961a) {
            case 0:
                g9 g9Var = this.f11962b;
                n9 n9Var = g9Var.W;
                n9Var.f11312c = (TLRPC.InputPeer) obj;
                HashSet hashSet = n9Var.v;
                hashSet.clear();
                if (n9Var.K && n9Var.G) {
                    n9Var.G = false;
                }
                Utilities.Callback callback = n9Var.W;
                if (callback != null) {
                    callback.run(n9Var.f11312c);
                }
                q9 q9Var = n9Var.X;
                if (q9Var != null) {
                    q9Var.run(new HashSet(hashSet));
                }
                g9Var.g(true);
                return;
            case 1:
                n9 n9Var2 = this.f11962b.W;
                i10 = ((org.telegram.ui.ActionBar.k3) n9Var2).currentAccount;
                n9Var2.h1(new l9(5, i10, (ArrayList) obj), new di.e4(n9Var2, 1), false);
                return;
            case 2:
                g9 g9Var2 = this.f11962b;
                n9 n9Var3 = g9Var2.W;
                HashSet hashSet2 = n9Var3.v;
                hashSet2.add(Integer.valueOf(((di.a7) obj).f8375a));
                g9Var2.g(true);
                q9 q9Var2 = n9Var3.X;
                if (q9Var2 != null) {
                    q9Var2.run(new HashSet(hashSet2));
                    return;
                }
                return;
            default:
                String str = (String) obj;
                g9 g9Var3 = this.f11962b;
                if (str != null) {
                    g9Var3.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                g9Var3.I = str;
                g9Var3.g(false);
                return;
        }
    }
}
