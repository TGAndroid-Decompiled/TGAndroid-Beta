package gi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
public final class d8 implements u10 {
    public final int f12586a;
    public final o8 f12587b;

    public d8(o8 o8Var, int i3) {
        this.f12586a = i3;
        this.f12587b = o8Var;
    }

    @Override
    public final void a(Object obj) {
        int i3 = this.f12586a;
        o8 o8Var = this.f12587b;
        switch (i3) {
            case 0:
                t8 t8Var = o8Var.f13340a0;
                t8Var.k1 = (TLRPC.InputPeer) obj;
                HashSet hashSet = t8Var.f13628s1;
                hashSet.clear();
                if (t8Var.C1 && t8Var.f13634y1) {
                    t8Var.f13634y1 = false;
                }
                u10 u10Var = t8Var.O1;
                if (u10Var != null) {
                    u10Var.a(t8Var.k1);
                }
                w8 w8Var = t8Var.P1;
                if (w8Var != null) {
                    w8Var.a(new HashSet(hashSet));
                }
                o8Var.h(true);
                return;
            case 1:
                t8 t8Var2 = o8Var.f13340a0;
                int i10 = t8.V1;
                t8Var2.N0(new r8(5, t8Var2.f28583a, (ArrayList) obj), new ei.y3(t8Var2, 1), false);
                return;
            case 2:
                t8 t8Var3 = o8Var.f13340a0;
                HashSet hashSet2 = t8Var3.f13628s1;
                hashSet2.add(Integer.valueOf(((ei.s6) obj).f11008a));
                o8Var.h(true);
                w8 w8Var2 = t8Var3.P1;
                if (w8Var2 != null) {
                    w8Var2.a(new HashSet(hashSet2));
                    return;
                }
                return;
            default:
                String str = (String) obj;
                if (str != null) {
                    o8Var.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                o8Var.J = str;
                o8Var.h(false);
                return;
        }
    }
}
