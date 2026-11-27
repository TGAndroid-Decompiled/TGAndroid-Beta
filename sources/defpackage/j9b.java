package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class j9b implements pcc {
    public final byte a;
    public final r9b b;

    public j9b(r9b r9bVar, byte b) {
        this.a = b;
        this.b = r9bVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        r9b r9bVar = this.b;
        switch (b) {
            case 0:
                w9b w9bVar = r9bVar.a0;
                w9bVar.m1 = (TLRPC.InputPeer) obj;
                HashSet hashSet = w9bVar.u1;
                hashSet.clear();
                if (w9bVar.E1 && w9bVar.A1) {
                    w9bVar.A1 = false;
                }
                pcc pccVar = w9bVar.Q1;
                if (pccVar != null) {
                    pccVar.a(w9bVar.m1);
                }
                dab dabVar = w9bVar.R1;
                if (dabVar != null) {
                    dabVar.a(new HashSet(hashSet));
                }
                r9bVar.h(true);
                return;
            case 1:
                w9b w9bVar2 = r9bVar.a0;
                int i = w9b.X1;
                w9bVar2.H0(new u9b(5, w9bVar2.a, (ArrayList) obj), new b68(w9bVar2, (byte) 1), false);
                return;
            case 2:
                w9b w9bVar3 = r9bVar.a0;
                HashSet hashSet2 = w9bVar3.u1;
                hashSet2.add(Integer.valueOf(((v5b) obj).a));
                r9bVar.h(true);
                dab dabVar2 = w9bVar3.R1;
                if (dabVar2 != null) {
                    dabVar2.a(new HashSet(hashSet2));
                    return;
                }
                return;
            default:
                String str = (String) obj;
                if (str != null && str.isEmpty()) {
                    str = null;
                }
                r9bVar.J = str;
                r9bVar.h(false);
                return;
        }
    }
}
