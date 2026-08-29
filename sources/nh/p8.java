package nh;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p8 implements Utilities.Callback {
    public final int f18359a;
    public final y8 f18360b;

    public p8(y8 y8Var, int i10) {
        this.f18359a = i10;
        this.f18360b = y8Var;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f18359a) {
            case 0:
                y8 y8Var = this.f18360b;
                e9 e9Var = y8Var.S;
                e9Var.f17604c = (TLRPC.InputPeer) obj;
                HashSet hashSet = e9Var.v;
                hashSet.clear();
                if (e9Var.G && e9Var.C) {
                    e9Var.C = false;
                }
                Utilities.Callback callback = e9Var.S;
                if (callback != null) {
                    callback.run(e9Var.f17604c);
                }
                h9 h9Var = e9Var.T;
                if (h9Var != null) {
                    h9Var.run(new HashSet(hashSet));
                }
                y8Var.g(true);
                return;
            case 1:
                e9 e9Var2 = this.f18360b.S;
                i10 = ((org.telegram.ui.ActionBar.f3) e9Var2).currentAccount;
                e9Var2.g1(new c9(5, i10, (ArrayList) obj), new lh.t3(e9Var2, 1), false);
                return;
            case 2:
                y8 y8Var2 = this.f18360b;
                e9 e9Var3 = y8Var2.S;
                HashSet hashSet2 = e9Var3.v;
                hashSet2.add(Integer.valueOf(((lh.l6) obj).f15893a));
                y8Var2.g(true);
                h9 h9Var2 = e9Var3.T;
                if (h9Var2 != null) {
                    h9Var2.run(new HashSet(hashSet2));
                    return;
                }
                return;
            default:
                String str = (String) obj;
                y8 y8Var3 = this.f18360b;
                if (str != null) {
                    y8Var3.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                y8Var3.E = str;
                y8Var3.g(false);
                return;
        }
    }
}
