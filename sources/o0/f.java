package o0;

import java.util.ArrayList;
import n7.qa;
import org.telegram.messenger.d0;
import p2.q;
public final class f implements q0.a {
    public final int f16294a;
    public final Object f16295b;

    public f(Object obj, int i10) {
        this.f16294a = i10;
        this.f16295b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f16294a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((qa) this.f16295b).Y0(gVar);
                return;
            case 1:
                g gVar2 = (g) obj;
                synchronized (h.f16300c) {
                    try {
                        a0.k kVar = h.d;
                        ArrayList arrayList = (ArrayList) kVar.get((String) this.f16295b);
                        if (arrayList != null) {
                            kVar.remove((String) this.f16295b);
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
                q qVar = new q(new ArrayList(), new ArrayList());
                ((d0) this.f16295b).a((p2.h) obj, qVar);
                return;
        }
    }
}
