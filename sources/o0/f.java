package o0;

import java.util.ArrayList;
import p2.p;
public final class f implements q0.a {
    public final int f18999a;
    public final Object f19000b;

    public f(Object obj, int i10) {
        this.f18999a = i10;
        this.f19000b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f18999a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((g9.l) this.f19000b).p(gVar);
                return;
            case 1:
                g gVar2 = (g) obj;
                synchronized (h.f19005c) {
                    try {
                        a0.k kVar = h.d;
                        ArrayList arrayList = (ArrayList) kVar.get((String) this.f19000b);
                        if (arrayList != null) {
                            kVar.remove((String) this.f19000b);
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                ((q0.a) arrayList.get(i10)).accept(gVar2);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            default:
                p pVar = new p(new ArrayList(), new ArrayList());
                ((org.telegram.messenger.d) this.f19000b).a((p2.g) obj, pVar);
                return;
        }
    }
}
