package kh;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class d9 implements Utilities.Callback {
    public final int f15117a;
    public final n9 f15118b;

    public d9(n9 n9Var, int i9) {
        this.f15117a = i9;
        this.f15118b = n9Var;
    }

    @Override
    public final void run(Object obj) {
        int i9;
        switch (this.f15117a) {
            case 0:
                n9 n9Var = this.f15118b;
                t9 t9Var = n9Var.S;
                t9Var.f16098c = (TLRPC.InputPeer) obj;
                HashSet hashSet = t9Var.v;
                hashSet.clear();
                if (t9Var.G && t9Var.C) {
                    t9Var.C = false;
                }
                Utilities.Callback callback = t9Var.S;
                if (callback != null) {
                    callback.run(t9Var.f16098c);
                }
                w9 w9Var = t9Var.T;
                if (w9Var != null) {
                    w9Var.run(new HashSet(hashSet));
                }
                n9Var.g(true);
                return;
            case 1:
                t9 t9Var2 = this.f15118b.S;
                i9 = ((org.telegram.ui.ActionBar.f3) t9Var2).currentAccount;
                t9Var2.g1(new r9(5, i9, (ArrayList) obj), new ih.y3(t9Var2, 1), false);
                return;
            case 2:
                n9 n9Var2 = this.f15118b;
                t9 t9Var3 = n9Var2.S;
                HashSet hashSet2 = t9Var3.v;
                hashSet2.add(Integer.valueOf(((ih.o6) obj).f11901a));
                n9Var2.g(true);
                w9 w9Var2 = t9Var3.T;
                if (w9Var2 != null) {
                    w9Var2.run(new HashSet(hashSet2));
                    return;
                }
                return;
            default:
                String str = (String) obj;
                n9 n9Var3 = this.f15118b;
                if (str != null) {
                    n9Var3.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                n9Var3.E = str;
                n9Var3.g(false);
                return;
        }
    }
}
