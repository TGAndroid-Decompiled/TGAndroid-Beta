package o0;

import java.util.ArrayList;
import n7.qa;
import p2.r;
public final class f implements q0.a {
    public final int f16159a;
    public final Object f16160b;

    public f(Object obj, int i10) {
        this.f16159a = i10;
        this.f16160b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f16159a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((qa) this.f16160b).c1(gVar);
                return;
            case 1:
                g gVar2 = (g) obj;
                synchronized (h.f16165c) {
                    try {
                        a0.k kVar = h.d;
                        ArrayList arrayList = (ArrayList) kVar.get((String) this.f16160b);
                        if (arrayList != null) {
                            kVar.remove((String) this.f16160b);
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
                r rVar = new r(new ArrayList(), new ArrayList());
                ((org.telegram.messenger.d) this.f16160b).a((p2.h) obj, rVar);
                return;
        }
    }
}
