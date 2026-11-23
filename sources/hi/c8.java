package hi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public final class c8 implements y10 {
    public final int f14278a;
    public final l8 f14279b;

    public c8(l8 l8Var, int i7) {
        this.f14278a = i7;
        this.f14279b = l8Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f14278a;
        l8 l8Var = this.f14279b;
        switch (i7) {
            case 0:
                q8 q8Var = l8Var.f14942a0;
                q8Var.n1 = (TLRPC.InputPeer) obj;
                HashSet hashSet = q8Var.f15250v1;
                hashSet.clear();
                if (q8Var.F1 && q8Var.B1) {
                    q8Var.B1 = false;
                }
                y10 y10Var = q8Var.R1;
                if (y10Var != null) {
                    y10Var.a(q8Var.n1);
                }
                t8 t8Var = q8Var.S1;
                if (t8Var != null) {
                    t8Var.a(new HashSet(hashSet));
                }
                l8Var.h(true);
                return;
            case 1:
                q8 q8Var2 = l8Var.f14942a0;
                int i10 = q8.Y1;
                q8Var2.O0(new o8(5, q8Var2.f30139a, (ArrayList) obj), new fi.o3(q8Var2, 1), false);
                return;
            case 2:
                q8 q8Var3 = l8Var.f14942a0;
                HashSet hashSet2 = q8Var3.f15250v1;
                hashSet2.add(Integer.valueOf(((fi.i6) obj).f12104a));
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
