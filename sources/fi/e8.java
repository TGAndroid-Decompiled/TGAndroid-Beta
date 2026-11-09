package fi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class e8 implements c20 {
    public final int f11929a;
    public final n8 f11930b;

    public e8(n8 n8Var, int i7) {
        this.f11929a = i7;
        this.f11930b = n8Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f11929a;
        n8 n8Var = this.f11930b;
        switch (i7) {
            case 0:
                s8 s8Var = n8Var.W;
                s8Var.f12803j1 = (TLRPC.InputPeer) obj;
                HashSet hashSet = s8Var.f12809r1;
                hashSet.clear();
                if (s8Var.B1 && s8Var.f12815x1) {
                    s8Var.f12815x1 = false;
                }
                c20 c20Var = s8Var.N1;
                if (c20Var != null) {
                    c20Var.a(s8Var.f12803j1);
                }
                v8 v8Var = s8Var.O1;
                if (v8Var != null) {
                    v8Var.a(new HashSet(hashSet));
                }
                n8Var.h(true);
                return;
            case 1:
                s8 s8Var2 = n8Var.W;
                int i10 = s8.U1;
                s8Var2.N0(new q8(5, s8Var2.f28621a, (ArrayList) obj), new di.x3(s8Var2, 1), false);
                return;
            case 2:
                s8 s8Var3 = n8Var.W;
                HashSet hashSet2 = s8Var3.f12809r1;
                hashSet2.add(Integer.valueOf(((di.s6) obj).f9732a));
                n8Var.h(true);
                v8 v8Var2 = s8Var3.O1;
                if (v8Var2 != null) {
                    v8Var2.a(new HashSet(hashSet2));
                    return;
                }
                return;
            default:
                String str = (String) obj;
                if (str != null) {
                    n8Var.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                n8Var.I = str;
                n8Var.h(false);
                return;
        }
    }
}
