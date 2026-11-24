package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class m5b implements p8c {
    public final byte a;
    public final t5b b;

    public m5b(t5b t5bVar, byte b) {
        this.a = b;
        this.b = t5bVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        t5b t5bVar = this.b;
        switch (b) {
            case 0:
                y5b y5bVar = t5bVar.a0;
                y5bVar.m1 = (TLRPC.InputPeer) obj;
                HashSet hashSet = y5bVar.u1;
                hashSet.clear();
                if (y5bVar.E1 && y5bVar.A1) {
                    y5bVar.A1 = false;
                }
                p8c p8cVar = y5bVar.Q1;
                if (p8cVar != null) {
                    p8cVar.a(y5bVar.m1);
                }
                e6b e6bVar = y5bVar.R1;
                if (e6bVar != null) {
                    e6bVar.a(new HashSet(hashSet));
                }
                t5bVar.h(true);
                return;
            case 1:
                y5b y5bVar2 = t5bVar.a0;
                int i = y5b.X1;
                y5bVar2.G0(new w5b(5, y5bVar2.a, (ArrayList) obj), new p28(y5bVar2, (byte) 1), false);
                return;
            case 2:
                y5b y5bVar3 = t5bVar.a0;
                HashSet hashSet2 = y5bVar3.u1;
                hashSet2.add(Integer.valueOf(((z1b) obj).a));
                t5bVar.h(true);
                e6b e6bVar2 = y5bVar3.R1;
                if (e6bVar2 != null) {
                    e6bVar2.a(new HashSet(hashSet2));
                    return;
                }
                return;
            default:
                String str = (String) obj;
                if (str != null && str.isEmpty()) {
                    str = null;
                }
                t5bVar.J = str;
                t5bVar.h(false);
                return;
        }
    }
}
