package lh;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class a9 implements Utilities.Callback {

    public final int f15649a;

    public final k9 f15650b;

    public a9(k9 k9Var, int i10) {
        this.f15649a = i10;
        this.f15650b = k9Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f15649a) {
            case 0:
                k9 k9Var = this.f15650b;
                q9 q9Var = k9Var.S;
                q9Var.f16594c = (TLRPC.InputPeer) obj;
                HashSet hashSet = q9Var.v;
                hashSet.clear();
                if (q9Var.G && q9Var.C) {
                    q9Var.C = false;
                }
                Utilities.Callback callback = q9Var.S;
                if (callback != null) {
                    callback.run(q9Var.f16594c);
                }
                t9 t9Var = q9Var.T;
                if (t9Var != null) {
                    t9Var.run(new HashSet(hashSet));
                }
                k9Var.g(true);
                break;
            case 1:
                q9 q9Var2 = this.f15650b.S;
                q9Var2.g1(new o9(5, ((org.telegram.ui.ActionBar.e3) q9Var2).currentAccount, (ArrayList) obj), new jh.u3(q9Var2, 1), false);
                break;
            case 2:
                k9 k9Var2 = this.f15650b;
                q9 q9Var3 = k9Var2.S;
                HashSet hashSet2 = q9Var3.v;
                hashSet2.add(Integer.valueOf(((jh.k6) obj).f13588a));
                k9Var2.g(true);
                t9 t9Var2 = q9Var3.T;
                if (t9Var2 != null) {
                    t9Var2.run(new HashSet(hashSet2));
                }
                break;
            default:
                String str = (String) obj;
                k9 k9Var3 = this.f15650b;
                if (str != null) {
                    k9Var3.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                k9Var3.E = str;
                k9Var3.g(false);
                break;
        }
    }
}
