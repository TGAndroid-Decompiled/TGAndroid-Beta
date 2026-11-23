package hi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public final class b8 implements y10 {
    public final int f14298a;
    public final k8 f14299b;

    public b8(k8 k8Var, int i7) {
        this.f14298a = i7;
        this.f14299b = k8Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f14298a;
        k8 k8Var = this.f14299b;
        switch (i7) {
            case 0:
                p8 p8Var = k8Var.f14930a0;
                p8Var.n1 = (TLRPC.InputPeer) obj;
                HashSet hashSet = p8Var.f15277v1;
                hashSet.clear();
                if (p8Var.F1 && p8Var.B1) {
                    p8Var.B1 = false;
                }
                y10 y10Var = p8Var.R1;
                if (y10Var != null) {
                    y10Var.a(p8Var.n1);
                }
                s8 s8Var = p8Var.S1;
                if (s8Var != null) {
                    s8Var.a(new HashSet(hashSet));
                }
                k8Var.h(true);
                return;
            case 1:
                p8 p8Var2 = k8Var.f14930a0;
                int i10 = p8.Y1;
                p8Var2.O0(new n8(5, p8Var2.f30173a, (ArrayList) obj), new fi.o3(p8Var2, 1), false);
                return;
            case 2:
                p8 p8Var3 = k8Var.f14930a0;
                HashSet hashSet2 = p8Var3.f15277v1;
                hashSet2.add(Integer.valueOf(((fi.i6) obj).f12144a));
                k8Var.h(true);
                s8 s8Var2 = p8Var3.S1;
                if (s8Var2 != null) {
                    s8Var2.a(new HashSet(hashSet2));
                    return;
                }
                return;
            default:
                String str = (String) obj;
                if (str != null) {
                    k8Var.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                k8Var.J = str;
                k8Var.h(false);
                return;
        }
    }
}
