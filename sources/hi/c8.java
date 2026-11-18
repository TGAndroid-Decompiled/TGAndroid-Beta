package hi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class c8 implements x10 {
    public final int f14317a;
    public final l8 f14318b;

    public c8(l8 l8Var, int i7) {
        this.f14317a = i7;
        this.f14318b = l8Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f14317a;
        l8 l8Var = this.f14318b;
        switch (i7) {
            case 0:
                q8 q8Var = l8Var.f14955a0;
                q8Var.n1 = (TLRPC.InputPeer) obj;
                HashSet hashSet = q8Var.f15291v1;
                hashSet.clear();
                if (q8Var.F1 && q8Var.B1) {
                    q8Var.B1 = false;
                }
                x10 x10Var = q8Var.R1;
                if (x10Var != null) {
                    x10Var.a(q8Var.n1);
                }
                t8 t8Var = q8Var.S1;
                if (t8Var != null) {
                    t8Var.a(new HashSet(hashSet));
                }
                l8Var.h(true);
                return;
            case 1:
                q8 q8Var2 = l8Var.f14955a0;
                int i10 = q8.Y1;
                q8Var2.O0(new o8(5, q8Var2.f30189a, (ArrayList) obj), new fi.o3(q8Var2, 1), false);
                return;
            case 2:
                q8 q8Var3 = l8Var.f14955a0;
                HashSet hashSet2 = q8Var3.f15291v1;
                hashSet2.add(Integer.valueOf(((fi.i6) obj).f12112a));
                l8Var.h(true);
                t8 t8Var2 = q8Var3.S1;
                if (t8Var2 != null) {
                    t8Var2.a(new HashSet(hashSet2));
                    return;
                }
                return;
            default:
                String str = (String) obj;
                if (str != null) {
                    l8Var.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                l8Var.J = str;
                l8Var.h(false);
                return;
        }
    }
}
