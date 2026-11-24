package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class n7b implements qac {
    public final byte a;
    public final v7b b;

    public n7b(v7b v7bVar, byte b) {
        this.a = b;
        this.b = v7bVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        v7b v7bVar = this.b;
        switch (b) {
            case 0:
                a8b a8bVar = v7bVar.a0;
                a8bVar.m1 = (TLRPC.InputPeer) obj;
                HashSet hashSet = a8bVar.u1;
                hashSet.clear();
                if (a8bVar.E1 && a8bVar.A1) {
                    a8bVar.A1 = false;
                }
                qac qacVar = a8bVar.Q1;
                if (qacVar != null) {
                    qacVar.a(a8bVar.m1);
                }
                g8b g8bVar = a8bVar.R1;
                if (g8bVar != null) {
                    g8bVar.a(new HashSet(hashSet));
                }
                v7bVar.h(true);
                return;
            case 1:
                a8b a8bVar2 = v7bVar.a0;
                int i = a8b.X1;
                a8bVar2.G0(new y7b(5, a8bVar2.a, (ArrayList) obj), new s48(a8bVar2, (byte) 1), false);
                return;
            case 2:
                a8b a8bVar3 = v7bVar.a0;
                HashSet hashSet2 = a8bVar3.u1;
                hashSet2.add(Integer.valueOf(((a4b) obj).a));
                v7bVar.h(true);
                g8b g8bVar2 = a8bVar3.R1;
                if (g8bVar2 != null) {
                    g8bVar2.a(new HashSet(hashSet2));
                    return;
                }
                return;
            default:
                String str = (String) obj;
                if (str != null && str.isEmpty()) {
                    str = null;
                }
                v7bVar.J = str;
                v7bVar.h(false);
                return;
        }
    }
}
