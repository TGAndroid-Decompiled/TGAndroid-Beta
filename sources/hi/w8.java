package hi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
public final class w8 implements w10 {
    public final int f15682a;
    public final f9 f15683b;

    public w8(f9 f9Var, int i7) {
        this.f15682a = i7;
        this.f15683b = f9Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f15682a;
        f9 f9Var = this.f15683b;
        switch (i7) {
            case 0:
                k9 k9Var = f9Var.f14495a0;
                k9Var.n1 = (TLRPC.InputPeer) obj;
                HashSet hashSet = k9Var.f14795v1;
                hashSet.clear();
                if (k9Var.F1 && k9Var.B1) {
                    k9Var.B1 = false;
                }
                w10 w10Var = k9Var.R1;
                if (w10Var != null) {
                    w10Var.a(k9Var.n1);
                }
                n9 n9Var = k9Var.S1;
                if (n9Var != null) {
                    n9Var.a(new HashSet(hashSet));
                }
                f9Var.h(true);
                return;
            case 1:
                k9 k9Var2 = f9Var.f14495a0;
                int i10 = k9.Y1;
                k9Var2.O0(new i9(5, k9Var2.f30223a, (ArrayList) obj), new fi.o3(k9Var2, 1), false);
                return;
            case 2:
                k9 k9Var3 = f9Var.f14495a0;
                HashSet hashSet2 = k9Var3.f14795v1;
                hashSet2.add(Integer.valueOf(((fi.i6) obj).f12106a));
                f9Var.h(true);
                n9 n9Var2 = k9Var3.S1;
                if (n9Var2 != null) {
                    n9Var2.a(new HashSet(hashSet2));
                    return;
                }
                return;
            default:
                String str = (String) obj;
                if (str != null) {
                    f9Var.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                f9Var.J = str;
                f9Var.h(false);
                return;
        }
    }
}
