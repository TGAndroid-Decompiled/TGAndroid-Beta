package c5;

import java.util.ArrayList;
public final class z implements q0.a {
    public final int f4356a;
    public final Object f4357b;

    public z(Object obj, int i10) {
        this.f4356a = i10;
        this.f4357b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f4356a) {
            case 0:
                s sVar = new s(new ArrayList(), new ArrayList());
                ((org.telegram.messenger.c0) this.f4357b).a((h) obj, sVar);
                return;
            case 1:
                o0.g gVar = (o0.g) obj;
                if (gVar == null) {
                    gVar = new o0.g(-3);
                }
                ((of.b) this.f4357b).l0(gVar);
                return;
            default:
                o0.g gVar2 = (o0.g) obj;
                synchronized (o0.h.f14100c) {
                    try {
                        a0.l lVar = o0.h.d;
                        ArrayList arrayList = (ArrayList) lVar.get((String) this.f4357b);
                        if (arrayList != null) {
                            lVar.remove((String) this.f4357b);
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                ((q0.a) arrayList.get(i10)).accept(gVar2);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
