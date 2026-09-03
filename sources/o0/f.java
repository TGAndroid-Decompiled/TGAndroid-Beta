package o0;

import java.util.ArrayList;
import n7.qa;
import org.telegram.messenger.d0;
import p2.r;
public final class f implements q0.a {
    public final int f16139a;
    public final Object f16140b;

    public f(Object obj, int i10) {
        this.f16139a = i10;
        this.f16140b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f16139a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((qa) this.f16140b).r0(gVar);
                return;
            case 1:
                g gVar2 = (g) obj;
                synchronized (h.f16145c) {
                    try {
                        a0.k kVar = h.d;
                        ArrayList arrayList = (ArrayList) kVar.get((String) this.f16140b);
                        if (arrayList != null) {
                            kVar.remove((String) this.f16140b);
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
                ((d0) this.f16140b).a((p2.h) obj, rVar);
                return;
        }
    }
}
